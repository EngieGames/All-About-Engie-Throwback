
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyosit;

public class EngieSharkoLayRenderer extends MobRenderer<EngieSharkoLayEntity, Modelboyosit<EngieSharkoLayEntity>> {
	public EngieSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoLayEntity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/boyoethrowbackt.png");
	}
}