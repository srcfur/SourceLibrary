package com.srcfur.srclib.utility;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;

import java.util.function.Supplier;

public class FluidHelper<T extends Fluid> extends GenericHelper<T> {
    public FluidHelper(ResourceLocation identifier, Supplier<T> itemSupplier) {
        super(identifier, itemSupplier);
    }
}
