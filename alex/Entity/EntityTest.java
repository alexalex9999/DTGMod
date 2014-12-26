/*    */ package tutorial.alex.Entity;
/*    */ 
/*    */ import net.minecraft.entity.SharedMonsterAttributes;
/*    */ import net.minecraft.entity.ai.attributes.IAttributeInstance;
/*    */ import net.minecraft.entity.monster.EntityMob;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class EntityTest extends EntityMob
/*    */ {
/*    */   public EntityTest(World par1World)
/*    */   {
/* 10 */     super(par1World);
/*    */   }
/*    */ 
/*    */   protected void applyEntityAttributes()
/*    */   {
/* 15 */     super.applyEntityAttributes();
/* 16 */     getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
/* 17 */     getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
/* 18 */     getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);
/* 19 */     getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.0D);
/* 20 */     getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.5D);
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.EntityTest
 * JD-Core Version:    0.6.0
 */