package zombiemod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import zombiemod.utils.ZombieUtils;

public class ItemMedkit extends ItemZM {
	
	public ItemMedkit() {
		super("medkit");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn,
			EntityPlayer playerIn) {
		if (!worldIn.isRemote) {
			double playerHealth = playerIn.getHealth();
			double playerMaxHealth = playerIn.getMaxHealth();
			if (playerHealth == playerIn.getMaxHealth()) {
				ZombieUtils
						.sendChatMessage(playerIn,
								"Your health is already full! Don't waste your medkits.");
			} else {
				float playerHealthNew = (float) (playerHealth + 5F);
				playerHealthNew = (float) ((playerHealthNew > playerMaxHealth) ? playerMaxHealth
						: playerHealthNew);
				playerIn.setHealth(playerHealthNew);
				ZombieUtils.sendChatMessage(playerIn,
						"You have been partially healed by your medit.");
				--itemStackIn.stackSize;
			}
		}
		return itemStackIn;
	}
}