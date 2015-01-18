/*    */ package tutorial.alex.Blocks;
/*    */ 
/*    */ import java.util.Random;

/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.item.Item;
/*    */ import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Items.AlexItemLoader;
/*    */ 
/*    */ public class UnstableOre extends Block
/*    */ {
/*    */   public UnstableOre()
/*    */   {
/* 14 */     super(Material.rock);
/* 15 */     setHardness(10.5F);
/* 16 */     setStepSound(Block.soundTypeStone);
/* 17 */     setBlockName("unstableOre");
/* 18 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 19 */     setHarvestLevel("pickaxe", 3);
/* 20 */     setBlockTextureName("alexmodid:unstablealchemized");
/*    */   }
/*    */ 
/*    */   public Item getItemDropped(int metadata, Random random, int fortune)
/*    */   {
/* 27 */     return AlexItemLoader.alexItem;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.UnstableOre
 * JD-Core Version:    0.6.0
 */