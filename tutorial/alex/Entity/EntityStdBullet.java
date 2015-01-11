package tutorial.alex.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityStdBullet extends EntityThrowable{

	public EntityStdBullet(World par1World) {
		super(par1World);
	}
	public EntityStdBullet(World par1World, EntityLivingBase par2EntityLivingBase){
        super(par1World, par2EntityLivingBase);
    }
	public EntityStdBullet(World par1World, double par2, double par4, double par6){
        super(par1World, par2, par4, par6);
    }

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if (pos.entityHit != null)
        {
            pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 2.5f);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
		
	}
	@Override
	protected float func_70182_d(){
		return 7.5f;
		
	}

}
