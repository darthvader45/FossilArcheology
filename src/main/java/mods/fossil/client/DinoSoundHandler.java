package mods.fossil.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class DinoSoundHandler {
	
	private static final String[] Records = {
		"Bones"};

	//Load sounds
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSoundLoad(SoundLoadEvent event) 
	{
        for(String sound : DinoSound.files){
                try {
                        event.manager.soundPoolSounds.addSound(sound);
                } catch(Exception e) {
                        Fossil.Console("Failed loading sound: " + sound);
                }
        }
        Fossil.Console("Sounds loaded.");
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