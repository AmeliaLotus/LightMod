package com.amelialotus.lightmod.util;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class InitConfig 
{
	public static Configuration config;
	
	public static final String CATEGORY_NAME_BLOCKS = "blocks";
	
	public static int machineCooldownBasic;
	public static int machineCooldownAdvanced;
	
	
	public static void preInit() {
		File configFile = new File(Loader.instance().getConfigDir(), "lm.cfg");
		config = new Configuration(configFile);
		syncFromFiles();
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
		
		if(readFieldsFromConfig) {
			
		}
		
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
