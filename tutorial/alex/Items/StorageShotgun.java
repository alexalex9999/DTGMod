package tutorial.alex.Items;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tutorial.alex.alex;
import tutorial.alex.Entity.EntityStdBullet;
import tutorial.alex.Entity.EntityStorageShotgunBullet;

public class StorageShotgun extends AlchemyGun{
	Block insertedBlock;
	public StorageShotgun(){
		super();
		setUnlocalizedName("storageShotgun");
		setCreativeTab(alex.tabGodcraft);
		setTextureName("alexmodid:StorageShotgun");
		setParents(Arrays.asList(AlexSuppliesLoader.rifle, AlexSuppliesLoader.backpackAlch));
		this.insertedBlock = Blocks.tnt;
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 0.2F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityStorageShotgunBullet(par2World, par3EntityPlayer, insertedBlock));
	      }
	      return par1ItemStack;
	  }
}
