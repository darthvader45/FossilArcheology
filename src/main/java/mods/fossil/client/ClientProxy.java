package mods.fossil.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.fossil.CommonProxy;
import mods.fossil.Fossil;
import mods.fossil.client.gui.GuiBoneHelmet;
import mods.fossil.client.model.*;
import mods.fossil.client.renderer.entity.*;
import mods.fossil.client.renderer.item.ItemFigurineRenderer;
import mods.fossil.client.renderer.tileentity.RenderTNClock;
import mods.fossil.client.renderer.tileentity.TileEntityFigurineRenderer;
import mods.fossil.entity.*;
import mods.fossil.entity.mob.*;
import mods.fossil.guiBlocks.TileEntityFigurine;
import mods.fossil.guiBlocks.TileEntityTimeMachine;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderThings()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityStoneboard.class, new RenderStoneboard());
        RenderingRegistry.registerEntityRenderingHandler(EntityTriceratops.class, new RenderTriceratops(new ModelTriceratops(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVelociraptor.class, new RenderVelociraptor(new ModelVelociraptor(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTRex.class, new RenderTRex(new ModelTRex(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFailuresaurus.class, new RenderFailuresaurus(new ModelFailuresaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPigBoss.class, new RenderPigBoss(new ModelPigBoss(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityFriendlyPigZombie.class, new RenderBiped(new ModelZombie(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPterosaur.class, new RenderPterosaur(new ModelPterosaurGround(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityNautilus.class, new RenderNautilus(new ModelNautilus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlesiosaur.class, new RenderPlesiosaur(new ModelPlesiosaur(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMosasaurus.class, new RenderMosasaurus(new ModelMosasaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityStegosaurus.class, new RenderStegosaurus(new ModelStegosaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDinoEgg.class, new RenderDinoEgg(1.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPregnantPig.class, new RenderPig(new ModelPig(), new ModelPig(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDilophosaurus.class, new RenderDilophosaurus(new ModelDilophosaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySmilodon.class, new RenderSmilodon(new ModelSmilodon(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJavelin.class, new RenderJavelin());
        RenderingRegistry.registerEntityRenderingHandler(EntityAncientJavelin.class, new RenderJavelin());
        RenderingRegistry.registerEntityRenderingHandler(EntityBones.class, new RenderBones());
        RenderingRegistry.registerEntityRenderingHandler(EntityBrachiosaurus.class, new RenderBrachiosaurus(new ModelBrachiosaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMammoth.class, new RenderMammoth(new ModelMammoth(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinosaurus.class, new RenderSpinosaurus(new ModelSpinosaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCompsognathus.class, new RenderCompsognathus(new ModelCompsognathus(), 0.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDodo.class, new RenderDodo(new ModelDodo(), 0.3F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDodoEgg.class, new RenderSnowball(Fossil.dodoEgg));
        RenderingRegistry.registerEntityRenderingHandler(EntityCultivatedDodoEgg.class, new RenderSnowball(Fossil.cultivatedDodoEgg));
        RenderingRegistry.registerEntityRenderingHandler(EntityAnkylosaurus.class, new RenderAnkylosaurus(new ModelAnkylosaurus(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPachycephalosaurus.class, new RenderPachycephalosaurus(new ModelPachycephalosaurus(), 0.5F));
        //RenderingRegistry.registerBlockHandler(new FossilBlockRenderHandler());
        MinecraftForgeClient.registerItemRenderer(Fossil.figurineBlock.blockID, new ItemFigurineRenderer());
    }

    @Override
    public void registerTileEntitySpecialRenderer()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTimeMachine.class, new RenderTNClock());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFigurine.class, new TileEntityFigurineRenderer());
    }

    @Override
    public void registerSounds()
    {
        MinecraftForge.EVENT_BUS.register(new DinoSoundHandler());
    }

    public void registerEvents()
    {
        MinecraftForge.EVENT_BUS.register(new GuiBoneHelmet(Minecraft.getMinecraft()));
    }
}
