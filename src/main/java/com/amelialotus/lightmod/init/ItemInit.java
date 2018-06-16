package com.amelialotus.lightmod.init;

import java.util.ArrayList;
import java.util.List;

import com.amelialotus.lightmod.blocks.door.ItemDoor;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static ItemDoor ITEM_DOOR = new ItemDoor("mydoor", BlockInit.BLOCK_DOOR);
}
