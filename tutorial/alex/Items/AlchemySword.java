package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import tutorial.alex.Alchemy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class AlchemySword extends ItemSword implements Alchemy{
	private byte level;
	private Object[] parents;

	public AlchemySword(ToolMaterial material) {
		super(material);
		this.level = 1;
		this.parents = new Object[0];
		
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
	public void setParents(Object[] parents){
		this.parents = parents;
	}
	public Object[] getParents(){
		return this.parents;
	}

}
