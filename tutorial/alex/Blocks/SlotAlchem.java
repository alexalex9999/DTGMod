/*    */ package tutorial.alex.Blocks;
/*    */ 
/*    */ import net.minecraft.entity.item.EntityXPOrb;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public class SlotAlchem extends Slot
/*    */ {
/*    */   private EntityPlayer thePlayer;
/*    */   private int field_75228_b;
/*    */ 
/*    */   public SlotAlchem(EntityPlayer par1EntityPlayer, IInventory par2IInventory, int par3, int par4, int par5)
/*    */   {
/* 18 */     super(par2IInventory, par3, par4, par5);
/* 19 */     this.thePlayer = par1EntityPlayer;
/*    */   }
/*    */ 
/*    */   public boolean isItemValid(ItemStack par1ItemStack)
/*    */   {
/* 27 */     return false;
/*    */   }
/*    */ 
/*    */   public ItemStack decrStackSize(int par1)
/*    */   {
/* 36 */     if (getHasStack())
/*    */     {
/* 38 */       this.field_75228_b += Math.min(par1, getStack().stackSize);
/*    */     }
/*    */ 
/* 41 */     return super.decrStackSize(par1);
/*    */   }
/*    */ 
/*    */   public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
/*    */   {
/* 46 */     onCrafting(par2ItemStack);
/* 47 */     super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
/*    */   }
/*    */ 
/*    */   protected void onCrafting(ItemStack par1ItemStack, int par2)
/*    */   {
/* 56 */     this.field_75228_b += par2;
/* 57 */     onCrafting(par1ItemStack);
/*    */   }
/*    */ 
/*    */   protected void onCrafting(ItemStack par1ItemStack)
/*    */   {
/* 63 */     par1ItemStack.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.field_75228_b);
/*    */ 
/* 65 */     if (!this.thePlayer.worldObj.isRemote)
/*    */     {
/* 67 */       int i = this.field_75228_b;
/* 68 */       float f = AlchemRecipes.alchems().getExperience(par1ItemStack);
/*    */ 
/* 71 */       if (f == 0.0F)
/*    */       {
/* 73 */         i = 0;
/*    */       }
/* 75 */       else if (f < 1.0F)
/*    */       {
/* 77 */         int j = MathHelper.floor_float(i * f);
/*    */ 
/* 79 */         if ((j < MathHelper.ceiling_float_int(i * f)) && ((float)Math.random() < i * f - j))
/*    */         {
/* 81 */           j++;
/*    */         }
/*    */ 
/* 84 */         i = j;
/*    */       }
/*    */ 
/* 87 */       while (i > 0)
/*    */       {
/* 89 */         int j = EntityXPOrb.getXPSplit(i);
/* 90 */         i -= j;
/* 91 */         this.thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(this.thePlayer.worldObj, this.thePlayer.posX, this.thePlayer.posY + 0.5D, this.thePlayer.posZ + 0.5D, j));
/*    */       }
/*    */     }
/*    */ 
/* 95 */     this.field_75228_b = 0;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.SlotAlchem
 * JD-Core Version:    0.6.0
 */