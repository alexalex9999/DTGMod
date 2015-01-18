package tutorial.alex.Render;

import org.lwjgl.opengl.GL11;

import tutorial.alex.Entity.EntityStdBullet;
import tutorial.alex.Model.ModelStdBullet;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderStdBullet extends Render{

	// ResourceLocations are typically static and final, but that is not an absolute requirement
	private static final ResourceLocation texture = new ResourceLocation("alexmodid:textures/models/ModelStdBullet.png");
	
	// if you want a model, be sure to add it here:
	private ModelBase model;
	
	public RenderStdBullet() {
		// we could have initialized it above, but here is fine as well:
		model = new ModelStdBullet();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// this method should return your texture, which may be different based
		// on certain characteristics of your custom entity; if that is the case,
		// you may want to make a second method that takes your class:
		return getCustomTexture((EntityStdBullet) entity);
	}
	
	private ResourceLocation getCustomTexture(EntityStdBullet entity) {
		// now you have access to your custom entity fields and methods, if any,
		// and can base the texture to return upon those
		return texture;
	}
	
	// in whatever render method you are using; this one is from Render class:
	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick) {
		// again, if you need some information from your custom entity class, you can cast to your
		// custom class, either passing off to another method, or just doing it here
		// in this example, it is not necessary
		
		// if you are going to do any openGL matrix transformations, be sure to always Push and Pop
		GL11.glPushMatrix();
		
		// bind your texture:
		bindTexture(texture);
		
		// do whatever transformations you need, then render
		
		// typically you will at least want to translate for x/y/z position:
		GL11.glTranslated(x, y-3, z);
		GL11.glRotatef(entity.rotationYaw, 0F, 1F, 0F);
		GL11.glRotatef(-entity.rotationPitch, 1F, 0F, 0F);
		GL11.glScalef(0.5f, 0.5f, 0.5f);
	
		// if you are using a model, you can do so like this:
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		
		// note all the values are 0 except the final argument, which is scale
		// vanilla Minecraft almost excusively uses 0.0625F, but you can change it to whatever works
		
		GL11.glPopMatrix();
	}
}