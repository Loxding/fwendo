package com.loxding.fwendo.item;

import com.loxding.fwendo.Fwendo;
import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item MOD_WIKIS = LavenderBookItem.registerForBook(id("mod_wikis"), new Item.Settings());
    public static final Item CHEVON = registerItem("chevon",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEVON)));
    public static final Item COOKED_CHEVON = registerItem("cooked_chevon",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CHEVON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Fwendo.MOD_ID, name), item);
    }

    public static Identifier id(String path) {
        return new Identifier(Fwendo.MOD_ID, path);
    }

    private static void itemGroupFunctional(FabricItemGroupEntries entries) {
        entries.add(MOD_WIKIS);
    }

    private static void itemGroupFoodAndDrink(FabricItemGroupEntries entries) {
        entries.add(CHEVON);
        entries.add(COOKED_CHEVON);
    }

    public static void registerModItems() {
        Fwendo.LOGGER.info("Registering Mod Items for " + Fwendo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::itemGroupFunctional);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupFoodAndDrink);
    }
}