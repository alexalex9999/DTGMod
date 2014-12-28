/*    */ package tutorial.alex.Entity.Attacks;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.DamageSource;
/*    */ import tutorial.alex.Entity.EntityTwin;
/*    */ 
/*    */ public class TwinAttackboom
/*    */   implements TwinBuilderAttack
/*    */ {
/*    */   EntityTwin twinboss;
/*    */   boolean isDone;
/* 11 */   int warmuptime = 0;
/*    */ 
/*    */   public void TwinAttackBoom(EntityTwin g) {
/* 14 */     this.twinboss = g;
/* 15 */     this.isDone = false;
/*    */   }
/*    */ 
/*    */   public void use(Entity target)
/*    */   {
/* 20 */     this.warmuptime += 1;
/* 21 */     if (this.warmuptime >= 50) {
/* 22 */       target.attackEntityFrom(new DamageSource("mob.twinboss.damage.yes"), 5.0F);
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
 * Qualified Name:     tutorial.alex.Entity.Attacks.TwinAttackboom
 * JD-Core Version:    0.6.0
 */