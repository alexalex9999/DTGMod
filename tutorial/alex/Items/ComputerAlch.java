package tutorial.alex.Items;

import tutorial.alex.alex;

public class ComputerAlch extends AlchemyItem{
	public ComputerAlch(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("computerAlch");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:computerAlch");
		setLevel(1);
	}
}
