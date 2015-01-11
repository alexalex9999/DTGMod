package tutorial.alex;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class UnstableOre extends Block 
{
        public UnstableOre() 
        {
                super(Material.rock);
                setHardness(10.5F); // 33% harder than diamond
                setStepSound(Block.soundTypeStone); // sounds got renamed, look in Block class for what blocks have what sounds
                setBlockName("unstableOre"); // changed in 1.7
                setCreativeTab(alex.tabGodcraft);
                setHarvestLevel("pickaxe", 3);
                setBlockTextureName(alex.MODID + ":" + "unstablealchemized");
                
        }
        
        
        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return alex.alexItem;
        }
        

        
}