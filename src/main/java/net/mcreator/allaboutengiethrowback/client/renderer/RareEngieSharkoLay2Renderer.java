
package net.mcreator.allaboutengiethrowback.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoLay2Entity;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyosit;

public class RareEngieSharkoLay2Renderer extends MobRenderer<RareEngieSharkoLay2Entity, Modelboyosit<RareEngieSharkoLay2Entity>> {
	public RareEngieSharkoLay2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareEngieSharkoLay2Entity entity) {
		return new ResourceLocation("all_about_engie_throwback:textures/entities/re2boyot.png");
	}
}
