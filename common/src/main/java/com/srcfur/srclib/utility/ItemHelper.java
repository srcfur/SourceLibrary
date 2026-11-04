package com.srcfur.srclib.utility;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ItemHelper<T extends Item> extends GenericHelper<T> {
    public ItemHelper(ResourceLocation identifier, Supplier<T> itemSupplier) {
        super(identifier, itemSupplier);
    }
}
