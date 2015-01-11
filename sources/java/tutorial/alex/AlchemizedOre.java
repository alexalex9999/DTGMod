package tutorial.alex;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class AlchemizedOre extends Block 
{
        public AlchemizedOre() 
        {
                super(Material.rock);
                setHardness(3.5F); // 33% harder than diamond
                setStepSound(Block.soundTypeStone); // sounds got renamed, look in Block class for what blocks have what sounds
                setBlockName("alchemizedOre"); // changed in 1.7
                setCreativeTab(alex.tabGodcraft);
                setHarvestLevel("pickaxe", 2);
                setBlockTextureName(alex.MODID + ":" + "stablealchemized");
        }
        
        
        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(alex.alchemizedOre);
        }
        

        
}