package tutorial.alex.Items;

import tutorial.alex.alex;

public class Xbox360 extends AlchemyItem{
	public Xbox360(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("xbox360");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:Xbox 360");
		setLevel(1);
	}
}
