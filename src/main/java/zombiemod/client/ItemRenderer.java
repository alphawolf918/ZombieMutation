package zombiemod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import zombiemod.items.ItemList;
import zombiemod.utils.ModInfo;

public class ItemRenderer {
	
	public static void init() {
		ItemRenderer.registerItemRenderers();
	}
	
	private static void registerItemRenderers() {
		ItemRenderer.registerItem(ItemList.itemCoin);
		ItemRenderer.registerItem(ItemList.itemMedkit);
		ItemRenderer.registerItem(ItemList.itemAlcohol);
		ItemRenderer.registerItem(ItemList.itemGauze);
		ItemRenderer.registerItem(ItemList.itemNail);
		ItemRenderer.registerItem(ItemList.itemMetalParts);
		ItemRenderer.registerItem(ItemList.itemWoodBox);
		ItemRenderer.registerItem(ItemList.itemNailGroup);
	}
	
	private static void registerItem(Item item) {
		Minecraft mc = Minecraft.getMinecraft();
		RenderItem renderItem = mc.getRenderItem();
		ItemModelMesher itemModel = renderItem.getItemModelMesher();
		String itemName = item.getUnlocalizedName().substring(5);
		itemModel.register(item, 0, new ModelResourceLocation(ModInfo.MODID
				+ ":" + itemName, "inventory"));
	}
}