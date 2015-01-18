package tutorial.alex.Items;

import java.util.Arrays;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Entity.EntityStdBullet;
import tutorial.alex.Entity.EntityStorageShotgunBullet;

public class StorageShotgun extends AlchemyGun{
	Block insertedBlock;
	Item insertedItem;
	public StorageShotgun(){
		super();
		setUnlocalizedName("storageShotgun");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:StorageShotgun");
		Object[] parentArray = {AlexSuppliesLoader.rifle, AlexSuppliesLoader.backpackAlch};
		setParents(parentArray);
		this.insertedBlock = Blocks.tnt;
		this.insertedItem = null;
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 0.2F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	    	  if (insertedBlock != null){
	    		  par2World.spawnEntityInWorld(new EntityStorageShotgunBullet(par2World, par3EntityPlayer, insertedBlock));
	    	  }
	    	  else if (insertedItem != null){
	    		  par2World.spawnEntityInWorld(new EntityStorageShotgunBullet(par2World, par3EntityPlayer, insertedItem));
	    	  }
	      }
	      return par1ItemStack;
	  }
}
