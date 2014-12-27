/*    */ package tutorial.alex.Render;
/*    */ 
/*    */ import cpw.mods.fml.common.network.IGuiHandler;
/*    */ import cpw.mods.fml.common.network.NetworkRegistry;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class GUIHandler
/*    */   implements IGuiHandler
/*    */ {
/*    */   public GUIHandler()
/*    */   {
/* 11 */     NetworkRegistry.INSTANCE.registerGuiHandler("alexmodid", this);
/*    */   }
/*    */ 
/*    */   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 19 */     return null;
/*    */   }
/*    */ 
/*    */   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 26 */     return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Render.GUIHandler
 * JD-Core Version:    0.6.0
 */