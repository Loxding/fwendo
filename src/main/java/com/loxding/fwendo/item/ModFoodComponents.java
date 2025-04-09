package com.loxding.fwendo.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHEVON = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_CHEVON = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
}