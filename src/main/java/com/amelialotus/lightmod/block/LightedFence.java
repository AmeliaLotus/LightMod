package com.amelialotus.lightmod.block;

import com.amelialotus.lightmod.LightMod;
import com.amelialotus.lightmod.init.BlockInit;
import com.amelialotus.lightmod.init.ItemInit;
import com.amelialotus.lightmod.util.IHasModel;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class LightedFence extends BlockFence implements IHasModel
{

	public LightedFence(Material materialIn, MapColor mapColorIn) {
		super(materialIn, mapColorIn);
		String name = "lighted_fence";
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LightMod.tabLightMod);
		setLightLevel(1.0F);
		this.setHardness(2);
		this.setResistance(2000.0F);
		this.useNeighborBrightness = true;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		LightMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");		
	}	
}
