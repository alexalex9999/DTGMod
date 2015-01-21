package tutorial.alex.Items;

import tutorial.alex.AlexMainRegistry;

public class BatteryPack extends AlchemyItem{
	public BatteryPack(){
		super();
		setMaxStackSize(64);
		setUnlocalizedName("BatteryPack");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:batteryPack");
		setLevel((byte) 1);
		Object[] parentArray = {AlexSuppliesLoader.battery, AlexSuppliesLoader.backpackAlch};
		setParents(parentArray);
	}
}
