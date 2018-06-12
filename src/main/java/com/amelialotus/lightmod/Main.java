package com.amelialotus.lightmod;

import com.amelialotus.lightmod.init.ModBlocks;
import com.amelialotus.lightmod.init.ModRecipes;
import com.amelialotus.lightmod.proxy.CommonProxy;
import com.amelialotus.lightmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	/*
	 * Forge Modloader Initialization Event
	 */
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		//Call this to initialize the smelting recipes!
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabLightMod = new CreativeTabs("tab_LightMod") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.LIGHTED_GLASS_BLOCK);
		}
	};

}
