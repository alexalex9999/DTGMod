package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Barbahole extends AlchemyItem
 {
 
{
super(AlexItemLoader);
setUnlocalizedName("barbaHole");
   setCreativeTab(AlexMainRegistry.tabGodcraft);
     setTextureName("alexmodid:barbahole");
 }
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
	world.createExplosion(EntityPlayer, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, 3F);
}
}