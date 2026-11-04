package com.srcfur.srclib.utility;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class NeoforgeHelper {
    public static BlockEntityProperties<BlockEntity> registerBlockEntity(ResourceLocation id, Supplier<BlockEntityProperties<BlockEntity>> type) {
        BlockEntityProperties<BlockEntity> props = type.get();
        // In 1.21.1 BlockEntityType is created through its Builder (the constructor is not public)
        props.handle(() -> Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                id,
                BlockEntityType.Builder.<BlockEntity>of(props.supplier::apply, props.blocks.toArray(new Block[0])).build(null)
        ));
        return props;
    }
}
