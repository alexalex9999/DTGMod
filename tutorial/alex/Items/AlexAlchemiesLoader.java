package tutorial.alex.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class AlexAlchemiesLoader extends AlexItemLoader{
	public static AlchemySword kinectWands;
	public static AlchemyGun cheapBayonet;
	public static AlchemyGun storageShotgun;
	public static AlchemySword windowsStopWorking;
	public static AlchemyGun iShoot;
	public static AlchemyGun bindingOfScythes;
	public static AlchemySword XPBOX;
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	public static void initializeItem(){
		kinectWands = new KinectWands(null);
		cheapBayonet = new CheapBayonet();
		storageShotgun = new StorageShotgun();
		windowsStopWorking = new WindowsStopWorking(null);
		iShoot = new iShoot();
		bindingOfScythes = new BindingOfScythes();
		XPBOX = new XPBOX(null);
	}
	public static void registerItem(){
		System.out.println("Registering Alchemies");
		GameRegistry.registerItem(kinectWands, "kinectWands");
		GameRegistry.registerItem(cheapBayonet, "cheapBayonet");
		GameRegistry.registerItem(storageShotgun, "storageShotgun");
		GameRegistry.registerItem(windowsStopWorking, "windowsStopWorking");
		GameRegistry.registerItem(iShoot, "iShoot");
		GameRegistry.registerItem(bindingOfScythes, "bindingOfScythes");
		GameRegistry.registerItem(XPBOX, "XPBOX");
	}
}
