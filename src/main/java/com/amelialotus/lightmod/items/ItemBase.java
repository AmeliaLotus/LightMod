package com.amelialotus.lightmod.items;

import com.amelialotus.lightmod.LightMod;
import com.amelialotus.lightmod.init.ItemInit;
import com.amelialotus.lightmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LightMod.tabLightMod);
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		LightMod.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
