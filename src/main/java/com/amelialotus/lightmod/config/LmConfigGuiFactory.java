package com.amelialotus.lightmod.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.amelialotus.lightmod.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

public class LmConfigGuiFactory implements IModGuiFactory{

	@Override
	public void initialize(Minecraft minecraftInstance) {
	}

	@Override
	public boolean hasConfigGui() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return null;
	}

	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return LmConfigGui.class;
	}
	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static class LmConfigGui extends GuiConfig 
	{
		public LmConfigGui(GuiScreen parentScreen) {
			super(parentScreen, getConfigElements(), Reference.MOD_ID, false, false, I18n.format("gui.config.name.main_title"));
		}

		private static List<IConfigElement> getConfigElements() {
			List<IConfigElement> list = new ArrayList<IConfigElement>();
			list.add(new DummyCategoryElement(I18n.format("gui.config.category.blocks"), "gui.config.category.blocks", CategoryEntryBlocks.class));
			return list;
		}
		
		public static class CategoryEntryBlocks extends CategoryEntry {

			public CategoryEntryBlocks(GuiConfig owningScreen, GuiConfigEntries owningEntryList,
					IConfigElement configElement) {
				super(owningScreen, owningEntryList, configElement);
				// TODO Auto-generated constructor stub
			}
			
			@Override
			protected GuiScreen buildChildScreen() {
				Configuration config = LmConfig.getConfig();
				ConfigElement categoryBlocks = new ConfigElement(config.getCategory(LmConfig.CATEGORY_NAME_BLOCKS));
				List<IConfigElement> propertiesOnScreen = categoryBlocks.getChildElements();
				String windowTitle= I18n.format("gui.config.category.blocks");
				
				return new GuiConfig(owningScreen, propertiesOnScreen, owningScreen.modID, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, windowTitle);
			}
			
		}
		
	}

}
