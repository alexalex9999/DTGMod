package tutorial.alex;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderTest extends RenderBiped {

private static final ResourceLocation textureLocation = new ResourceLocation(alex.MODID + ":" + "textures/models/modpack.png");

public RenderTest(ModelBiped model, float shadowSize) {
super(model, shadowSize);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}
}