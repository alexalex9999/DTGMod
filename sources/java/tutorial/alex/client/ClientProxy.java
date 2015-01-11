package tutorial.alex.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.alex.CommonProxy;
import net.minecraft.client.model.ModelBiped;
import tutorial.alex.EntityTest;
import tutorial.alex.EntityTwin;
import tutorial.alex.RenderTest;
import tutorial.alex.RenderTwin;

public class ClientProxy extends CommonProxy {
        
	@Override
	public void registerRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderTest(new ModelBiped(), 0.5F));
	RenderingRegistry.registerEntityRenderingHandler(EntityTwin.class, new RenderTwin(new ModelBiped(), 0.5F));
                // This is for rendering entities and so forth later on
        }
        
}