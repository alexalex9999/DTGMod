/*    */ package tutorial.alex.Entity.Attacks;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.world.World;
/*    */ import tutorial.alex.Entity.EntityTwin;
/*    */ 
/*    */ public class TwinAttackyes
/*    */   implements TwinBuilderAttack
/*    */ {
/*    */   EntityTwin twinboss;
/*    */   boolean isDone;
/* 11 */   int warmuptime = 0;
/*    */ 
/*    */   public TwinAttackyes(EntityTwin g) {
/* 14 */     this.twinboss = g;
/* 15 */     this.isDone = false;
/*    */   }
/*    */ 
/*    */   public void use(Entity target)
/*    */   {
/* 20 */     this.warmuptime += 1;
/* 21 */     if (this.warmuptime >= 100) {
/* 22 */       this.twinboss.worldObj.createExplosion(this.twinboss, this.twinboss.posX, this.twinboss.posY, this.twinboss.posZ, 4.0F, false);
/* 23 */       this.isDone = true;
/*    */     }
/*    */   }
/*    */ 
/*    */   public int getTier()
/*    */   {
/* 29 */     return 2;
/*    */   }
/*    */ 
/*    */   public boolean isDone()
/*    */   {
/* 34 */     return this.isDone;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.Attacks.TwinAttackyes
 * JD-Core Version:    0.6.0
 */