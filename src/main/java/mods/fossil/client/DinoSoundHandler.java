package mods.fossil.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

import java.util.logging.Level;

public class DinoSoundHandler
{
    private static final String[] Records =
    {
        "Bones"
    };

    //Load sounds
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        for (String sound : DinoSound.files)
        {
            try
            {
                event.manager.addSound(sound);
                //Fossil.Console("Added sound: " + sound);
            }
            catch (Exception e)
            {
                Fossil.Console("Failed loading sound: " + sound);
            }
        }

        Fossil.Console("Fossil: Sounds Loaded!");
    }

    // Load music
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent event)
    {

    	try
    	{
    		event.manager.soundPoolStreaming.addSound(Fossil.modid + ":" + "record_bones.ogg");
    	}
    	catch (Exception e)
    	{
    		Fossil.Console("Fossil: Failed loading music: " + Fossil.modid + ":" + "record_bones.ogg");
    	}
    	Fossil.Console("Fossil: Music Loaded!");
    	//event.manager.soundPoolStreaming.addSound(Fossil.modid + ":" + "record_jp_theme.ogg");
    }
}