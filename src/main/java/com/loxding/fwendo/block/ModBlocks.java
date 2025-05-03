package com.loxding.fwendo.block;

import com.loxding.fwendo.Fwendo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block HAZARD_BLOCK = registerBlock("hazard_block",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block METAL_GRATE = registerBlock("metal_grate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().sounds(BlockSoundGroup.METAL)));


    public static final Block METAL_GRATE_STAIRS = registerBlock("metal_grate_stairs",
            new StairsBlock(ModBlocks.METAL_GRATE.getDefaultState(), FabricBlockSettings
                    .copyOf(Blocks.IRON_BLOCK).nonOpaque().sounds(BlockSoundGroup.METAL)));
    public static final Block METAL_GRATE_SLAB = registerBlock("metal_grate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().sounds(BlockSoundGroup.METAL)));
    public static final Block METAL_GRATE_STAIRS_FANCY = registerBlock("metal_grate_stairs_fancy",
            new StairsBlock(ModBlocks.METAL_GRATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .nonOpaque().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Fwendo.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Fwendo.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        Fwendo.LOGGER.info("Registering ModBlocks for " + Fwendo.MOD_ID);
    }
}
