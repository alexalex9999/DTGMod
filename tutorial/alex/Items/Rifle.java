package tutorial.alex.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tutorial.alex.alex;
import tutorial.alex.Entity.EntityStdBullet;

public class Rifle extends AlchemyGun{
	public Rifle(){
		super();
		setUnlocalizedName("rifle");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:Rifle");
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 0.1F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityStdBullet(par2World, par3EntityPlayer));
	      }
	      return par1ItemStack;
	  }

}
