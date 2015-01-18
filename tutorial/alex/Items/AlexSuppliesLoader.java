package tutorial.alex.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class AlexSuppliesLoader extends AlexItemLoader{
	public static AlchemyItem backpackAlch;
	public static AlchemyItem battery;
	public static AlchemySword cheapSword;
	public static AlchemyItem computerAlch;
	public static AlchemySword hammer;
	public static AlchemySword knittingNeedles;
	public static AlchemyItem xbox360;
	public static AlchemyGun rifle;

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	public static void initializeItem(){
		backpackAlch = new BackpackAlch();
		battery = new Battery();
		cheapSword = new CheapSword(null);
		computerAlch = new ComputerAlch();
		hammer = new Hammer(null);
		knittingNeedles = new KnittingNeedles(null);
		xbox360 = new Xbox360();
		rifle = new Rifle();
	}
	public static void registerItem(){
		GameRegistry.registerItem(backpackAlch, "backpackAlch");
		GameRegistry.registerItem(battery, "battery");
		GameRegistry.registerItem(cheapSword, "cheapSword");
		GameRegistry.registerItem(computerAlch, "computerAlch");
		GameRegistry.registerItem(hammer, "hammer");
		GameRegistry.registerItem(knittingNeedles, "knittingNeedles");
		GameRegistry.registerItem(xbox360, "xbox360");
		GameRegistry.registerItem(rifle, "rifle");
		
	}
}
