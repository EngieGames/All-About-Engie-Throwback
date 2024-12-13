
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoTamed2Entity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyo;

public class RareEngieSharkoTamed2Renderer extends MobRenderer<RareEngieSharkoTamed2Entity, Modelboyo<RareEngieSharkoTamed2Entity>> {
	public RareEngieSharkoTamed2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareEngieSharkoTamed2Entity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/re2boyot.png");
	}
}
