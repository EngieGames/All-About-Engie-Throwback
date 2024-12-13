
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyosit;

public class RareEngieSharkoLayRenderer extends MobRenderer<RareEngieSharkoLayEntity, Modelboyosit<RareEngieSharkoLayEntity>> {
	public RareEngieSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareEngieSharkoLayEntity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/reboyot.png");
	}
}
