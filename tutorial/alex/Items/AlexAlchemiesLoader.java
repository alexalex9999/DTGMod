package tutorial.alex.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class AlexAlchemiesLoader extends AlexItemLoader{
	public static AlchemySword kinectWands;
	public static AlchemyGun cheapBayonet;
	public static AlchemyGun storageShotgun;
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	public static void initializeItem(){
		kinectWands = new KinectWands(null);
		cheapBayonet = new CheapBayonet();
		storageShotgun = new StorageShotgun();
	}
	public static void registerItem(){
		System.out.println("Registering Alchemies");
		GameRegistry.registerItem(kinectWands, "kinectWands");
		GameRegistry.registerItem(cheapBayonet, "cheapBayonet");
		GameRegistry.registerItem(storageShotgun, "storageShotgun");
		
	}
}
