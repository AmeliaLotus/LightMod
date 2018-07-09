package com.amelialotus.lightmod.proxy;

import com.amelialotus.lightmod.util.InitConfig;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy 
{
	public void preInit() {
		InitConfig.clientPreInit();
	}
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
