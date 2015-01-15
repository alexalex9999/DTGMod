package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

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
	public List<Item> parents;
	public AlchemyGun(){
		this.level = 1;
		this.needsCharging = false;
		this.chargingTime = 0;
		this.oneUse = false;
		this.parents = new ArrayList<Item>();
	}
	public void setLevel(int level){
		this.level = level;
	}
	public void setCharging(boolean needsCharging, int chargingTime){
		this.needsCharging = needsCharging;
		if (needsCharging){
			this.chargingTime = chargingTime;
		}
		else{
			this.chargingTime = 0;
		}
	}
	public void setOneShot(boolean oneUse){
		this.oneUse = oneUse;
	}
	public void setParents(List<Item> parents){
		this.parents = parents;
	}

}