package tutorial.alex.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

/**
 * ModelGodmodder - CobaltShade/pwntyou1009
 * Created using Tabula 4.1.1
 */
public class ModelGodmodder extends ModelBiped {
    public ModelRenderer field_78123_h;
    public ModelRenderer field_78112_f;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_78124_i;
    public ModelRenderer field_78113_g;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78121_j;
    public ModelRenderer field_78112_f_1;
    public ModelRenderer field_78112_f_2;
    public ModelRenderer field_78112_f_3;
    public ModelRenderer field_78112_f_4;
    public ModelRenderer field_78112_f_5;
    public ModelRenderer field_78112_f_6;
    public ModelRenderer field_78115_e_1;
    public ModelRenderer field_78115_e_2;
    public ModelRenderer field_78115_e_3;
    public ModelRenderer field_78115_e_4;
    public ModelRenderer field_78115_e_5;
    public ModelRenderer field_78115_e_6;
    public ModelRenderer field_78115_e_7;

    public ModelGodmodder() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_78112_f_1 = new ModelRenderer(this, 40, 16);
        this.field_78112_f_1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f_1.addBox(-3.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(field_78112_f_1, 0.0F, 0.0F, 0.10000736613927509F);
        this.field_78115_e_5 = new ModelRenderer(this, 0, 45);
        this.field_78115_e_5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e_5.addBox(-5.0F, 13.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(field_78115_e_5, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78112_f_2 = new ModelRenderer(this, 22, 32);
        this.field_78112_f_2.mirror = true;
        this.field_78112_f_2.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f_2.addBox(-3.0F, 0.3F, -2.0F, 4, 6, 4, -0.9F);
        this.setRotateAngle(field_78112_f_2, 0.0F, 0.0F, 0.09302604913129776F);
        this.field_78112_f_4 = new ModelRenderer(this, 38, 35);
        this.field_78112_f_4.mirror = true;
        this.field_78112_f_4.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f_4.addBox(-3.0F, 2.0F, 1.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(field_78112_f_4, 0.0F, 0.0F, 0.09302604913129776F);
        this.field_78115_e_6 = new ModelRenderer(this, 0, 46);
        this.field_78115_e_6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e_6.addBox(-5.0F, 14.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(field_78115_e_6, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78112_f_5 = new ModelRenderer(this, 38, 35);
        this.field_78112_f_5.mirror = true;
        this.field_78112_f_5.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f_5.addBox(0.0F, 2.0F, 1.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(field_78112_f_5, 0.0F, 0.0F, 0.09302604913129776F);
        this.field_78115_e_7 = new ModelRenderer(this, 0, 46);
        this.field_78115_e_7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e_7.addBox(-3.0F, 14.0F, -1.0F, 5, 1, 1, 0.0F);
        this.setRotateAngle(field_78115_e_7, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78123_h = new ModelRenderer(this, 0, 16);
        this.field_78123_h.setRotationPoint(-1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_78123_h.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.field_78112_f = new ModelRenderer(this, 38, 35);
        this.field_78112_f.mirror = true;
        this.field_78112_f.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f.addBox(0.0F, 2.0F, -2.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(field_78112_f, 0.0F, 0.0F, 0.09302604913129776F);
        this.field_78113_g = new ModelRenderer(this, 32, 0);
        this.field_78113_g.mirror = true;
        this.field_78113_g.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.field_78113_g.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78113_g, 0.0F, 0.0F, -0.10000736613927509F);
        this.field_78112_f_6 = new ModelRenderer(this, 40, 26);
        this.field_78112_f_6.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f_6.addBox(-3.0F, 8.0F, -2.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(field_78112_f_6, 0.0F, 0.0F, 0.10000736613927509F);
        this.field_78112_f_3 = new ModelRenderer(this, 38, 35);
        this.field_78112_f_3.mirror = true;
        this.field_78112_f_3.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_78112_f_3.addBox(-3.0F, 2.0F, -2.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(field_78112_f_3, 0.0F, 0.0F, 0.09302604913129776F);
        this.field_78115_e = new ModelRenderer(this, 6, 45);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e.addBox(1.0F, 13.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(field_78115_e, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78124_i = new ModelRenderer(this, 0, 16);
        this.field_78124_i.mirror = true;
        this.field_78124_i.setRotationPoint(1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_78124_i.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78115_e_4 = new ModelRenderer(this, 0, 47);
        this.field_78115_e_4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e_4.addBox(-2.0F, 15.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(field_78115_e_4, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78121_j = new ModelRenderer(this, 24, 0);
        this.field_78121_j.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78121_j.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.field_78115_e_2 = new ModelRenderer(this, 0, 32);
        this.field_78115_e_2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e_2.addBox(-5.0F, 0.0F, -1.0F, 10, 13, 1, 0.0F);
        this.setRotateAngle(field_78115_e_2, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78115_e_3 = new ModelRenderer(this, 9, 45);
        this.field_78115_e_3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.field_78115_e_3.addBox(4.0F, 13.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(field_78115_e_3, 0.0F, 3.141592653589793F, 0.0F);
        this.field_78115_e_1 = new ModelRenderer(this, 16, 16);
        this.field_78115_e_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e_1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78112_f_1.render(f5);
        this.field_78115_e_5.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.field_78112_f_2.offsetX, this.field_78112_f_2.offsetY, this.field_78112_f_2.offsetZ);
        GL11.glTranslatef(this.field_78112_f_2.rotationPointX * f5, this.field_78112_f_2.rotationPointY * f5, this.field_78112_f_2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.5D, 1.0D);
        GL11.glTranslatef(-this.field_78112_f_2.offsetX, -this.field_78112_f_2.offsetY, -this.field_78112_f_2.offsetZ);
        GL11.glTranslatef(-this.field_78112_f_2.rotationPointX * f5, -this.field_78112_f_2.rotationPointY * f5, -this.field_78112_f_2.rotationPointZ * f5);
        this.field_78112_f_2.render(f5);
        GL11.glPopMatrix();
        this.field_78112_f_4.render(f5);
        this.field_78115_e_6.render(f5);
        this.field_78112_f_5.render(f5);
        this.field_78115_e_7.render(f5);
        this.field_78123_h.render(f5);
        this.field_78116_c.render(f5);
        this.field_78112_f.render(f5);
        this.field_78113_g.render(f5);
        this.field_78112_f_6.render(f5);
        this.field_78112_f_3.render(f5);
        this.field_78115_e.render(f5);
        this.field_78124_i.render(f5);
        this.field_78115_e_4.render(f5);
        this.field_78121_j.render(f5);
        this.field_78115_e_2.render(f5);
        this.field_78115_e_3.render(f5);
        this.field_78115_e_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
