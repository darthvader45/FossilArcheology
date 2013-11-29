package mods.fossil.client;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;

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

public class DinoSoundHandler
{
    private static final String[] Records =
    {
        "Bones"
    };

    //Load sounds
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event)
    {
        for (String sound : DinoSound.files)
        {
            try
            {
                event.manager.soundPoolSounds.addSound(sound);
            }
            catch (Exception e)
            {
                Fossil.Console("Failed loading sound: " + sound);
            }
        }

        Fossil.Log.log(Level.CONFIG, "Sounds loaded.");
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