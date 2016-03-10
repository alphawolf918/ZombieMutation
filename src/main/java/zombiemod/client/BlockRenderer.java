package zombiemod.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import zombiemod.blocks.BlockList;
import zombiemod.utils.ModInfo;

public class BlockRenderer {
	
	public static void init() {
		BlockRenderer.registerBlockRenderers();
	}
	
	private static void registerBlockRenderers() {
		BlockRenderer.registerBlock(BlockList.blockBarrier);
	}
	
	private static void registerBlock(Block block) {
		Minecraft mc = Minecraft.getMinecraft();
		RenderItem renderItem = mc.getRenderItem();
		ItemModelMesher itemModel = renderItem.getItemModelMesher();
		String itemName = block.getUnlocalizedName().substring(5);
		itemModel.register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(ModInfo.MODID + ":" + itemName,
						"inventory"));
	}
}