package tutorial.alex.Items;

import tutorial.alex.alex;

public class BackpackAlch extends AlchemyItem{
	public BackpackAlch(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("backpackAlch");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:backpackAlch");
	}

}
