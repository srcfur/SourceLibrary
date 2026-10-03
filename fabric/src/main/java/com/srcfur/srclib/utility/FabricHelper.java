package com.srcfur.srclib.utility;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.util.function.Supplier;

public class FabricHelper {
    public static BlockEntityProperties<BlockEntity> registerBlockEntity(Identifier id, Supplier<BlockEntityProperties<BlockEntity>> type){
        BlockEntityProperties<BlockEntity> props = type.get();
        props.handle(()-> Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                id,
                FabricBlockEntityTypeBuilder.create(props.supplier::apply, props.blocks.toArray(new Block[0])).build()
        ));
        return props;
    }
}
