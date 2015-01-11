/*     */ package tutorial.alex.Blocks;
/*     */ 
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ class SlotAlchemRecipe extends Slot
/*     */ {
/*     */   private int field_75228_b;
/*     */ 
/*     */   public SlotAlchemRecipe(IInventory par2IInventory, int par3, int par4, int par5)
/*     */   {
/* 148 */     super(par2IInventory, par3, par4, par5);
/*     */   }
/*     */ 
/*     */   public boolean isItemValid(ItemStack par1ItemStack)
/*     */   {
/* 156 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean canTakeStack(EntityPlayer par1EntityPlayer)
/*     */   {
/* 164 */     return false;
/*     */   }
/*     */ 
/*     */   public ItemStack decrStackSize(int par1)
/*     */   {
/* 173 */     if (getHasStack())
/*     */     {
/* 175 */       this.field_75228_b += Math.min(par1, getStack().stackSize);
/*     */     }
/*     */ 
/* 178 */     return super.decrStackSize(par1);
/*     */   }
/*     */ 
/*     */   public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
/*     */   {
/*     */   }
/*     */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.SlotAlchemRecipe
 * JD-Core Version:    0.6.0
 */