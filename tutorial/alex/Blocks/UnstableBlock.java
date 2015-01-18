/*    */ package tutorial.alex.Blocks;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class UnstableBlock extends Block
/*    */ {
/*    */   public UnstableBlock()
/*    */   {
/* 11 */     super(Material.iron);
/* 12 */     setHardness(4.0F);
/* 13 */     setStepSound(Block.soundTypeMetal);
/* 14 */     setBlockName("unstableBlock");
/* 15 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 16 */     setHarvestLevel("pickaxe", 1);
/* 17 */     setBlockTextureName("alexmodid:unstableblock");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.UnstableBlock
 * JD-Core Version:    0.6.0
 */