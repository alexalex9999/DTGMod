package tutorial.alex.Items;

import tutorial.alex.AlexMainRegistry;

public class ComputerAlch extends AlchemyItem{
	public ComputerAlch(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("computerAlch");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:computerAlch");
		setLevel(0);
	}
}
