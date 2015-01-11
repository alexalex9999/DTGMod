/*     */ package tutorial.alex.Blocks;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.ISidedInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ 
/*     */ public class TileEntityAlchem extends TileEntity
/*     */   implements ISidedInventory
/*     */ {
/*     */   private static final int[] slots_top = null;
/*     */   private static final int[] slots_bottom = null;
/*     */   private static final int[] slots_sides = null;
/*     */   private ItemStack[] inscriberInventory;
/*     */   private static final int INSCRIBE_TIME = 100;
/*     */   private static final int RUNE_CHARGE_TIME = 400;
/*     */   public int currentInscribeTime;
/*     */   public int inscribeTime;
/*     */   public int inscribeProgressTime;
/*     */   private String displayName;
/*     */ 
/*     */   public int getSizeInventory()
/*     */   {
/*  42 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public ItemStack getStackInSlot(int paramInt)
/*     */   {
/*  47 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public ItemStack decrStackSize(int paramInt1, int paramInt2)
/*     */   {
/*  52 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public ItemStack getStackInSlotOnClosing(int paramInt)
/*     */   {
/*  69 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public void setInventorySlotContents(int paramInt, ItemStack paramItemStack)
/*     */   {
/*  77 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public String getInvName()
/*     */   {
/*  85 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public boolean isInvNameLocalized()
/*     */   {
/*  93 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public void setGuiDisplayName(String paramString)
/*     */   {
/* 101 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public int getInventoryStackLimit()
/*     */   {
/* 107 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getInscribeProgressScaled(int paramInt)
/*     */   {
/* 116 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getInscribeTimeRemainingScaled(int paramInt)
/*     */   {
/* 126 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public boolean isInscribing()
/*     */   {
/* 134 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public void updateEntity()
/*     */   {
/* 228 */     throw new Error("Unresolved compilation problem: \n\tThe method updateAlcemizerBlockState(boolean, World, int, int, int) is undefined for the type Alchemizer\n");
/*     */   }
/*     */ 
/*     */   private boolean canInscribe()
/*     */   {
/* 244 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public ItemStack getCurrentRecipe()
/*     */   {
/* 309 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public void inscribeScroll()
/*     */   {
/* 316 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public static int getInscriberChargeTime(ItemStack paramItemStack)
/*     */   {
/* 352 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public static boolean isSource(ItemStack paramItemStack)
/*     */   {
/* 362 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public boolean isUseableByPlayer(EntityPlayer paramEntityPlayer)
/*     */   {
/* 368 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public void openInventory()
/*     */   {
/* 375 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */   public void closeInventory() {
/* 378 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public boolean isItemValidForSlot(int paramInt, ItemStack paramItemStack)
/*     */   {
/* 383 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public int[] getAccessibleSlotsFromSide(int paramInt)
/*     */   {
/* 402 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public boolean canInsertItem(int paramInt1, ItemStack paramItemStack, int paramInt2)
/*     */   {
/* 411 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public boolean canExtractItem(int paramInt1, ItemStack paramItemStack, int paramInt2)
/*     */   {
/* 420 */     throw new Error("Unresolved compilation problem: \n");
/*     */   }
/*     */ 
/*     */   public void readFromNBT(NBTTagCompound paramNBTTagCompound)
/*     */   {
/* 437 */     throw new Error("Unresolved compilation problem: \n\tSyntax error on token \"}\", { expected after this token\n");
/*     */   }
/*     */ 
/*     */   public void writeFromNBT(NBTTagCompound paramNBTTagCompound)
/*     */   {
/* 449 */     throw new Error("Unresolved compilation problems: \n\tSyntax error on token \"(\", ; expected\n\tSyntax error on token \")\", ; expected\n");
/*     */   }
/*     */	
			public String getInventoryName() {
				return null;
			}
			
			public boolean hasCustomInventoryName() {
				return false;
			}
 }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.TileEntityAlchem
 * JD-Core Version:    0.6.0
 */