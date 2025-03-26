package com.loxding.fwendo.item;

import com.loxding.fwendo.Fwendo;
import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item MOD_WIKIS = LavenderBookItem.registerForBook(id("mod_wikis"), new Item.Settings());

    public static Identifier id(String path) {
        return new Identifier(Fwendo.MOD_ID, path);
    }

    private static void itemGroupFunctional(FabricItemGroupEntries entries) {
        entries.add(MOD_WIKIS);
    }

    public static void registerModItems() {
        Fwendo.LOGGER.info("Registering Mod Items for " + Fwendo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::itemGroupFunctional);
    }
}