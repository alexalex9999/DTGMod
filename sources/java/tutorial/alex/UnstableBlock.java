package tutorial.alex;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UnstableBlock extends Block 
{
        public UnstableBlock() 
        {
                super(Material.iron);
                setHardness(4.0F); // 33% harder than diamond
                setStepSound(Block.soundTypeMetal); // sounds got renamed, look in Block class for what blocks have what sounds
                setBlockName("unstableBlock"); // changed in 1.7
                setCreativeTab(alex.tabGodcraft);
                setHarvestLevel("pickaxe",1);
                setBlockTextureName(alex.MODID + ":" + "unstableblock");
                
        }
}