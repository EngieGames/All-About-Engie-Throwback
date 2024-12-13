
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoEntity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyo;

public class RareEngieSharkoRenderer extends MobRenderer<RareEngieSharkoEntity, Modelboyo<RareEngieSharkoEntity>> {
	public RareEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareEngieSharkoEntity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/reboyo.png");
	}
}
