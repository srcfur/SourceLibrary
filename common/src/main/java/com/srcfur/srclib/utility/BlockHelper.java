package com.srcfur.srclib.utility;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BlockHelper<T extends Block> extends GenericHelper<T> {
    public BlockHelper(ResourceLocation identifier, Supplier<T> itemSupplier) {
        super(identifier, itemSupplier);
    }
}
