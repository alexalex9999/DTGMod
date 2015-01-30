package tutorial.alex.Blocks;

import tutorial.alex.AlexMainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class HollowGenericObject extends PerfectlyGenericObject{

	Object[] parents = {AlexAlchemyBlockLoader.perfectlyGenericObject, Blocks.air};
	
	protected HollowGenericObject() {
		super();
		this.setHardness(0.0f);
		this.setStepSound(Block.soundTypeWood);
		this.setBlockTextureName("alexmodid:PerfectlyGenericObject");
		this.setBlockName("hollowGenericObject");
		this.setCreativeTab(AlexMainRegistry.tabGodcraft);
		this.setParents(parents);
		setHarvestLevel("pickaxe", 0);
	}
	
}
