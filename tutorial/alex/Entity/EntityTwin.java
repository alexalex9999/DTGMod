/*     */ package tutorial.alex.Entity;
/*     */ 
/*     */ import cpw.mods.fml.common.FMLCommonHandler;
/*     */ import cpw.mods.fml.relauncher.Side;

/*     */ import java.io.PrintStream;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Random;

/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
/*     */ import net.minecraft.entity.ai.EntityAITasks;
/*     */ import net.minecraft.entity.ai.attributes.IAttributeInstance;
/*     */ import net.minecraft.entity.boss.BossStatus;
/*     */ import net.minecraft.entity.boss.IBossDisplayData;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.pathfinding.PathNavigate;
/*     */ import net.minecraft.util.ChatComponentText;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.world.World;
/*     */ import tutorial.alex.Entity.Attacks.TwinAttack;
/*     */ import tutorial.alex.Entity.Attacks.TwinAttackboom;
/*     */ import tutorial.alex.Entity.Attacks.TwinAttackyes;
/*     */ import tutorial.alex.Entity.Attacks.TwinBuilderAttack;
/*     */ import tutorial.alex.Entity.Attacks.TwinSpawn;
/*     */ import tutorial.alex.Entity.Attacks.TwinTeleport;
import tutorial.alex.Items.AlexItemLoader;
/*     */ import tutorial.alex.AlexMainRegistry;
/*     */ 
/*     */ public class EntityTwin extends EntityMob
/*     */   implements IBossDisplayData
/*     */ {
/*     */   public TwinBuilderAttack currentAttack;
/*  33 */   ItemStack twinSword = new ItemStack(AlexItemLoader.twinSword);
/*     */   public Entity target;
/*  35 */   public int tier = 1;
/*  36 */   private float scale = 1.0F;
/*  37 */   public HashMap<Integer, List<Class<? extends TwinBuilderAttack>>> attacks = new HashMap();
/*     */ 
/*  39 */   public void onLivingUpdate() { if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
/*  40 */       this.target = getAttackTarget();
/*  41 */       BossStatus.setBossStatus(this, true);
/*     */     }
/*     */     else
/*     */     {
/*  45 */       this.tier = 1;
/*  46 */       this.scale = 1.0F;
/*  47 */       if (getHealth() < 0.0F) {
/*  48 */         this.tier = 2;
/*  49 */         this.scale = 2.0F;
/*     */       }
/*  51 */       if (getHealth() < 0.0F) {
/*  52 */         this.tier = 3;
/*  53 */         this.scale = 4.0F;
/*     */       }
/*  55 */       if (getHealth() < 0.0F) {
/*  56 */         this.tier = 3;
/*  57 */         this.scale = 5.5F;
/*     */       }
/*  59 */       if (getHealth() < 0.0F) {
/*  60 */         this.tier = 3;
/*  61 */         this.scale = 7.0F;
/*     */       }
/*  63 */       if (getHealth() < 0.0F) {
/*  64 */         this.tier = 3;
/*  65 */         this.scale = 10.0F;
/*     */       }
/*  67 */       setSize(0.6F * this.scale, 1.8F * this.scale);
/*     */ 
/*  70 */       if ((this.currentAttack != null) && (this.currentAttack.isDone())) {
/*  71 */         this.currentAttack = null;
/*     */       }
/*  73 */       else if ((this.currentAttack != null) && (this.target != null)) {
/*  74 */         this.currentAttack.use(this.target);
/*     */       }
/*  76 */       if ((this.currentAttack == null) && (this.rand.nextInt(5000 - this.tier * 100) == 42) && (this.target != null))
/*     */       {
/*     */         try {
/*  79 */           this.currentAttack = ((TwinBuilderAttack)((Class)((List)this.attacks.get(Integer.valueOf(this.tier))).get(this.rand.nextInt(((List)this.attacks.get(Integer.valueOf(this.tier))).size()))).getConstructor(new Class[] { EntityTwin.class }).newInstance(new Object[] { this }));
/*     */         }
/*     */         catch (InstantiationException e) {
/*  82 */           System.err.println("Modpack made an error. Whoops.");
/*  83 */           e.printStackTrace(System.err);
/*     */         }
/*     */         catch (IllegalAccessException e) {
/*  86 */           System.err.println("Modpack made an error. Whoops.");
/*  87 */           e.printStackTrace(System.err);
/*     */         }
/*     */         catch (IllegalArgumentException e) {
/*  90 */           System.err.println("Modpack made an error. Whoops.");
/*  91 */           e.printStackTrace(System.err);
/*     */         }
/*     */         catch (InvocationTargetException e) {
/*  94 */           System.err.println("Modpack made an error. Whoops.");
/*  95 */           e.printStackTrace(System.err);
/*     */         }
/*     */         catch (NoSuchMethodException e) {
/*  98 */           System.err.println("Modpack made an error. Whoops.");
/*  99 */           e.printStackTrace(System.err);
/*     */         }
/*     */         catch (SecurityException e) {
/* 102 */           System.err.println("Modpack made an error. Whoops.");
/* 103 */           e.printStackTrace(System.err);
/*     */         }
/* 105 */         this.currentAttack.use(this.target);
/*     */       }
/*     */     }
/*     */ 
/* 109 */     super.onLivingUpdate(); }
/*     */ 
/*     */   public EntityTwin(World par1World)
/*     */   {
/* 113 */     super(par1World);
/* 114 */     setAttackTarget(this.attackingPlayer);
/* 115 */     this.currentAttack = null;
/* 116 */     this.attacks.put(Integer.valueOf(1), new ArrayList());
/* 117 */     this.attacks.put(Integer.valueOf(2), new ArrayList());
/* 118 */     this.attacks.put(Integer.valueOf(3), new ArrayList());
/* 119 */     this.attacks.put(Integer.valueOf(4), new ArrayList());
/* 120 */     this.attacks.put(Integer.valueOf(5), new ArrayList());
/* 121 */     this.attacks.put(Integer.valueOf(6), new ArrayList());
/* 122 */     addAttacks();
/* 123 */     this.experienceValue = 1900;
/* 124 */     this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
/* 125 */     this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTest.class, 0, true));
/* 126 */     getNavigator().setCanSwim(true);
/*     */   }
/*     */ 
/*     */   protected void applyEntityAttributes()
/*     */   {
/* 132 */     super.applyEntityAttributes();
/* 133 */     getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
/* 134 */     getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
/* 135 */     getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);
/* 136 */     getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.0D);
/* 137 */     getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
/*     */   }
/*     */ 
/*     */   public IChatComponent func_145748_c_()
/*     */   {
/* 147 */     return new ChatComponentText("TwinBuilder");
/*     */   }
/*     */ 
/*     */   public void addAttacks() {
/* 151 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttack.class);
/* 152 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttackboom.class);
/* 153 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttackyes.class);
/*     */ 
/* 155 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttack.class);
/* 156 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttackboom.class);
/* 157 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttackyes.class);
/* 158 */     ((List)this.attacks.get(Integer.valueOf(2))).add(TwinTeleport.class);
/*     */ 
/* 160 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttack.class);
/* 161 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttackboom.class);
/* 162 */     ((List)this.attacks.get(Integer.valueOf(1))).add(TwinAttackyes.class);
/* 163 */     ((List)this.attacks.get(Integer.valueOf(2))).add(TwinTeleport.class);
/* 164 */     ((List)this.attacks.get(Integer.valueOf(3))).add(TwinSpawn.class);
/*     */   }
/*     */ 
/*     */   public boolean teleportRandomly(int warmuptime)
/*     */   {
/* 173 */     double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 16.0D;
/* 174 */     double d1 = this.posY + (this.rand.nextInt(64) - 8);
/* 175 */     double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 16.0D;
/* 176 */     return teleportTo(d0, d1, d2, warmuptime);
/*     */   }
/*     */ 
/*     */   public boolean teleportTo(double d0, double d1, double d2, int warmuptime) {
/* 180 */     return false;
/*     */   }
/*     */ 
/*     */   public double[] getTeleportRandomly() {
/* 184 */     return new double[] { this.posX + (this.rand.nextDouble() - 0.5D) * 16.0D, this.posY + (this.rand.nextInt(64) - 8), this.posZ + (this.rand.nextDouble() - 0.5D) * 16.0D };
/*     */   }
/*     */ 
/*     */   protected String getHurtSound() {
/* 188 */     return "mob.zombie.hurt";
/*     */   }
/*     */   public void onDeath(DamageSource d) {
/* 191 */     super.onDeath(d);
/*     */   }
/*     */ 
/*     */   protected void dropFewItems(boolean par1, int par2)
/*     */   {
/* 196 */     entityDropItem(new ItemStack(AlexItemLoader.twinSword, 1, 0), 0.0F);
/*     */   }
/*     */ 
/*     */   public ItemStack getHeldItem()
/*     */   {
/* 201 */     return this.twinSword;
/*     */   }
/*     */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.EntityTwin
 * JD-Core Version:    0.6.0
 */