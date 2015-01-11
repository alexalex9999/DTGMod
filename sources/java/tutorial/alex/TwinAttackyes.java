package tutorial.alex;

import tutorial.alex.EntityTwin;
import net.minecraft.entity.Entity;

public class TwinAttackyes implements TwinBuilderAttack {
	
	EntityTwin twinboss;
	boolean isDone;
	int warmuptime = 0;
	
	public TwinAttackyes(EntityTwin g){
		twinboss = g;
		isDone = false;
	}
	
	@Override
	public void use(Entity target) {
		warmuptime++;
		if(warmuptime >= 100){
			twinboss.worldObj.createExplosion(twinboss, twinboss.posX, twinboss.posY, twinboss.posZ, 4F, false);
			isDone = true;
		}
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
