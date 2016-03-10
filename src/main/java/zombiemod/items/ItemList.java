package zombiemod.items;

import net.minecraft.item.Item;
import zombiemod.common.CommonRegisterHelper;

public class ItemList {
	
	public static final Item itemCoin = new ItemZM("coin");
	public static final Item itemMedkit = new ItemMedkit();
	public static final Item itemAlcohol = new ItemZM("alcohol");
	public static final Item itemGauze = new ItemZM("gauze");
	public static final Item itemNail = new ItemZM("nail");
	public static final Item itemMetalParts = new ItemZM("metalparts");
	public static final Item itemWoodBox = new ItemZM("woodbox");
	public static final Item itemNailGroup = new ItemZM("nailgroup");
	
	public static void init() {
		addItem(itemCoin);
		addItem(itemMedkit);
		addItem(itemAlcohol);
		addItem(itemGauze);
		addItem(itemNail);
		addItem(itemMetalParts);
		addItem(itemWoodBox);
		addItem(itemNailGroup);
	}
	
	public static void addItem(Item item) {
		CommonRegisterHelper.registerItem(item);
	}
	
}