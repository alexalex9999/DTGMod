package tutorial.alex.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityStdBullet extends EntityThrowable{
	
	float damage_dealt;
	public EntityStdBullet(World par1World) {
		super(par1World);
		damage_dealt = 4.0f;
	}
	public EntityStdBullet(World par1World, float damage) {
		super(par1World);
		damage_dealt = damage;
	}
	public EntityStdBullet(World par1World, EntityLivingBase par2EntityLivingBase){
        super(par1World, par2EntityLivingBase);
        damage_dealt = 4.0f;
    }
	public EntityStdBullet(World par1World, EntityLivingBase par2EntityLivingBase, float damage){
        super(par1World, par2EntityLivingBase);
        damage_dealt = damage;
    }
	public EntityStdBullet(World par1World, double par2, double par4, double par6){
        super(par1World, par2, par4, par6);
        damage_dealt = 4.0f;
    }
	public EntityStdBullet(World par1World, double par2, double par4, double par6, float damage){
        super(par1World, par2, par4, par6);
        damage_dealt = damage;
    }

	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if (pos.entityHit != null)
        {
            pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage_dealt);
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
