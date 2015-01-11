package tutorial.alex;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AlexIngotBlock extends Block 
{
        public AlexIngotBlock() 
        {
                super(Material.iron);
                setHardness(4.0F); // 33% harder than diamond
                setStepSound(Block.soundTypeMetal); // sounds got renamed, look in Block class for what blocks have what sounds
                setBlockName("AlchemizedBlock"); // changed in 1.7
                setCreativeTab(alex.tabGodcraft);
                setHarvestLevel("pickaxe",1);
                setBlockTextureName(alex.MODID + ":" + "stableblock");
                
        }
}