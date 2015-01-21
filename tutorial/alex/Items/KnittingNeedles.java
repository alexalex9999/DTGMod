package tutorial.alex.Items;

import tutorial.alex.AlexMainRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class KnittingNeedles extends AlchemySword{
	public KnittingNeedles(ToolMaterial material){
		super(EnumHelper.addToolMaterial("KnittingNeedles", 0, 400, 0.1f, -0.5f, 0));
		setUnlocalizedName("knittingNeedles");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:KnittingNeedles");
		setLevel((byte) 0);
	}
}
