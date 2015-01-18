package tutorial.alex.Items;

import java.util.Arrays;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Entity.EntityStdBullet;

public class iShoot extends AlchemyGun{
	public iShoot(){
		super();
		setUnlocalizedName("iShoot");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:iShoot");
		Object[] parentArray = {AlexSuppliesLoader.rifle, AlexSuppliesLoader.computerAlch};
		setParents(parentArray);
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 0.1F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityStdBullet(par2World, par3EntityPlayer, 7.0f));
	      }
	      return par1ItemStack;
	  }
}
