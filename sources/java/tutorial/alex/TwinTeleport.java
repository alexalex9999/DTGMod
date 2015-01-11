package tutorial.alex;

import tutorial.alex.EntityTwin;
import net.minecraft.entity.Entity;

public class TwinTeleport implements TwinBuilderAttack {
	
	EntityTwin twinboss;
	boolean isDone;
	double[] d;
	int warmuptime = 0;
	
	public TwinTeleport(EntityTwin e){
		twinboss = e;
		isDone = false;
	}
	
	@Override
	public void use(Entity target) {
		warmuptime++;
		if(d == null){
			d = twinboss.getTeleportRandomly();
		}
		twinboss.teleportTo(d[0], d[1], d[2], warmuptime);
		if(warmuptime >= 100){
			isDone = true;
		}
	}

	@Override
	public int getTier() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return isDone;
	}

}
