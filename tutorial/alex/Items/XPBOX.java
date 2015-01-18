package tutorial.alex.Items;

import com.google.common.collect.Multimap;

import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Entity.EntityStdBullet;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class XPBOX extends AlchemySword{
	private float extra_damage;
	public XPBOX(ToolMaterial material) {
		super(EnumHelper.addToolMaterial("XPBOX", 0, 1000, 0.4f, 3.0f, 0));
		setUnlocalizedName("XPBOX");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:XPBOX");
		Object[] parentArray = {AlexAlchemiesLoader.kinectWands, Items.experience_bottle};
		setParents(parentArray);
		extra_damage = 0.0f;
	}
	public void hitEntity(World par2World, EntityPlayer par3EntityPlayer){
		par2World.spawnEntityInWorld(new EntityXPOrb(par2World));
		extra_damage += 0.5f;
	}
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "XP boost", (double)extra_damage, 0));
        return multimap;
    }

}
