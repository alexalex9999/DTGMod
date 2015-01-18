package tutorial.alex.Items;

import tutorial.alex.AlexMainRegistry;

public class Battery extends AlchemyItem{
	public Battery(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("battery");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:battery");
		setLevel(0);
	}
}
