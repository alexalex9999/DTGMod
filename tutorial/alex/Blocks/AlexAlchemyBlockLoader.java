package tutorial.alex.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class AlexAlchemyBlockLoader extends AlexBlockLoader{
	public static Block doubleFurnace, perfectlyGenericObject, hollowGenericObject;
	public static void mainRegistry(){
		intializeBlock();
		registerBlock();
	}

	private static void intializeBlock() {
		doubleFurnace = new DoubleFurnace(false);
		perfectlyGenericObject = new PerfectlyGenericObject();
		hollowGenericObject = new HollowGenericObject();
	}

	private static void registerBlock() {
		GameRegistry.registerBlock(doubleFurnace, "doubleFurnace");
		GameRegistry.registerBlock(perfectlyGenericObject, "perfectlyGenericObject");
		GameRegistry.registerBlock(hollowGenericObject, "hollowGenericObject");
	}

}
