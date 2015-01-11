package tutorial.alex;

import net.minecraft.item.ItemAxe;


public class StableAxe extends ItemAxe{

	public StableAxe(ToolMaterial material) {
		super(alex.ALCHEMIZED);
		setUnlocalizedName("alchemizedAxe");
		setCreativeTab(alex.tabGodcraft);
		setTextureName(alex.MODID + ":" + "stableaxe");
		// TODO Auto-generated constructor stub
	}

}
