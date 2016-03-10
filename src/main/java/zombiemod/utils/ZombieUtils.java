package zombiemod.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ZombieUtils {
	
	private static final Logger logger = LogManager.getLogger();
	
	/**
	 * @param player
	 * @param world
	 * @param entityMutant
	 * @param entityName
	 */
	public static void convertToZombie(EntityPlayer player, World world,
			Class<? extends EntityMob> entityMutant, String entityName) {
		String playerName = player.getName();
		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;
		Random rand = new Random();
		EntityMob zombie = new EntityZombie(world);
		if (entityName != "Zombie") {
			try {
				zombie = entityMutant.getDeclaredConstructor(World.class)
						.newInstance(world);
			} catch (InstantiationException e) {
				zombie.setWorld(world);
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
		zombie.setLocationAndAngles(x, y, z, player.rotationYaw,
				player.rotationPitch);
		zombie.setCustomNameTag(entityName + " " + playerName);
		world.spawnEntityInWorld(zombie);
		ZombieUtils.playMutateSound(zombie.posX, zombie.posY, zombie.posY,
				world, rand);
	}
	
	/**
	 * @param player
	 * @param message
	 */
	public static void sendChatMessage(EntityPlayer player, String message) {
		player.addChatMessage(new ChatComponentText(message));
	}
	
	/**
	 * @param message
	 */
	public static void writeOut(String message) {
		System.out.println(message);
	}
	
	/**
	 * @param message
	 * @param logType
	 */
	public static void Log(String message, ErrorType logType) {
		message = "[" + ModInfo.NAME + "] " + message;
		String lType = logType.getErrorTypeStr().toLowerCase();
		if (lType == "info") {
			logger.info(message);
		} else if (lType == "error") {
			logger.error(message);
		} else if (lType == "debug") {
			logger.debug(message);
		} else if (lType == "exit") {
			logger.info(message);
			logger.exit();
		} else if (lType == "fatal") {
			logger.fatal(message);
		} else {
			logger.info(message);
		}
	}
	
	/**
	 * @param message
	 */
	public static void Log(String message) {
		ZombieUtils.Log(message, ErrorType.INFO);
	}
	
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @param world
	 * @param rand
	 */
	public static void playMutateSound(double x, double y, double z,
			World world, Random rand) {
		world.playSound(x + 0.5D, y + 0.5D, z + 0.5D,
				"ZombieMutation:mob.volatile.mutate", 4.0F + rand.nextFloat(),
				rand.nextFloat() * 0.7F + 0.3F, false);
	}
}