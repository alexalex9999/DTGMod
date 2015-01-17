/*    */ package tutorial.alex.Blocks;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.BlockContainer;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class Alchemizer extends BlockContainer
/*    */ {
/*    */ 
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon top;
/*    */ 
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon front;
/*    */ 
/*    */   public Alchemizer()
/*    */   {
/* 20 */     super(Material.iron);
/* 21 */     setHardness(4.0F);
/* 22 */     setStepSound(Block.soundTypeMetal);
/* 23 */     setBlockName("Alchemizer");
/* 24 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 25 */     setHarvestLevel("pickaxe", 1);
/* 26 */     setBlockTextureName("alexmodid:alchemizer");
/*    */   }
/*    */ 
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int side, int p_149691_2_)
/*    */   {
/* 36 */     return side == 2 ? this.front : (side == 1) || (side == 0) ? this.top : this.blockIcon;
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerBlockIcons(IIconRegister p_149651_1_) {
/* 41 */     this.blockIcon = p_149651_1_.registerIcon("alexmodid:alchemside");
/* 42 */     this.top = p_149651_1_.registerIcon("alexmodid:alchemtop");
/* 43 */     this.front = p_149651_1_.registerIcon("alexmodid:alchemside");
/*    */   }
/*    */ 
/*    */   public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
/*    */   {
/* 49 */     return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.Alchemizer
 * JD-Core Version:    0.6.0
 */