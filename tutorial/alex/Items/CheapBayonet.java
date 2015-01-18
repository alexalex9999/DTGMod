package tutorial.alex.Items;

import java.util.Arrays;

import com.google.common.collect.Multimap;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Entity.EntityStdBullet;


public class CheapBayonet extends AlchemyGun{
	public CheapBayonet(){
		super();
		setUnlocalizedName("cheapBayonet");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:CheapBayonet");
		Object[] parentArray = {AlexSuppliesLoader.rifle, AlexSuppliesLoader.cheapSword};
		setParents(parentArray);
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntityStdBullet(par2World, par3EntityPlayer));
	      }
	      return par1ItemStack;
	  }
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)4.0f, 0));
        return multimap;
    }
}
