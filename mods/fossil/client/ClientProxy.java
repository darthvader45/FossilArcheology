package mods.fossil.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.fossil.CommonProxy;
import mods.fossil.entity.EntityAncientJavelin;
import mods.fossil.entity.EntityDinoEgg;
import mods.fossil.entity.EntityJavelin;
import mods.fossil.entity.EntityStoneboard;
import mods.fossil.entity.RenderDinoEgg;
import mods.fossil.entity.RenderJavelin;
import mods.fossil.entity.RenderStoneboard;
import mods.fossil.entity.mob.EntityBones;
import mods.fossil.entity.mob.EntityBrachiosaurus;
import mods.fossil.entity.mob.EntityDilophosaurus;
import mods.fossil.entity.mob.EntityFailuresaurus;
import mods.fossil.entity.mob.EntityFriendlyPigZombie;
import mods.fossil.entity.mob.EntityMammoth;
import mods.fossil.entity.mob.EntityMosasaurus;
import mods.fossil.entity.mob.EntityNautilus;
import mods.fossil.entity.mob.EntityPigBoss;
import mods.fossil.entity.mob.EntityPlesiosaur;
import mods.fossil.entity.mob.EntityPregnantPig;
import mods.fossil.entity.mob.EntityPterosaur;
import mods.fossil.entity.mob.EntitySmilodon;
import mods.fossil.entity.mob.EntitySpinosaurus;
import mods.fossil.entity.mob.EntityStegosaurus;
import mods.fossil.entity.mob.EntityTRex;
import mods.fossil.entity.mob.EntityTriceratops;
import mods.fossil.entity.mob.EntityVelociraptor;
import mods.fossil.entity.mob.ModelDilophosaurus;
import mods.fossil.entity.mob.ModelFailuresaurus;
import mods.fossil.entity.mob.ModelMammoth;
import mods.fossil.entity.mob.ModelNautilus;
import mods.fossil.entity.mob.ModelPigBoss;
import mods.fossil.entity.mob.ModelPterosaurGround;
import mods.fossil.entity.mob.ModelSmilodon;
import mods.fossil.entity.mob.ModelSpinosaurus;
import mods.fossil.entity.mob.ModelStegosaurus;
import mods.fossil.entity.mob.ModelTRex;
import mods.fossil.entity.mob.ModelTriceratops;
import mods.fossil.entity.mob.ModelVelociraptor;
import mods.fossil.entity.mob.RenderBrachiosaurus;
import mods.fossil.entity.mob.RenderDilophosaurus;
import mods.fossil.entity.mob.RenderFailuresaurus;
import mods.fossil.entity.mob.RenderMammoth;
import mods.fossil.entity.mob.RenderMosasaurus;
import mods.fossil.entity.mob.RenderNautilus;
import mods.fossil.entity.mob.RenderPigBoss;
import mods.fossil.entity.mob.RenderPlesiosaur;
import mods.fossil.entity.mob.RenderPterosaur;
import mods.fossil.entity.mob.RenderSmilodon;
import mods.fossil.entity.mob.RenderSpinosaurus;
import mods.fossil.entity.mob.RenderStegosaurus;
import mods.fossil.entity.mob.RenderTRex;
import mods.fossil.entity.mob.RenderTriceratops;
import mods.fossil.entity.mob.RenderVelociraptor;
import mods.fossil.guiBlocks.RenderTNClock;
import mods.fossil.guiBlocks.TileEntityTimeMachine;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.RenderVillager;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderThings()
	{

		RenderingRegistry.registerEntityRenderingHandler(EntityStoneboard.class, new RenderStoneboard());
		RenderingRegistry.registerEntityRenderingHandler(EntityTriceratops.class, new RenderTriceratops(new ModelTriceratops(), new ModelTriceratops(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVelociraptor.class, new RenderVelociraptor(new ModelVelociraptor(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTRex.class, new RenderTRex(new ModelTRex(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFailuresaurus.class, new RenderFailuresaurus(new ModelFailuresaurus(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPigBoss.class, new RenderPigBoss(new ModelPigBoss(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFriendlyPigZombie.class, new RenderBiped(new ModelZombie(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPterosaur.class, new RenderPterosaur(new ModelPterosaurGround(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNautilus.class, new RenderNautilus(new ModelNautilus(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPlesiosaur.class, new RenderPlesiosaur(0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMosasaurus.class, new RenderMosasaurus(0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityStegosaurus.class, new RenderStegosaurus(new ModelStegosaurus(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDinoEgg.class, new RenderDinoEgg(1.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPregnantPig.class, new RenderPig(new ModelPig(), new ModelPig(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDilophosaurus.class, new RenderDilophosaurus(new ModelDilophosaurus(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySmilodon.class, new RenderSmilodon(new ModelSmilodon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJavelin.class, new RenderJavelin());
		RenderingRegistry.registerEntityRenderingHandler(EntityAncientJavelin.class, new RenderJavelin());
		RenderingRegistry.registerEntityRenderingHandler(EntityBones.class, new RenderBiped(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrachiosaurus.class, new RenderBrachiosaurus(0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMammoth.class, new RenderMammoth(new ModelMammoth(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpinosaurus.class, new RenderSpinosaurus(new ModelSpinosaurus(), 0.5F));
		//RenderingRegistry.registerBlockHandler(new FossilBlockRenderHandler());
		
	}
	
	@Override
	public void registerTileEntitySpecialRenderer()
	{
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTimeMachine.class, new RenderTNClock());
	}
	
	@Override
	public void registerSounds()
	{
		MinecraftForge.EVENT_BUS.register(new DinoSoundHandler());
	}
	
}
