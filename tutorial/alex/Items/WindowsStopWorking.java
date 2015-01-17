package tutorial.alex.Items;

import java.util.Arrays;

import net.minecraftforge.common.util.EnumHelper;
import tutorial.alex.AlexMainRegistry;

public class WindowsStopWorking extends AlchemySword{
	public WindowsStopWorking(ToolMaterial material){
		super(EnumHelper.addToolMaterial("WindowsStopWorking", 0, 750, 0.4f, 3.0f, 0));
		setUnlocalizedName("windowsStopWorking");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:WindowsStopWorking");
		Object[] parentArray = {AlexSuppliesLoader.computerAlch, AlexSuppliesLoader.hammer};
		setParents(parentArray);
	}
}
