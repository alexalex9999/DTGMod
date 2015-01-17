/*    */ package tutorial.alex.client;
/*    */ 
/*    */ import cpw.mods.fml.client.registry.RenderingRegistry;
/*    */ import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import tutorial.alex.Entity.EntityStdBullet;
import tutorial.alex.Entity.EntityStorageShotgunBullet;
/*    */ import tutorial.alex.Entity.EntityTest;
/*    */ import tutorial.alex.Entity.EntityTwin;
/*    */ import tutorial.alex.Render.CommonProxy;
import tutorial.alex.Render.RenderStdBullet;
import tutorial.alex.Render.RenderStorageShotgunBullet;
/*    */ import tutorial.alex.Render.RenderTest;
/*    */ import tutorial.alex.Render.RenderTwin;
/*    */ 
/*    */ public class ClientProxy extends CommonProxy
/*    */ {
/*    */   public void registerRenderers()
/*    */   {
/* 16 */     RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderTest(new ModelBiped(), 0.5F));
/* 17 */     RenderingRegistry.registerEntityRenderingHandler(EntityTwin.class, new RenderTwin(new ModelBiped(), 0.5F));
			 RenderingRegistry.registerEntityRenderingHandler(EntityStdBullet.class, new RenderStdBullet());
			 RenderingRegistry.registerEntityRenderingHandler(EntityStorageShotgunBullet.class, new RenderStorageShotgunBullet());
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.client.ClientProxy
 * JD-Core Version:    0.6.0
 */