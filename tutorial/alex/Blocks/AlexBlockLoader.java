package tutorial.alex.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import tutorial.alex.Blocks.*;
import tutorial.alex.alex;
public class AlexBlockLoader {
	public static Block alexIngotBlock;
	public static Block unstableOre;
	public static Block alchemizedOre;
	public static Block alchemizer;
	public static Block uunOre;
	
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	};

	public static void initializeBlock() {
		alexIngotBlock = new AlexIngotBlock();
	    alchemizedOre = new AlchemizedOre();
	    alchemizer = new Alchemizer();
	    unstableOre = new UnstableOre();
	    uunOre = new UunOre();
		
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(alexIngotBlock, "AlchemizedBlock");
	    GameRegistry.registerBlock(alchemizedOre, "alchemizedOre");
	    GameRegistry.registerBlock(unstableOre, "unstableOre");
	    GameRegistry.registerBlock(alchemizer, "alchemizer");
	    GameRegistry.registerBlock(uunOre, "uunOre");
		
	}

}
