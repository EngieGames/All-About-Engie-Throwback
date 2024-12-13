
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.allaboutengiethrowback.client.model.Modelboyosit;
import net.mcreator.allaboutengiethrowback.client.model.Modelboyo;
import net.mcreator.allaboutengiethrowback.client.model.Modelangrythrowback;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AllAboutEngieThrowbackModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelboyo.LAYER_LOCATION, Modelboyo::createBodyLayer);
		event.registerLayerDefinition(Modelboyosit.LAYER_LOCATION, Modelboyosit::createBodyLayer);
		event.registerLayerDefinition(Modelangrythrowback.LAYER_LOCATION, Modelangrythrowback::createBodyLayer);
	}
}
