package tutorial.alex;

import tutorial.alex.EntityTwin;
import net.minecraft.entity.Entity;
import tutorial.alex.EntityTest;

public class TwinSpawn implements TwinBuilderAttack {
	
	EntityTwin twinboss;
	EntityTest modpack;
	boolean isDone;
	int warmuptime = 0;
	

	public TwinSpawn(EntityTwin g){
		twinboss = g;
		isDone = false;
		

			
		}
		public TwinSpawn(EntityTest e){
		modpack = e;
		isDone = false;
		
	}
	
	@Override
	public void use(Entity target) {
		modpack.setLocationAndAngles(twinboss.posX,twinboss.posY, twinboss.posZ, 0F, 0F);
		twinboss.worldObj.spawnEntityInWorld(modpack);
			isDone = true;
		}
	

	@Override
	public int getTier() {
		return 2;
	}

	@Override
	public boolean isDone() {
		return isDone;
	}

}
