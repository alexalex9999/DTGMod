/*    */ package tutorial.alex.Entity.Attacks;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import tutorial.alex.Entity.EntityTwin;
/*    */ 
/*    */ public class TwinTeleport
/*    */   implements TwinBuilderAttack
/*    */ {
/*    */   EntityTwin twinboss;
/*    */   boolean isDone;
/*    */   double[] d;
/* 11 */   int warmuptime = 0;
/*    */ 
/*    */   public TwinTeleport(EntityTwin e) {
/* 14 */     this.twinboss = e;
/* 15 */     this.isDone = false;
/*    */   }
/*    */ 
/*    */   public void use(Entity target)
/*    */   {
/* 20 */     this.warmuptime += 1;
/* 21 */     if (this.d == null) {
/* 22 */       this.d = this.twinboss.getTeleportRandomly();
/*    */     }
/* 24 */     this.twinboss.teleportTo(this.d[0], this.d[1], this.d[2], this.warmuptime);
/* 25 */     if (this.warmuptime >= 100)
/* 26 */       this.isDone = true;
/*    */   }
/*    */ 
/*    */   public int getTier()
/*    */   {
/* 33 */     return 2;
/*    */   }
/*    */ 
/*    */   public boolean isDone()
/*    */   {
/* 39 */     return this.isDone;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.Attacks.TwinTeleport
 * JD-Core Version:    0.6.0
 */