package zombiemod.utils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zombiemod.items.ItemList;

public class RecipeManager {
	
	public static void init() {
		CraftingRecipes.init();
	}
	
	static class CraftingRecipes {
		static void init() {
			// Medkit
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.itemMedkit,
					2),
					new Object[] { ItemList.itemAlcohol, ItemList.itemGauze });
			
			// Gauze
			GameRegistry.addRecipe(new ItemStack(ItemList.itemGauze, 1),
					new Object[] { "S S", " P ", "S S", 'S', Items.string, 'P',
							Items.paper });
			
			// Alcohol
			GameRegistry.addShapelessRecipe(new ItemStack(ItemList.itemAlcohol,
					1), new Object[] { Items.glass_bottle, Items.water_bucket,
					Items.wheat_seeds, Items.clay_ball });
			
			// Nail
			GameRegistry
					.addRecipe(new ItemStack(ItemList.itemNail, 2),
							new Object[] { " I ", " I ", "   ", 'I',
									Items.iron_ingot });
			GameRegistry
					.addRecipe(new ItemStack(ItemList.itemNail, 2),
							new Object[] { "   ", " I ", " I ", 'I',
									Items.iron_ingot });
			// Nail Group
			GameRegistry
					.addRecipe(new ItemStack(ItemList.itemNailGroup, 1),
							new Object[] { "NN ", "NN ", "   ", 'N',
									ItemList.itemNail });
			GameRegistry
					.addRecipe(new ItemStack(ItemList.itemNailGroup, 1),
							new Object[] { " NN", " NN", "   ", 'N',
									ItemList.itemNail });
			
			// Woodbox
			GameRegistry.addRecipe(new ItemStack(ItemList.itemWoodBox, 1),
					new Object[] { "W W", " W ", "   ", 'W', Blocks.planks });
			GameRegistry.addRecipe(new ItemStack(ItemList.itemWoodBox, 1),
					new Object[] { "   ", "W W", " W ", 'W', Blocks.planks });
			
			// Metal Parts
			GameRegistry.addShapelessRecipe(new ItemStack(
					ItemList.itemMetalParts, 1), new Object[] {
					ItemList.itemWoodBox, ItemList.itemNailGroup });
		}
	}
}