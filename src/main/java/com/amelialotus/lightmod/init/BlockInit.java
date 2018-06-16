package com.amelialotus.lightmod.init;

import java.util.ArrayList;
import java.util.List;

import com.amelialotus.lightmod.block.LightedGlassPane;
import com.amelialotus.lightmod.block.door.BlockDoor;
import com.amelialotus.lightmod.block.LightedGlassBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	/* New blocks go here!!
	 * use "new BlockBase" instead of "new RubyBlock" for a basic block.
	 * Make a new class under blocks and use RubyBlock as an example!
	 * If using a new class, make sure to import it here!
	 */
	//public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);

	
	//Glass Door!!
	public static final BlockDoor BLOCK_DOOR = new BlockDoor("mydoor", Material.IRON, true, 1F, 2000.F);
	
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
	public static final Block LIGHTED_PANE_WHITE = new LightedGlassPane("lighted_pane_white", Material.GLASS);
	public static final Block LIGHTED_PANE_BLACK = new LightedGlassPane("lighted_pane_black", Material.GLASS);
	public static final Block LIGHTED_PANE_ORANGE = new LightedGlassPane("lighted_pane_orange", Material.GLASS);
	public static final Block LIGHTED_PANE_BLUE = new LightedGlassPane("lighted_pane_blue", Material.GLASS);
	public static final Block LIGHTED_PANE_LIGHTBLUE = new LightedGlassPane("lighted_pane_lightblue", Material.GLASS);
	public static final Block LIGHTED_PANE_BROWN = new LightedGlassPane("lighted_pane_brown", Material.GLASS);
	public static final Block LIGHTED_PANE_CYAN = new LightedGlassPane("lighted_pane_cyan", Material.GLASS);
	public static final Block LIGHTED_PANE_GRAY = new LightedGlassPane("lighted_pane_gray", Material.GLASS);
	public static final Block LIGHTED_PANE_GREEN = new LightedGlassPane("lighted_pane_green", Material.GLASS);
	public static final Block LIGHTED_PANE_LIGHTGRAY = new LightedGlassPane("lighted_pane_lightgray", Material.GLASS);
	public static final Block LIGHTED_PANE_LIME = new LightedGlassPane("lighted_pane_lime", Material.GLASS);
	public static final Block LIGHTED_PANE_MAGENTA = new LightedGlassPane("lighted_pane_magenta", Material.GLASS);
	public static final Block LIGHTED_PANE_YELLOW = new LightedGlassPane("lighted_pane_yellow", Material.GLASS);
	public static final Block LIGHTED_PANE_PINK = new LightedGlassPane("lighted_pane_pink", Material.GLASS);
	public static final Block LIGHTED_PANE_PURPLE = new LightedGlassPane("lighted_pane_purple", Material.GLASS);
	public static final Block LIGHTED_PANE_RED = new LightedGlassPane("lighted_pane_red", Material.GLASS);

}
