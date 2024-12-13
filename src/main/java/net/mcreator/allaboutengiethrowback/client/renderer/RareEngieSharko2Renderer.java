
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.RareEngieSharko2Entity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyo;

public class RareEngieSharko2Renderer extends MobRenderer<RareEngieSharko2Entity, Modelboyo<RareEngieSharko2Entity>> {
	public RareEngieSharko2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareEngieSharko2Entity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/re2boyo.png");
	}
}
