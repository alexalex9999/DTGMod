package tutorial.alex.Items;

import java.util.List;

import com.google.common.collect.Multimap;

import tutorial.alex.AlexMainRegistry;
import tutorial.alex.Entity.EntityStdBullet;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class XPBOX extends AlchemySword{
	public IIcon[] icons = new IIcon[6];
	private float extra_damage;
	public XPBOX(ToolMaterial material) {
		super(EnumHelper.addToolMaterial("XPBOX", 0, -1, 0.4f, 3.0f, 0));
		this.setHasSubtypes(true);
		setMaxDamage(0);
		setUnlocalizedName("XPBOX");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
		setTextureName("alexmodid:XPBOX");
		Object[] parentArray = {AlexAlchemiesLoader.kinectWands, Items.experience_bottle};
		setParents(parentArray);
		extra_damage = 0.0f;
	}
	public void hitEntity(World par2World, EntityPlayer par3EntityPlayer){
		par2World.spawnEntityInWorld(new EntityXPOrb(par2World));
		extra_damage += 0.1f;
		if (extra_damage > 6.0f){
			extra_damage = 6.0f;
		}
	}
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "XP boost", (double)extra_damage, 0));
        return multimap;
    }
	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < 7; i ++) {
	        this.icons[i] = reg.registerIcon(AlexMainRegistry.MODID + ":XPBOX_" + i);
	    }
	}
	@Override
	public IIcon getIconFromDamage(int meta) {
	    return this.icons[(int)meta];
	}
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 7; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    switch (stack.getItemDamage()) {
	    case 0:
	        return this.getUnlocalizedName() + "Uncharged";
	    case 1:
	        return this.getUnlocalizedName() + "Charge1";
	    case 2:
	        return this.getUnlocalizedName() + "Charge2";
	    case 3:
	        return this.getUnlocalizedName() + "Charge3";
	    case 4:
	        return this.getUnlocalizedName() + "Charge4";
	    case 5:
	        return this.getUnlocalizedName() + "Charge5";
	    case 6:
	    	return this.getUnlocalizedName() + "Charge6";
	    default:
	        return this.getUnlocalizedName();
	    }
	}
}
