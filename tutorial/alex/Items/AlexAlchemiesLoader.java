package tutorial.alex.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class AlexAlchemiesLoader extends AlexItemLoader{
	public static AlchemySword kinectWands;
	public static AlchemyGun cheapBayonet;
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	public static void initializeItem(){
		kinectWands = new KinectWands(null);
		cheapBayonet = new CheapBayonet();
	}
	public static void registerItem(){
		System.out.println("Registering Alchemies");
		GameRegistry.registerItem(kinectWands, "kinectWands");
		GameRegistry.registerItem(cheapBayonet, "cheapBayonet");
		
	}
}
