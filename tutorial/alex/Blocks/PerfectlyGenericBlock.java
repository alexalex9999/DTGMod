package tutorial.alex.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tutorial.alex.Alchemy;

public abstract class PerfectlyGenericBlock extends Block implements Alchemy{
	
	private byte level = 0;
	private boolean needsCharging = false;
	private int chargingTime = 0;
	private boolean oneUse = false;
	private Object[] parents = new Object[0];

	protected PerfectlyGenericBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
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
