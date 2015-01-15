package tutorial.alex.Items;

import tutorial.alex.alex;
import net.minecraftforge.common.util.EnumHelper;

public class KnittingNeedles extends AlchemySword{
	public KnittingNeedles(ToolMaterial material){
		super(EnumHelper.addToolMaterial("KnittingNeedles", 0, 400, 0.1f, -0.5f, 0));
		setUnlocalizedName("knittingNeedles");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:KnittingNeedles");
	}
}
