package com.fawnflipper.myfirstfabric.item;

import com.fawnflipper.myfirstfabric.MyFirstFabricMode;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item USP_ITEM = registerItem("usp", new Item(new FabricItemSettings()), ModItemGroups.PISTOLS);
    public static final Item PLASTIC_ITEM = registerItem("plastic", new Item(new FabricItemSettings()), ModItemGroups.MATERIAL);

    public static Item registerItem(String id, Item item) { return Registry.register(Registries.ITEM, new Identifier(MyFirstFabricMode.MOD_ID, id), item); }
    public static Item registerItem(String id, Item item, ItemGroup itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(MyFirstFabricMode.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));

        return returnItem;
    }


    public static void register() { MyFirstFabricMode.LOGGER.debug("Registering items for:" + MyFirstFabricMode.MOD_ID); }
}
