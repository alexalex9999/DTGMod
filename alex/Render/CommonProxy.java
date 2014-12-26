/*    */ package tutorial.alex.Render;
/*    */ 
/*    */ import cpw.mods.fml.common.network.IGuiHandler;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class CommonProxy
/*    */   implements IGuiHandler
/*    */ {
/*    */   public void registerRenderInformation()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 14 */     return null;
/*    */   }
/*    */ 
/*    */   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
/* 18 */     return null;
/*    */   }
/*    */ 
/*    */   public void registerTiles()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void registerBlocks()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void addNames()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void addRecipes()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void registerRenderers()
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Render.CommonProxy
 * JD-Core Version:    0.6.0
 */