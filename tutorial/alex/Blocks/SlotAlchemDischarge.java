/*     */ package tutorial.alex.Blocks;
/*     */ 
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ class SlotAlchemDischarge extends Slot
/*     */ {
/*     */   private int field_75228_b;
/*     */ 
/*     */   public SlotAlchemDischarge(IInventory par2IInventory, int par3, int par4, int par5)
/*     */   {
/* 109 */     super(par2IInventory, par3, par4, par5);
/*     */   }
/*     */ 
/*     */   public boolean isItemValid(ItemStack par1ItemStack)
/*     */   {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */   public ItemStack decrStackSize(int par1)
/*     */   {
/* 126 */     if (getHasStack())
/*     */     {
/* 128 */       this.field_75228_b += Math.min(par1, getStack().stackSize);
/*     */     }
/*     */ 
/* 131 */     return super.decrStackSize(par1);
/*     */   }
/*     */ 
/*     */   public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
/*     */   {
/* 136 */     super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
/*     */   }
/*     */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.SlotAlchemDischarge
 * JD-Core Version:    0.6.0
 */