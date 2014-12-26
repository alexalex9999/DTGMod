/*    */ package tutorial.alex.Entity.Attacks;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.world.World;
/*    */ import tutorial.alex.Entity.EntityTest;
/*    */ import tutorial.alex.Entity.EntityTwin;
/*    */ 
/*    */ public class TwinSpawn
/*    */   implements TwinBuilderAttack
/*    */ {
/*    */   EntityTwin twinboss;
/*    */   EntityTest modpack;
/*    */   boolean isDone;
/* 12 */   int warmuptime = 0;
/*    */ 
/*    */   public TwinSpawn(EntityTwin g)
/*    */   {
/* 16 */     this.twinboss = g;
/* 17 */     this.isDone = false;
/*    */   }
/*    */ 
/*    */   public TwinSpawn(EntityTest e)
/*    */   {
/* 23 */     this.modpack = e;
/* 24 */     this.isDone = false;
/*    */   }
/*    */ 
/*    */   public void use(Entity target)
/*    */   {
/* 30 */     this.modpack.setLocationAndAngles(this.twinboss.posX, this.twinboss.posY, this.twinboss.posZ, 0.0F, 0.0F);
/* 31 */     this.twinboss.worldObj.spawnEntityInWorld(this.modpack);
/* 32 */     this.isDone = true;
/*    */   }
/*    */ 
/*    */   public int getTier()
/*    */   {
/* 38 */     return 2;
/*    */   }
/*    */ 
/*    */   public boolean isDone()
/*    */   {
/* 43 */     return this.isDone;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.Attacks.TwinSpawn
 * JD-Core Version:    0.6.0
 */