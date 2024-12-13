
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.AngryEngiEntity;
import net.mcreator.allaboutengiethrowback.client.model.Modelangrythrowback;

public class AngryEngiRenderer extends MobRenderer<AngryEngiEntity, Modelangrythrowback<AngryEngiEntity>> {
	public AngryEngiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangrythrowback(context.bakeLayer(Modelangrythrowback.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngiEntity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/angrythrowback.png");
	}
}
