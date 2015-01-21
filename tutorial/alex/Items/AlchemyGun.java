package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import tutorial.alex.Alchemy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class AlchemyGun extends Item implements Alchemy{
	private byte level = 0;
	private boolean needsCharging = false;
	private int chargingTime = 0;
	private boolean oneUse = false;
	private Object[] parents = new Object[0];
	public AlchemyGun(){
		
	}
	public void setLevel(byte level){
		if (level <= 11){
			this.level = level;
		}
		else{
			this.level = 10;
		}
	}
	public byte getLevel(){
		return this.level;
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
	public boolean getNeedsCharging(){
		return this.needsCharging;
	}
	public int getChargingTime(){
		return this.chargingTime;
	}
	public void setOneShot(boolean oneUse){
		this.oneUse = oneUse;
	}
	public boolean getOneUse(){
		return this.oneUse;
	}
	public void setParents(Object[] parents){
		this.parents = parents;
	}
	public Object[] getParents(){
		return this.parents;
	}

}