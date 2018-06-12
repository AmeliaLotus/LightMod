package com.amelialotus.lightmod.blocks;

import java.util.Random;

import com.amelialotus.lightmod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;


public class LightedGlassBlock extends BlockBase
{
	//public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);
	public LightedGlassBlock(String name, Material material) 
	{
		super(name, material);		
		// set the creative tab. Pro-modders add their own creative tab.
		this.setCreativeTab(Main.tabLightMod);
		// Walk Over Sound Type
		this.setSoundType(SoundType.GLASS);
		/*
		 * How long it takes to break. Wiki:
		 * minecraftmodcustomstuff.wikia.com/wiki/Hardness
		 */
		this.setHardness(0.3F);
		/*
		 * How resistant your block is to explosives. wiki:
		 * minecraft.gamepedia.com/Explosion
		 */
		this.setResistance(2000.0F);
		/*
		 * How much light the block will give! wiki: minecraft.gamepedia.com/Light
		 */
		this.setLightLevel(1.0F);
		/*
		 * How easy it is for light to pass through blocks. 0 = light passes through.
		 */
		this.setLightOpacity(0);	
		
	} // end constructor
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	// Somehow makes the block act like glass...
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	
	// Somehow makes the block act like glass...
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	protected boolean canSilkHarvest() {
		return true;
	}
}
