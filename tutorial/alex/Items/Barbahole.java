package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import tutorial.alex.AlexMainRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Barbahole extends AlchemyItem {
 
	public Barbahole(){
		super();
		setUnlocalizedName("barbaHole");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:barbahole");
 }
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!par2World.isRemote){
			par2World.createExplosion(par3EntityPlayer, par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, 3F, bFull3D);
		}
		return par1ItemStack;
	}
}