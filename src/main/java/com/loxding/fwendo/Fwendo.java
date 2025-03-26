package com.loxding.fwendo;

import com.loxding.fwendo.item.ModItems;
import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.wispforest.lavender.Lavender.id;

public class Fwendo implements ModInitializer {
	public static final String MOD_ID = "fwendo";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Ello Fwendo's");
		ModItems.registerModItems();
	}
}
