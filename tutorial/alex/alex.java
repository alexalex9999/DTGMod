/*     */ package tutorial.alex;
/*     */ 
/*     */ import cpw.mods.fml.common.Mod;
/*     */ import cpw.mods.fml.common.Mod.EventHandler;
/*     */ import cpw.mods.fml.common.Mod.Instance;
/*     */ import cpw.mods.fml.common.SidedProxy;
/*     */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*     */ import cpw.mods.fml.common.event.FMLPostInitializationEvent;
/*     */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*     */ import cpw.mods.fml.common.registry.EntityRegistry;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*     */ import java.util.HashMap;
/*     */ import java.util.Random;

/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityList;
/*     */ import net.minecraft.entity.EntityList.EntityEggInfo;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.Item.ToolMaterial;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.EnumHelper;
/*     */ import tutorial.alex.Blocks.AlchemizedOre;
/*     */ import tutorial.alex.Blocks.Alchemizer;
import tutorial.alex.Blocks.AlexBlockLoader;
/*     */ import tutorial.alex.Blocks.AlexIngotBlock;
/*     */ import tutorial.alex.Blocks.UnstableOre;
/*     */ import tutorial.alex.Entity.EntityTest;
/*     */ import tutorial.alex.Entity.EntityTwin;
/*     */ import tutorial.alex.Items.AlexIngot;
/*     */ import tutorial.alex.Items.AlexItem;
import tutorial.alex.Items.AlexItemLoader;
/*     */ import tutorial.alex.Items.BookAxe;
/*     */ import tutorial.alex.Items.BookIngot;
/*     */ import tutorial.alex.Items.BookPick;
/*     */ import tutorial.alex.Items.BookShovel;
/*     */ import tutorial.alex.Items.BookSword;
/*     */ import tutorial.alex.Items.SassaBook;
/*     */ import tutorial.alex.Items.StableAxe;
/*     */ import tutorial.alex.Items.StablePickaxe;
/*     */ import tutorial.alex.Items.StableShovel;
/*     */ import tutorial.alex.Items.StableSword;
/*     */ import tutorial.alex.Items.TwinSword;
/*     */ import tutorial.alex.Items.UunAxe;
/*     */ import tutorial.alex.Items.UunIngot;
/*     */ import tutorial.alex.Blocks.UunOre;
/*     */ import tutorial.alex.Items.UunPick;
/*     */ import tutorial.alex.Items.UunShovel;
/*     */ import tutorial.alex.Items.UunSword;
/*     */ import tutorial.alex.Items.WhatAxe;
/*     */ import tutorial.alex.Items.WhatIngot;
/*     */ import tutorial.alex.Items.WhatPick;
/*     */ import tutorial.alex.Items.WhatShovel;
/*     */ import tutorial.alex.Items.WhatSword;
import tutorial.alex.Render.AlexEntityManager;
/*     */ import tutorial.alex.Render.CommonProxy;
/*     */ import tutorial.alex.Render.MyGenerator;
/*     */ 
/*     */ @Mod(modid="alexmodid", name="DTG", version="0.2.1ALPHA")
/*     */ public class alex
/*     */ {
/*     */   public static final String MODID = "alexmodid";
/*     */   public static final String VERSION = "0.2.1ALPHA";
/*     */   public static Entity entityTwin;
/*  92 */   public static CreativeTabs tabGodcraft = new CreativeTabs("Destroy the Godmodder")
/*     */   {
			  @Override
			  @SideOnly(Side.CLIENT)
/*     */     public Item getTabIconItem()
/*     */     {
/*  96 */       return AlexItemLoader.twinSword;
/*     */     }
/*  92 */   };
/*     */ 
/*  99 */   
/*     */ 
/*     */   @Mod.Instance("alexmodid")
/*     */   public static alex instance;
/*     */ 
/*     */   @SidedProxy(clientSide="tutorial.alex.client.ClientProxy", serverSide="tutorial.alex.CommonProxy")
/*     */   public static CommonProxy proxy;
/*     */ 
/* 115 */   public boolean isAIEnabled() { return true;
/*     */   }
/*     */ 
/*     */   public static void registerEntity(Class entityClass, String name)
/*     */   {
/* 120 */     int entityID = EntityRegistry.findGlobalUniqueEntityId();
/* 121 */     long seed = name.hashCode();
/* 122 */     Random rand = new Random(seed);
/* 123 */     int primaryColor = rand.nextInt() * 16777215;
/* 124 */     int secondaryColor = rand.nextInt() * 16777215;
/*     */ 
/* 126 */     EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
/* 127 */     EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
/* 128 */     EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
/*     */   }
/*     */ 
/*     */   @Mod.EventHandler
/*     */   public void load(FMLPreInitializationEvent event)
/*     */   {
			  AlexBlockLoader.mainRegistry();
/* 141 */     AlexItemLoader.mainRegistry();
			  AlexEntityManager.mainRegistry();
/* 197 */     proxy.registerRenderInformation();
/*     */   }
/*     */ 
/*     */   @Mod.EventHandler
/*     */   public void load(FMLInitializationEvent event)
/*     */   {
/* 204 */     GameRegistry.registerWorldGenerator(new MyGenerator(), 0);
/* 226 */     proxy.registerRenderers();
/* 227 */     
/*     */   }
/*     */ 
/*     */   @Mod.EventHandler
/*     */   public void postInit(FMLPostInitializationEvent event)
/*     */   {
/*     */   }
/*     */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.alex
 * JD-Core Version:    0.6.0
 */