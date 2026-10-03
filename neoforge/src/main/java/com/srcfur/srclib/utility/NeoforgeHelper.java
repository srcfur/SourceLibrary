package com.srcfur.srclib.utility;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.HashSet;
import java.util.function.Supplier;

public class NeoforgeHelper {
    public static BlockEntityProperties<BlockEntity> registerBlockEntity(Identifier id, Supplier<BlockEntityProperties<BlockEntity>> type){
        BlockEntityProperties<BlockEntity> props = type.get();
        props.handle(()-> Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                id,
                new BlockEntityType<BlockEntity>(
                        props.supplier::apply,
                        new HashSet<>(props.blocks)
                )));
        return props;
    }
}
