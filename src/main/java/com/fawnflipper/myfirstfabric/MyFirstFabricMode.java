package com.fawnflipper.myfirstfabric;

import com.fawnflipper.myfirstfabric.block.ModBlocks;
import com.fawnflipper.myfirstfabric.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstFabricMode implements ModInitializer {
	public static final String MOD_ID = "myfirstfabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
	}
}
