
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.allaboutengiethrowback.client.renderer.SharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.SharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.SharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareSharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareSharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareSharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareEngieSharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareEngieSharkoTamed2Renderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareEngieSharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareEngieSharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareEngieSharkoLay2Renderer;
import net.mcreator.allaboutengiethrowback.client.renderer.RareEngieSharko2Renderer;
import net.mcreator.allaboutengiethrowback.client.renderer.QuizRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.ProtogenRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.MythicSharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.MythicSharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.MythicSharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.MadEngiRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.LegendarySharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.LegendarySharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.LegendarySharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.ExoticSharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.ExoticSharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.ExoticSharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.EnragedEngiRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.EngieSharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.EngieSharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.EngieSharkoLayRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.EngiRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.DevEngiRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.CreatorRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.BloodyEngiRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.AngryEngiRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.AngryCreatorRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.AlbinoSharkoTamedRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.AlbinoSharkoRenderer;
import net.mcreator.allaboutengiethrowback.client.renderer.AlbinoSharkoLayRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllAboutEngieThrowbackModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.SHARKO.get(), SharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.SHARKO_TAMED.get(), SharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.SHARKO_LAY.get(), SharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ALBINO_SHARKO.get(), AlbinoSharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_SHARKO.get(), RareSharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_SHARKO_TAMED.get(), RareSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_SHARKO_LAY.get(), RareSharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.LEGENDARY_SHARKO.get(), LegendarySharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.MYTHIC_SHARKO.get(), MythicSharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.MYTHIC_SHARKO_LAY.get(), MythicSharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.EXOTIC_SHARKO.get(), ExoticSharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ENGIE_SHARKO.get(), EngieSharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ENGIE_SHARKO_LAY.get(), EngieSharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO.get(), RareEngieSharkoRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO_TAMED.get(), RareEngieSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO_LAY.get(), RareEngieSharkoLayRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO_2.get(), RareEngieSharko2Renderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO_TAMED_2.get(), RareEngieSharkoTamed2Renderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO_LAY_2.get(), RareEngieSharkoLay2Renderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ENGI.get(), EngiRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.CREATOR.get(), CreatorRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.DEV_ENGI.get(), DevEngiRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.QUIZ.get(), QuizRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.MAD_ENGI.get(), MadEngiRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ANGRY_ENGI.get(), AngryEngiRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ENRAGED_ENGI.get(), EnragedEngiRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.ANGRY_CREATOR.get(), AngryCreatorRenderer::new);
		event.registerEntityRenderer(AllAboutEngieThrowbackModEntities.BLOODY_ENGI.get(), BloodyEngiRenderer::new);
	}
}
