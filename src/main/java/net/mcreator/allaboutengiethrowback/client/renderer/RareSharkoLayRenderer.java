
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyosit;

public class RareSharkoLayRenderer extends MobRenderer<RareSharkoLayEntity, Modelboyosit<RareSharkoLayEntity>> {
	public RareSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoLayEntity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/boyorathrowbackt.png");
	}
}
