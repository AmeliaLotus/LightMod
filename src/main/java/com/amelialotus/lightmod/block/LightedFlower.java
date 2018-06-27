package com.amelialotus.lightmod.block;

import com.amelialotus.lightmod.LightMod;
import com.amelialotus.lightmod.init.BlockInit;
import com.amelialotus.lightmod.init.ItemInit;
import com.amelialotus.lightmod.util.interfaces.IHasModel;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class LightedFlower extends BlockBush implements IHasModel
{
	public LightedFlower(Material material) {
		
		super(material);
		String name = "lighted_flower_blue";
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LightMod.tabLightMod);
		setLightLevel(1.0F);
		this.setResistance(2000.0F);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		LightMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");		
	}
		
}
