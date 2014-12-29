package tutorial.alex.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

//Very WIP. Doesn't shoot.
public class AlchemyGun extends Item{
	public int level;
	public boolean needsCharging;
	public boolean oneUse;
	public int chargingTime;
	public AlchemyGun(int level, boolean needsCharging, boolean oneUse, int chargingTime){
		this.level = level;
		this.needsCharging = needsCharging;
		this.oneUse = oneUse;
		this.chargingTime = chargingTime;
	}
}
