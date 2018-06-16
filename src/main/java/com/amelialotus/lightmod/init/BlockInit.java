package com.amelialotus.lightmod.init;

import java.util.ArrayList;
import java.util.List;

import com.amelialotus.lightmod.blocks.door.BlockDoor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final BlockDoor BLOCK_DOOR = new BlockDoor("mydoor", Material.IRON, true, 1F);
	
}
