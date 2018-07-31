package com.amelialotus.lightmod.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LightedGlassBlock extends BlockBase 
{
	public LightedGlassBlock(String name, Material material) 
	{
		super(name, material);		
		// set the creative tab. Pro-modders add their own creative tab.
		//this.setCreativeTab(Main.tabLightMod);
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
		//this.setLightLevel(1.0F);
		/*
		 * How easy it is for light to pass through blocks. 0 = light passes through.
		 */
		this.setLightOpacity(0);	
		
		//setCreativeTab(LightMod.tabLightMod);
		
	} // end constructor
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	// Somehow makes the block act like glass... If there's a purple thing under the "glass" block, this needs to be added.
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
	
	@Override
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
	    return world.getBlockState(pos.offset(side)).getBlock() == this;
	}
	
}
