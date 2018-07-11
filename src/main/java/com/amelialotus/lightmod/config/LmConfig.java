package com.amelialotus.lightmod.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.amelialotus.lightmod.util.Reference;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LmConfig 
{
	
	private static Configuration config = null;
	
	public static final String CATEGORY_NAME_BLOCKS = "blocks";
	
	public static double propertyStuff;
	
	public static void preInit() {
		File configFile = new File(Loader.instance().getConfigDir(), "LightMod.cfg");
		config = new Configuration(configFile);
	}
	
	public static Configuration getConfig() {
		return config;
	}
	
	public static void clientPreInit() {
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}
	
	public static void syncFromFiles() {
		syncConfig(true, true);
	}
	
	public static void syncFromGui() {
		syncConfig(false, true);		
	}
	
	public static void syncFromFields() {
		syncConfig(false, false);		
	}
	
	private static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig) {
		if(loadFromConfigFile)
			config.load();
		
		//Fake stuff. Just placeholders until I can fix it.
		Property property = config.get(CATEGORY_NAME_BLOCKS, "lm stuff", 1);
		property.setLanguageKey("gui.config.blocks.lm_stuff.name");
		property.setComment(I18n.format("gui.config.blocks.lm_stuff.comment"));
		property.setMinValue(10);
		property.setMaxValue(200);
		
		List<String> propertyOrderBlocks = new ArrayList<String>();
		propertyOrderBlocks.add(property.getName());
		
		config.setCategoryPropertyOrder(CATEGORY_NAME_BLOCKS, propertyOrderBlocks);
		
		if(readFieldsFromConfig) {
			propertyStuff = property.getInt();
		}
		
		property.set(propertyStuff);
		
		if(config.hasChanged())
			config.save();
	}
	
	public static class ConfigEventHandler {
		
		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			if(event.getModID().equals(Reference.MOD_ID)) {
				syncFromGui();
			}
		}
	}
	
}
