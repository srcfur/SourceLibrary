package com.srcfur.srclib.utility;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.component.DataComponentType;

import java.util.function.Supplier;

public class DataComponentHelper<T> extends GenericHelper<DataComponentType<T>> {
    public DataComponentHelper(ResourceLocation identifier, Supplier<DataComponentType<T>> itemSupplier) {
        super(identifier, itemSupplier);
    }
}
