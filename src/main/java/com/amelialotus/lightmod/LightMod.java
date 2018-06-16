package com.amelialotus.lightmod;

import com.amelialotus.lightmod.init.BlockInit;
import com.amelialotus.lightmod.init.ItemInit;
import com.amelialotus.lightmod.proxy.CommonProxy;
import com.amelialotus.lightmod.util.Reference;
import com.amelialotus.lightmod.util.handlers.RegistryHandler;

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
public class LightMod 
{
	@Instance
	public static LightMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
		
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries();}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}
	
	public static CreativeTabs tabLightMod = new CreativeTabs("tab_LightMod") 
	{		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockInit.LIGHTED_GLASS_BLOCK);
		}
	};

}
