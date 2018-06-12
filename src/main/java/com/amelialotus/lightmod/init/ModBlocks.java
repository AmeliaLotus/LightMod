package com.amelialotus.lightmod.init;

import java.util.ArrayList;
import java.util.List;

import com.amelialotus.lightmod.blocks.BlockBase;
import com.amelialotus.lightmod.blocks.LightedGlassBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	/* New blocks go here!!
	 * use "new BlockBase" instead of "new RubyBlock" for a basic block.
	 * Make a new class under blocks and use RubyBlock as an example!
	 * If using a new class, make sure to import it here!
	 */
	//public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	
	//Glass Blocks!
	public static final Block LIGHTED_GLASS_BLOCK = new LightedGlassBlock("lighted_glass_block", Material.GLASS);
	public static final Block LIGHTED_GLASS_BLACK = new LightedGlassBlock("lighted_glass_black", Material.GLASS);
	public static final Block LIGHTED_GLASS_ORANGE = new LightedGlassBlock("lighted_glass_orange", Material.GLASS);
	public static final Block LIGHTED_GLASS_BLUE = new LightedGlassBlock("lighted_glass_blue", Material.GLASS);
	public static final Block LIGHTED_GLASS_LIGHTBLUE = new LightedGlassBlock("lighted_glass_lightblue", Material.GLASS);
	public static final Block LIGHTED_GLASS_BROWN = new LightedGlassBlock("lighted_glass_brown", Material.GLASS);
	public static final Block LIGHTED_GLASS_CYAN = new LightedGlassBlock("lighted_glass_cyan", Material.GLASS);
	public static final Block LIGHTED_GLASS_GRAY = new LightedGlassBlock("lighted_glass_gray", Material.GLASS);
	public static final Block LIGHTED_GLASS_GREEN = new LightedGlassBlock("lighted_glass_green", Material.GLASS);
	public static final Block LIGHTED_GLASS_LIGHTGRAY = new LightedGlassBlock("lighted_glass_lightgray", Material.GLASS);
	public static final Block LIGHTED_GLASS_LIME = new LightedGlassBlock("lighted_glass_lime", Material.GLASS);
	public static final Block LIGHTED_GLASS_MAGENTA = new LightedGlassBlock("lighted_glass_magenta", Material.GLASS);
	public static final Block LIGHTED_GLASS_YELLOW = new LightedGlassBlock("lighted_glass_yellow", Material.GLASS);
	public static final Block LIGHTED_GLASS_PINK = new LightedGlassBlock("lighted_glass_pink", Material.GLASS);
	public static final Block LIGHTED_GLASS_PURPLE = new LightedGlassBlock("lighted_glass_purple", Material.GLASS);
	public static final Block LIGHTED_GLASS_RED = new LightedGlassBlock("lighted_glass_red", Material.GLASS);
	
	//Glass Panes!
	
}
