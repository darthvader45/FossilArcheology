package mods.fossil.client;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.fossilEnums.EnumDinoType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class DinoSoundHandler {
	
	private static final String[] Records = {
		"Bones"};

	//Load sounds
	@ForgeSubscribe
	@SideOnly(Side.CLIENT)
	public void onSoundLoad(SoundLoadEvent event) {

		event.manager.addSound(Fossil.modid + ":" + "ankylosaurus_death.wav");
		event.manager.addSound(Fossil.modid + ":" + "ankylosaurus_hurt1.wav");
		event.manager.addSound(Fossil.modid + ":" + "ankylosaurus_hurt2.wav");
		event.manager.addSound(Fossil.modid + ":" + "ankylosaurus_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "ankylosaurus_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "ankylosaurus_living3.wav");
		event.manager.addSound(Fossil.modid + ":" + "brachiosaurus_death1.wav");
		event.manager.addSound(Fossil.modid + ":" + "brachiosaurus_living2.wav");
		event.manager.addSound(Fossil.modid + "brachiosaurus_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "brachiosaurus_hurt1.wav");
		event.manager.addSound(Fossil.modid + ":" + "dilophosaurus_call1.wav");
		event.manager.addSound(Fossil.modid + ":" + "dilophosaurus_call2.wav");
		event.manager.addSound(Fossil.modid + ":" + "dilophosaurus_death.wav");
		event.manager.addSound(Fossil.modid + ":" + "dilophosaurus_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "dilophosaurus_living.wav");
		event.manager.addSound(Fossil.modid + ":" + "drum_single.wav");
		event.manager.addSound(Fossil.modid + ":" + "drum_triple.wav");
		event.manager.addSound(Fossil.modid + ":" + "mammoth_death.wav");
		event.manager.addSound(Fossil.modid + ":" + "mammoth_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "mammoth_living.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_attack1.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_death1.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_death2.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_outside1.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_outside2.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_outside3.wav");
		event.manager.addSound(Fossil.modid + ":" + "mosasaurus_outside4.wav");
		event.manager.addSound(Fossil.modid + ":" + "plesiosaurus_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "plesiosaurus_living.wav");
		event.manager.addSound(Fossil.modid + ":" + "pterosaurus_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "pterosaurus_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "pterosaurus_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "smilodon_death.wav");
		event.manager.addSound(Fossil.modid + ":" + "smilodon_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "smilodon_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "smilodon_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "smilodon_living3.wav");
		event.manager.addSound(Fossil.modid + ":" + "stegosaurus_death.wav");
		event.manager.addSound(Fossil.modid + ":" + "stegosaurus_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "stegosaurus_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "stegosaurus_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "stegosaurus_living3.wav");
		event.manager.addSound(Fossil.modid + ":" + "triceratops_death.wav");
		event.manager.addSound(Fossil.modid + ":" + "triceratops_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "triceratops_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "triceratops_living3.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_death1.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_death2.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_hurt.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_living1.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_living3.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_scream1.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_scream2.wav");
		event.manager.addSound(Fossil.modid + ":" + "tyrannosaurus_scream3.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_attack1.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_attack2.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_hurt1.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_hurt2.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_hurt3.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_hurt4.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_living_tame1.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_living_tame2.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_living_wild1.wav");
		event.manager.addSound(Fossil.modid + ":" + "velociraptor_living_wild2.wav");
		event.manager.addSound(Fossil.modid + ":" + "dodo_living1.wav");	
		event.manager.addSound(Fossil.modid + ":" + "dodo_living2.wav");
		event.manager.addSound(Fossil.modid + ":" + "dodo_hurt1.wav");
		event.manager.addSound(Fossil.modid + ":" + "dodo_death1.wav");
		event.manager.addSound(Fossil.modid + ":" + "whip.wav");
		event.manager.addSound(Fossil.modid + ":" + "tar.wav");

		
}


	
	
	// Load music
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSoundsLoaded(SoundLoadEvent event)
	{	
		event.manager.soundPoolStreaming.addSound(Fossil.modid + ":" + "Bones.wav");
		event.manager.soundPoolStreaming.addSound(Fossil.modid + ":" + "record_jp_theme.wav");
	}
	

}