
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyo;

public class LegendarySharkoRenderer extends MobRenderer<LegendarySharkoEntity, Modelboyo<LegendarySharkoEntity>> {
	public LegendarySharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoEntity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/boyolegthrowback.png");
	}
}
