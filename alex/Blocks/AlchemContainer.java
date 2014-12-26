/*     */ package tutorial.alex.Blocks;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.ICrafting;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ public class AlchemContainer extends Container
/*     */ {
/*     */   private TileEntityAlchem inscriber;
/*     */   private int lastProgressTime;
/*     */   private int lastBurnTime;
/*     */   private int lastItemBurnTime;
/*  25 */   public static final int[] INPUT = { 0, 1, 2, 3, 4, 5, 6 };
/*     */ 
/*  28 */   public static final int[] DISCHARGE = { 7, 8, 9, 10, 11, 12, 13 };
/*     */ 
/*  37 */   public static final int RUNE_SLOTS = INPUT.length; public static final int BLANK_SCROLL = RUNE_SLOTS * 2; public static final int RECIPE = BLANK_SCROLL + 1; public static final int OUTPUT = RECIPE + 1; public static final int INV_START = OUTPUT + 1; public static final int INV_END = INV_START + 26; public static final int HOTBAR_START = INV_END + 1; public static final int HOTBAR_END = HOTBAR_START + 8;
/*     */ 
/*     */   public AlchemContainer(InventoryPlayer inventoryPlayer, TileEntityAlchem par2TileEntityAlchem)
/*     */   {
/*  43 */     this.inscriber = par2TileEntityAlchem;
/*     */ 
/*  46 */     for (int i = 0; i < RUNE_SLOTS; i++) {
/*  47 */       addSlotToContainer(new Slot(par2TileEntityAlchem, INPUT[i], 43 + 18 * i, 15));
/*     */     }
/*  49 */     for (int i = 0; i < RUNE_SLOTS; i++) {
/*  50 */       addSlotToContainer(new SlotAlchemDischarge(par2TileEntityAlchem, DISCHARGE[i], 43 + 18 * i, 64));
/*     */     }
/*     */ 
/*  53 */     addSlotToContainer(new Slot(par2TileEntityAlchem, BLANK_SCROLL, 63, 39));
/*  54 */     addSlotToContainer(new SlotAlchemRecipe(par2TileEntityAlchem, RECIPE, 17, 35));
/*  55 */     addSlotToContainer(new SlotAlchem(inventoryPlayer.player, par2TileEntityAlchem, OUTPUT, 119, 39));
/*     */ 
/*  58 */     for (int i = 0; i < 3; i++)
/*     */     {
/*  60 */       for (int j = 0; j < 9; j++)
/*     */       {
/*  62 */         addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  67 */     for (int i = 0; i < 9; i++)
/*     */     {
/*  69 */       addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   public void addCraftingToCrafters(ICrafting iCrafting)
/*     */   {
/*  75 */     super.addCraftingToCrafters(iCrafting);
/*  76 */     iCrafting.sendProgressBarUpdate(this, 0, this.inscriber.inscribeProgressTime);
/*     */   }
/*     */ 
/*     */   public void detectAndSendChanges()
/*     */   {
/*  84 */     super.detectAndSendChanges();
/*     */ 
/*  86 */     for (int i = 0; i < this.crafters.size(); i++)
/*     */     {
/*  88 */       ICrafting icrafting = (ICrafting)this.crafters.get(i);
/*     */ 
/*  90 */       if (this.lastProgressTime == this.inscriber.inscribeProgressTime)
/*     */         continue;
/*  92 */       icrafting.sendProgressBarUpdate(this, 0, this.inscriber.inscribeProgressTime);
/*     */     }
/*     */ 
/*  96 */     this.lastProgressTime = this.inscriber.inscribeProgressTime;
/*     */   }
/*     */ 
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void updateProgressBar(int par1, int par2) {
/* 102 */     if (par1 == 0)
/*     */     {
/* 104 */       this.inscriber.inscribeProgressTime = par2;
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean canInteractWith(EntityPlayer entityplayer)
/*     */   {
/* 111 */     return this.inscriber.isUseableByPlayer(entityplayer);
/*     */   }
/*     */ 
/*     */   public ItemStack transferStackInSlot(EntityPlayer paramEntityPlayer, int paramInt)
/*     */   {
/* 150 */     throw new Error("Unresolved compilation problems: \n\titemID cannot be resolved or is not a field\n\tArcaneLegacy cannot be resolved to a variable\n");
/*     */   }
/*     */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.AlchemContainer
 * JD-Core Version:    0.6.0
 */