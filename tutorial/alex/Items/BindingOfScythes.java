package tutorial.alex.Items;

import java.util.Arrays;

import com.google.common.collect.Multimap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Entity.EntityStdBullet;


public class BindingOfScythes extends AlchemyGun{
	
	private long cooldown;
	
	public BindingOfScythes(){
		super();
		setUnlocalizedName("bindingOfScythes");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:BindingOfScythes");
		//Object[] parentArray = {AlexSuppliesLoader.rifle, AlexSuppliesLoader.cheapSword}; // Implement the Death Sickle and Elbrus?
		//setParents(parentArray);
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      if(par3EntityPlayer.isSneaking())
	      {
	    	  if(cooldown <= 0)
	    	  {
		    	 par3EntityPlayer.addPotionEffect(new PotionEffect(5, 600, 0)); //give strength I for 600 ticks = 30 seconds
		    	 cooldown = 1200; //cooldown is 1 minute = 1200 ticks
	    	  }

	      }else
	      {
		  par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityStdBullet(par2World, par3EntityPlayer)); // Right now the projectiles are bullets
	      }
	      }
	      return par1ItemStack;
	  }
	@Override
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) 
	{
		if(cooldown > 0)
		{
			cooldown--;
		}
	}
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)5.0f, 0));
        return multimap;
    }
}
