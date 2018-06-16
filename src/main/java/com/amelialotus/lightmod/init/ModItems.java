package com.amelialotus.lightmod.init;

import java.util.ArrayList;
import java.util.List;

import com.amelialotus.lightmod.blocks.door.ItemDoor;

import net.minecraft.item.Item;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	//CTRL + Click Tool Material to figure out pre-made ones
	//public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	
	//Items
	//public static final Item RUBY = new ItemBase("ruby");
	//public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	
	//Tools
	//public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	//public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	//public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	//public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	//public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static ItemDoor ITEM_DOOR = new ItemDoor("lighted_door_white", ModBlocks.BLOCK_DOOR);

}
