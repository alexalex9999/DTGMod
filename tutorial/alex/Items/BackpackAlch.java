package tutorial.alex.Items;

import tutorial.alex.AlexMainRegistry;

public class BackpackAlch extends AlchemyItem{
	public BackpackAlch(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("backpackAlch");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:backpackAlch");
		setLevel(1);
	}

}
