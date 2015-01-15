package tutorial.alex.Items;

import net.minecraftforge.common.util.EnumHelper;
import tutorial.alex.alex;

public class KinectWands extends AlchemySword{

	public KinectWands(ToolMaterial material) {
		super(EnumHelper.addToolMaterial("KinectWands", 0, 750, 0.2f, 2.5f, 0));
		setUnlocalizedName("kinectWands");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:KinectWands");
	}

}
