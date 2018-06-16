package com.amelialotus.lightmod.block;

import com.amelialotus.lightmod.LightMod;
import com.amelialotus.lightmod.init.BlockInit;
import com.amelialotus.lightmod.init.ItemInit;
import com.amelialotus.lightmod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LightMod.tabLightMod);
		setLightLevel(1.0F);
		
		//Registers to the BlockInit
		BlockInit.BLOCKS.add(this);
		//Registers to ItemInit
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	

	@Override
	public void registerModels() 
	{
		LightMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");			
	}
}
