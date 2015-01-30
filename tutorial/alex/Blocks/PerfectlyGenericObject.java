package tutorial.alex.Blocks;

import tutorial.alex.Alchemy;
import tutorial.alex.AlexMainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PerfectlyGenericObject extends PerfectlyGenericBlock implements Alchemy {

	protected PerfectlyGenericObject() {
		super(Material.rock);
		this.setHardness(0.0f);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockTextureName("alexmodid:PerfectlyGenericObject");
		this.setBlockName("perfectlyGenericObject");
		this.setCreativeTab(AlexMainRegistry.tabGodcraft);
		setHarvestLevel("pickaxe", 0);
	}

}
