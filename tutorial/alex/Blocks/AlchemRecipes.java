/*     */ package tutorial.alex.Blocks;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ public class AlchemRecipes
/*     */ {
/*  12 */   private static final AlchemRecipes alchems = new AlchemRecipes();
/*     */   private HashMap<List<Integer>, ItemStack> metaInscribingList;
/*     */   private HashMap<List<Integer>, Float> metaExperience;
/*     */ 
/*     */   public static final AlchemRecipes alchems()
/*     */   {
/*  24 */     return alchems;
/*     */   }
/*     */ 
/*     */   public void addInscribing(List<Integer> paramList, ItemStack paramItemStack, float paramFloat)
/*     */   {
/*  63 */     throw new Error("Unresolved compilation problem: \n\tThe method put(List<Integer>, Float) in the type HashMap<List<Integer>,Float> is not applicable for the arguments (List<Object>, float)\n");
/*     */   }
/*     */ 
/*     */   public ItemStack getInscribingResult(ItemStack[] runes)
/*     */   {
/*  75 */     int recipeLength = 0;
/*  76 */     for (int i = 0; (i < runes.length) && (runes[i] != null) && (i < AlchemContainer.RUNE_SLOTS); i++)
/*     */     {
/*  79 */       recipeLength++;
/*     */     }
/*     */ 
/*  83 */     Integer[] idIndex = new Integer[recipeLength];
/*  84 */     for (int i = 0; i < recipeLength; i++)
/*     */     {
/*  88 */       idIndex[i] = Integer.valueOf(runes[i].getItemDamage());
/*     */     }
/*     */ 
/*  91 */     return (ItemStack)this.metaInscribingList.get(Arrays.asList(idIndex));
/*     */   }
/*     */ 
/*     */   public float getExperience(ItemStack item)
/*     */   {
/*  99 */     if ((item == null) || (item.getItem() == null))
/*     */     {
/* 101 */       return 0.0F;
/*     */     }
/* 103 */     float ret = -1.0F;
/* 104 */     if (ret < 0.0F) if (this.metaExperience.containsKey(Arrays.asList(new Object[] { item, Integer.valueOf(item.getItemDamage()) })))
/*     */       {
/* 106 */         ret = ((Float)this.metaExperience.get(Arrays.asList(new Object[] { item, Integer.valueOf(item.getItemDamage()) }))).floatValue();
/*     */       }
/*     */ 
/* 109 */     return ret < 0.0F ? 0.0F : ret;
/*     */   }
/*     */ 
/*     */   public Map<List<Integer>, ItemStack> getMetaInscribingList()
/*     */   {
/* 114 */     return this.metaInscribingList;
/*     */   }
/*     */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.AlchemRecipes
 * JD-Core Version:    0.6.0
 */