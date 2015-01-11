/*    */ package tutorial.alex.Entity.Attacks;
/*    */ 
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.DamageSource;
/*    */ import tutorial.alex.Entity.EntityTwin;
/*    */ 
/*    */ public class TwinAttack
/*    */   implements TwinBuilderAttack
/*    */ {
/*    */   EntityTwin twin;
/* 10 */   boolean isDone = false;
/* 11 */   int warmuptime = 0;
/*    */ 
/* 13 */   public TwinAttack(EntityTwin a) { this.twin = a; }
/*    */ 
/*    */   public void use(Entity target) {
/* 16 */     target.attackEntityFrom(new DamageSource("mob.twinboss.damage.attack"), 4.0F);
/* 17 */     this.isDone = true;
/*    */   }
/*    */   public int getTier() {
/* 20 */     return 1;
/*    */   }
/*    */   public boolean isDone() {
/* 23 */     return this.isDone;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.Attacks.TwinAttack
 * JD-Core Version:    0.6.0
 */