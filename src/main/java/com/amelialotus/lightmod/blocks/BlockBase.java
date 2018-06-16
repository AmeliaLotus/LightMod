package com.amelialotus.lightmod.blocks;

import com.amelialotus.lightmod.Main;
import com.amelialotus.lightmod.init.ModBlocks;
import com.amelialotus.lightmod.init.ModItems;
import com.amelialotus.lightmod.util.IHasModel;

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
				setCreativeTab(Main.tabLightMod);
				setLightLevel(1.0F);
				
				ModBlocks.BLOCKS.add(this);
				ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
			}

		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");			
		}

}
