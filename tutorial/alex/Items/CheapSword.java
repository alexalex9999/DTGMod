package tutorial.alex.Items;

import tutorial.alex.alex;
import net.minecraftforge.common.util.EnumHelper;

public class CheapSword extends AlchemySword{
	public CheapSword(ToolMaterial material){
		super(EnumHelper.addToolMaterial("CheapSword", 0, 100, 0.0F, -1.0F, 0));
		setUnlocalizedName("cheapSword");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:CheapSword");
		setLevel(1);
		
	}
}
