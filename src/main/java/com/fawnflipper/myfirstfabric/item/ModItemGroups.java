package com.fawnflipper.myfirstfabric.item;

import com.fawnflipper.myfirstfabric.MyFirstFabricMode;
import com.fawnflipper.myfirstfabric.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PISTOLS = FabricItemGroup.builder(new Identifier(MyFirstFabricMode.MOD_ID, "pistols")).icon(() -> new ItemStack(ModItems.USP_ITEM)).build();
    public static final ItemGroup MATERIAL = FabricItemGroup.builder(new Identifier(MyFirstFabricMode.MOD_ID, "material")).icon(() -> new ItemStack(ModBlocks.PLASTIC)).build();
}
