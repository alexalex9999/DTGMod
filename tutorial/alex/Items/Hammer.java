package tutorial.alex.Items;

import tutorial.alex.AlexMainRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class Hammer extends AlchemySword{

	public Hammer(ToolMaterial material) {
		super(EnumHelper.addToolMaterial("Hammer", 0, 150, 0.0f, -1.5f, 0));
		setUnlocalizedName("hammer");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:hammer");
		setLevel(1);
	}

}
