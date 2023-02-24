package com.fawnflipper.myfirstfabric.block;

import com.fawnflipper.myfirstfabric.MyFirstFabricMode;
import com.fawnflipper.myfirstfabric.item.ModItemGroups;
import com.fawnflipper.myfirstfabric.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PLASTIC = registerBlock("plastic_block", new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f)), ModItemGroups.MATERIAL);

    private static Block registerBlock(String id, Block block, ItemGroup itemGroup) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()), itemGroup);
        return Registry.register(Registries.BLOCK, new Identifier(MyFirstFabricMode.MOD_ID, id), block);
    }
    private static Block registerBlock(String id, Block block) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(MyFirstFabricMode.MOD_ID, id), block);
    }
    public static void register() { MyFirstFabricMode.LOGGER.debug("Registering blocks for:" + MyFirstFabricMode.MOD_ID); }
}
