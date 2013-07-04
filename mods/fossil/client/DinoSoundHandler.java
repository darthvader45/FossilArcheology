package mods.fossil.client;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

/**
 * Equivalent-Exchange-3
 * https://github.com/pahimar/Equivalent-Exchange-3
 * 
 * SoundHandler
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class DinoSoundHandler {

    private static final String SOUND_RESOURCE_LOCATION = "sounds/";
    private static final String SOUND_PREFIX = "sounds.";

    public static String[] soundFiles = {
        
        SOUND_RESOURCE_LOCATION + "br_d1.wav",
        SOUND_RESOURCE_LOCATION + "br_d2.wav",
        SOUND_RESOURCE_LOCATION + "br_l1.wav",
        SOUND_RESOURCE_LOCATION + "br_l2.wav",
        SOUND_RESOURCE_LOCATION + "Dilod.wav",
        SOUND_RESOURCE_LOCATION + "Diloh.wav",
        SOUND_RESOURCE_LOCATION + "Dilol.wav",
        SOUND_RESOURCE_LOCATION + "di_l1.wav",
        SOUND_RESOURCE_LOCATION + "di_l2.wav",
        SOUND_RESOURCE_LOCATION + "drum_s.wav",
        SOUND_RESOURCE_LOCATION + "drum_t.wav",
        SOUND_RESOURCE_LOCATION + "ma_d.wav",
        SOUND_RESOURCE_LOCATION + "ma_h.wav",
        SOUND_RESOURCE_LOCATION + "ma_l.wav",
        SOUND_RESOURCE_LOCATION + "Pls_h.wav",
        SOUND_RESOURCE_LOCATION + "Pls_l.wav",
        SOUND_RESOURCE_LOCATION + "PTS_h.wav",
        SOUND_RESOURCE_LOCATION + "PTS_l1.wav",
        SOUND_RESOURCE_LOCATION + "PTS_l2.wav",
        SOUND_RESOURCE_LOCATION + "ra_a1.wav",
        SOUND_RESOURCE_LOCATION + "ra_a2.wav",
        SOUND_RESOURCE_LOCATION + "ra_d.wav",
        SOUND_RESOURCE_LOCATION + "ra_h1.wav",
        SOUND_RESOURCE_LOCATION + "ra_h2.wav",
        SOUND_RESOURCE_LOCATION + "ra_h3.wav",
        SOUND_RESOURCE_LOCATION + "ra_l_f1.wav",
        SOUND_RESOURCE_LOCATION + "ra_l_f2.wav",
        SOUND_RESOURCE_LOCATION + "ra_l_w1.wav",
        SOUND_RESOURCE_LOCATION + "ra_l_w2.wav",
        SOUND_RESOURCE_LOCATION + "re_d1.wav",
        SOUND_RESOURCE_LOCATION + "re_d2.wav",
        SOUND_RESOURCE_LOCATION + "re_hit.wav",
        SOUND_RESOURCE_LOCATION + "re_l1.wav",
        SOUND_RESOURCE_LOCATION + "re_l2.wav",
        SOUND_RESOURCE_LOCATION + "re_l3.wav",
        SOUND_RESOURCE_LOCATION + "re_s1.wav",
        SOUND_RESOURCE_LOCATION + "re_s2.wav",
        SOUND_RESOURCE_LOCATION + "re_s3.wav",
        SOUND_RESOURCE_LOCATION + "sa_d.wav",
        SOUND_RESOURCE_LOCATION + "sa_h.wav",
        SOUND_RESOURCE_LOCATION + "sa_l1.wav",
        SOUND_RESOURCE_LOCATION + "sa_l2.wav",
        SOUND_RESOURCE_LOCATION + "sa_l3.wav",
        SOUND_RESOURCE_LOCATION + "st_d.wav",
        SOUND_RESOURCE_LOCATION + "st_h.wav",
        SOUND_RESOURCE_LOCATION + "st_l1.wav",
        SOUND_RESOURCE_LOCATION + "st_l2.wav",
        SOUND_RESOURCE_LOCATION + "st_l3.wav",
        SOUND_RESOURCE_LOCATION + "tri_d.wav",
        SOUND_RESOURCE_LOCATION + "tri_r1.wav",
        SOUND_RESOURCE_LOCATION + "tri_r2.wav",
        SOUND_RESOURCE_LOCATION + "tri_r3.wav",
        SOUND_RESOURCE_LOCATION + "whip.wav",


    };
    
    
    // Item/Block Sounds
    public static final String WhipCrack = SOUND_PREFIX + "whip";
    public static final String drum_single = SOUND_PREFIX + "drum_s";
    public static final String drum_triple = SOUND_PREFIX + "drum_t";   
    
    
    // Mob Sounds
    public static final String Brach_death = SOUND_PREFIX + "br_d";
    public static final String Brach_living = SOUND_PREFIX + "br_l";
    public static final String DiloCall = SOUND_PREFIX + "Dilol";
    public static final String DiloDeath = SOUND_PREFIX + "Dilod";
    public static final String DiloHurt = SOUND_PREFIX + "Diloh";
    public static final String DiloLiving = SOUND_PREFIX + "Dilol";
    public static final String Mammoth_death = SOUND_PREFIX + "ma_d";
    public static final String Mammoth_hurt = SOUND_PREFIX + "ma_h";
    public static final String Mammoth_living = SOUND_PREFIX + "ma_l";
    public static final String Pls_hurt = SOUND_PREFIX + "Pls_h";
    public static final String Pls_Living = SOUND_PREFIX + "Pls_l";
    public static final String PTS_hurt = SOUND_PREFIX + "PTS_h";
    public static final String PTS_living = SOUND_PREFIX + "PTS_l";
    public static final String Raptor_attack = SOUND_PREFIX + "ra_a";
    public static final String raptor_death = SOUND_PREFIX + "ra_d";
    public static final String Raptor_hurt = SOUND_PREFIX + "ra_h";
    public static final String raptor_living_friendly = SOUND_PREFIX + "ra_l_f";
    public static final String raptor_living_wild = SOUND_PREFIX + "ra_l_w";
    public static final String Smilodon_death = SOUND_PREFIX + "sa_d";
    public static final String Smilodon_Hurt = SOUND_PREFIX + "sa_h";
    public static final String Smilodon_Living = SOUND_PREFIX + "sa_l";
    public static final String Steg_death = SOUND_PREFIX + "st_d";
    public static final String Steg_Hurt = SOUND_PREFIX + "st_h";
    public static final String Steg_living = SOUND_PREFIX + "st_l";
    public static final String TRex_Death = SOUND_PREFIX + "re_d";
    public static final String TRex_hit = SOUND_PREFIX + "re_hit";
    public static final String TRex_Living = SOUND_PREFIX + "re_l";
    public static final String TRex_scream = SOUND_PREFIX + "re_s";
    public static final String tri_death = SOUND_PREFIX + "tri_d";
    public static final String tri_roar = SOUND_PREFIX + "tri_roar";
    public static final String Spino_death = SOUND_PREFIX + "re_d";
    public static final String Spino_hurt = SOUND_PREFIX + "re_hit";
    public static final String Spino_living = SOUND_PREFIX + "re_l";
    public static final String Spino_scream = SOUND_PREFIX + "re_s";



    
    
    
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {

        // For each custom sound file we have defined in Sounds
        for (String soundFile : soundFiles) {
            // Try to add the custom sound file to the pool of sounds
            try {
                event.manager.soundPoolSounds.addSound(soundFile);
            }
            // If we cannot add the custom sound file to the pool, log the exception
            catch (Exception e) {
                System.err.println("Failed loading sound file: " + soundFile);
            }
        }
    }
}