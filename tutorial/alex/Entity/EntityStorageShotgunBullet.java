package tutorial.alex.Entity;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityStorageShotgunBullet extends EntityThrowable{
	
	public Block insertedBlock;
	public EntityStorageShotgunBullet(World p_i1776_1_, Block insertedBlock) {
		super(p_i1776_1_);
		this.insertedBlock = insertedBlock;
		setThrowableHeading(this.motionX, this.motionY, this.motionZ, 7.5F, 1.0F);
	}
	
	public EntityStorageShotgunBullet(World par1World, EntityLivingBase par2EntityLivingBase, Block insertedBlock){
        super(par1World, par2EntityLivingBase);
		this.insertedBlock = insertedBlock;
		setThrowableHeading(this.motionX, this.motionY, this.motionZ, 7.5F, 1.0F);
	}
	public EntityStorageShotgunBullet(World par1World, double par2, double par4, double par6, Block insertedBlock){
        super(par1World, par2, par4, par6);
        this.insertedBlock = insertedBlock;
        setThrowableHeading(this.motionX, this.motionY, this.motionZ, 7.5F, 1.0F);
	}
	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if (this.insertedBlock == Blocks.tnt){
			this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0f, true); 
			if (pos.entityHit != null){
				pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 2.5f);
			}
		}
		else if (pos.entityHit != null)
        {
			if (this.insertedBlock == Blocks.netherrack){
				pos.entityHit.setFire(3);
			}
			else{
				float damage;
				if (this.insertedBlock.getBlockHardness(null, 0, 0, 0) >= 5.0f){
					damage = 12.5f;
				}
				else{
					damage = 2.0f * this.insertedBlock.getBlockHardness(null, 0, 0, 0);
				}
	            pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);
			}
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("blockdust(" + this.insertedBlock.getIdFromBlock(this.insertedBlock) + ")", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
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
