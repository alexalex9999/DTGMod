package tutorial.alex.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class AlexSuppliesLoader extends AlexItemLoader{
	public static AlchemyItem backpackAlch;
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	public static void initializeItem(){
		backpackAlch = new BackpackAlch();	
	}
	public static void registerItem(){
		GameRegistry.registerItem(backpackAlch, "backpackAlch");
	}
}
