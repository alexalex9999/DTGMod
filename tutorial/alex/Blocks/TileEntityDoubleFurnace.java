package tutorial.alex.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.tileentity.TileEntityFurnace;

public class TileEntityDoubleFurnace extends TileEntityFurnace{
	public TileEntityDoubleFurnace(){
		super();
	}
	public static int getItemBurnTime(ItemStack p_145952_0_)
    {
        if (p_145952_0_ == null)
        {
            return 0;
        }
        else
        {
            Item item = p_145952_0_.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 300;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 600;
                }

                if (block == Blocks.coal_block)
                {
                    return 32000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 400;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 400;
            if (item == Items.stick) return 200;
            if (item == Items.coal) return 3200;
            if (item == Items.lava_bucket) return 40000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 200;
            if (item == Items.blaze_rod) return 4800;
            return 2 * GameRegistry.getFuelValue(p_145952_0_);
        }
    }
}
