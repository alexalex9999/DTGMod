package tutorial.alex.Render;

import java.util.Random;

import tutorial.alex.alex;
import tutorial.alex.Entity.EntityStdBullet;
import tutorial.alex.Entity.EntityTest;
import tutorial.alex.Entity.EntityTwin;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class AlexEntityManager {
	public static void mainRegistry(){
		intitializeEntities();
	}
	public static void registerEntity(Class entityClass, String name)
	{
	    int entityID = EntityRegistry.findGlobalUniqueEntityId();
	    long seed = name.hashCode();
	    Random rand = new Random(seed);
	    int primaryColor = rand.nextInt() * 16777215;
	    int secondaryColor = rand.nextInt() * 16777215; 
	    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
	    EntityRegistry.registerModEntity(entityClass, name, entityID, alex.instance, 512, 1, true);
	    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
	public static void intitializeEntities(){
		registerEntity(EntityTest.class, "entityTest");
		registerEntity(EntityTwin.class, "entityTwin");
		EntityRegistry.registerModEntity(EntityStdBullet.class, "Standard Bullet", EntityRegistry.findGlobalUniqueEntityId(), alex.instance, 64, 10, true);
	}
}
