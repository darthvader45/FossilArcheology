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

    private static final String SOUND_RESOURCE_LOCATION = "mods/fossil/dinoSounds/";
    private static final String SOUND_PREFIX = "mods.fossil.dinoSounds.";

    public static String[] soundFiles = {
        
        SOUND_RESOURCE_LOCATION + "Brach_death1.wav",
        SOUND_RESOURCE_LOCATION + "Brach_death2.wav",
        SOUND_RESOURCE_LOCATION + "Brach_living1.wav",
        SOUND_RESOURCE_LOCATION + "Brach_living2.wav",
        SOUND_RESOURCE_LOCATION + "DiloCall1.wav",
        SOUND_RESOURCE_LOCATION + "DiloCall2.wav",
        SOUND_RESOURCE_LOCATION + "DiloDeath.wav",
        SOUND_RESOURCE_LOCATION + "DiloHurt.wav",
        SOUND_RESOURCE_LOCATION + "DiloLiving.wav",
        SOUND_RESOURCE_LOCATION + "drum_single.wav",
        SOUND_RESOURCE_LOCATION + "drum_triple.wav",
        SOUND_RESOURCE_LOCATION + "Mammoth_death.wav",
        SOUND_RESOURCE_LOCATION + "Mammoth_hurt.wav",
        SOUND_RESOURCE_LOCATION + "Mammoth_living.wav",
        SOUND_RESOURCE_LOCATION + "Pls_hurt.wav",
        SOUND_RESOURCE_LOCATION + "Pls_Living.wav",
        SOUND_RESOURCE_LOCATION + "PTS_hurt.wav",
        SOUND_RESOURCE_LOCATION + "PTS_living1.wav",
        SOUND_RESOURCE_LOCATION + "PTS_living2.wav",
        SOUND_RESOURCE_LOCATION + "Raptor_attack1.wav",
        SOUND_RESOURCE_LOCATION + "Raptor_attack2.wav",
        SOUND_RESOURCE_LOCATION + "raptor_death.wav",
        SOUND_RESOURCE_LOCATION + "Raptor_hurt1.wav",
        SOUND_RESOURCE_LOCATION + "Raptor_hurt2.wav",
        SOUND_RESOURCE_LOCATION + "Raptor_hurt3.wav",
        SOUND_RESOURCE_LOCATION + "raptor_living_friendly1.wav",
        SOUND_RESOURCE_LOCATION + "raptor_living_friendly2.wav",
        SOUND_RESOURCE_LOCATION + "raptor_living_wild1.wav",
        SOUND_RESOURCE_LOCATION + "raptor_living_wild2.wav",
        SOUND_RESOURCE_LOCATION + "Smilodon_death.wav",
        SOUND_RESOURCE_LOCATION + "Smilodon_Hurt.wav",
        SOUND_RESOURCE_LOCATION + "Smilodon_Living1.wav",
        SOUND_RESOURCE_LOCATION + "Smilodon_Living2.wav",
        SOUND_RESOURCE_LOCATION + "Smilodon_Living3.wav",
        SOUND_RESOURCE_LOCATION + "Steg_death.wav",
        SOUND_RESOURCE_LOCATION + "Steg_Hurt.wav",
        SOUND_RESOURCE_LOCATION + "Steg_living1.wav",
        SOUND_RESOURCE_LOCATION + "Steg_living2.wav",
        SOUND_RESOURCE_LOCATION + "Steg_living3.wav",
        SOUND_RESOURCE_LOCATION + "Trex_Death1.wav",
        SOUND_RESOURCE_LOCATION + "TRex_Death2.wav",
        SOUND_RESOURCE_LOCATION + "TRex_hit.wav",
        SOUND_RESOURCE_LOCATION + "Trex_Living1.wav",
        SOUND_RESOURCE_LOCATION + "Trex_Living2.wav",
        SOUND_RESOURCE_LOCATION + "Trex_Living3.wav",
        SOUND_RESOURCE_LOCATION + "TRex_scream1.wav",
        SOUND_RESOURCE_LOCATION + "TRex_scream2.wav",
        SOUND_RESOURCE_LOCATION + "TRex_scream3.wav",
        SOUND_RESOURCE_LOCATION + "tri_death.wav",
        SOUND_RESOURCE_LOCATION + "tri_roar1.wav",
        SOUND_RESOURCE_LOCATION + "tri_roar2.wav",
        SOUND_RESOURCE_LOCATION + "tri_roar3.wav",
        SOUND_RESOURCE_LOCATION + "WhipCrack.wav",


    };
    
    
    // Item/Block Sounds
    public static final String WhipCrack = SOUND_PREFIX + "WhipCrack";
    public static final String drum_single = SOUND_PREFIX + "drum_single";
    public static final String drum_triple = SOUND_PREFIX + "drum_triple";   
    
    
    // Mob Sounds
    public static final String Brach_death = SOUND_PREFIX + "Brach_death";
    public static final String Brach_living = SOUND_PREFIX + "Brach_living";
    public static final String DiloCall = SOUND_PREFIX + "DiloCall";
    public static final String DiloDeath = SOUND_PREFIX + "DiloDeath";
    public static final String DiloHurt = SOUND_PREFIX + "DiloHurt";
    public static final String DiloLiving = SOUND_PREFIX + "DiloLiving";
    public static final String Mammoth_death = SOUND_PREFIX + "Mammoth_death";
    public static final String Mammoth_hurt = SOUND_PREFIX + "Mammoth_hurt";
    public static final String Mammoth_living = SOUND_PREFIX + "Mammoth_living";
    public static final String Pls_hurt = SOUND_PREFIX + "Pls_hurt";
    public static final String Pls_Living = SOUND_PREFIX + "Pls_Living";
    public static final String PTS_hurt = SOUND_PREFIX + "PTS_hurt";
    public static final String PTS_living = SOUND_PREFIX + "PTS_living";
    public static final String Raptor_attack = SOUND_PREFIX + "Raptor_attack";
    public static final String raptor_death = SOUND_PREFIX + "raptor_death";
    public static final String Raptor_hurt = SOUND_PREFIX + "Raptor_hurt";
    public static final String raptor_living_friendly = SOUND_PREFIX + "raptor_living_friendly";
    public static final String raptor_living_wild = SOUND_PREFIX + "raptor_living_wild";
    public static final String Smilodon_death = SOUND_PREFIX + "Smilodon_death";
    public static final String Smilodon_Hurt = SOUND_PREFIX + "Smilodon_Hurt";
    public static final String Smilodon_Living = SOUND_PREFIX + "Smilodon_Living";
    public static final String Steg_death = SOUND_PREFIX + "Steg_death";
    public static final String Steg_Hurt = SOUND_PREFIX + "Steg_Hurt";
    public static final String Steg_living = SOUND_PREFIX + "Steg_living";
    public static final String TRex_Death = SOUND_PREFIX + "TRex_Death";
    public static final String TRex_hit = SOUND_PREFIX + "TRex_hit";
    public static final String TRex_Living = SOUND_PREFIX + "TRex_Living";
    public static final String TRex_scream = SOUND_PREFIX + "TRex_scream";
    public static final String tri_death = SOUND_PREFIX + "tri_death";
    public static final String tri_roar = SOUND_PREFIX + "tri_roar";
    public static final String Spino_death = SOUND_PREFIX + "TRex_Death";
    public static final String Spino_hurt = SOUND_PREFIX + "TRex_hit";
    public static final String Spino_living = SOUND_PREFIX + "TRex_Living";
    public static final String Spino_scream = SOUND_PREFIX + "TRex_scream";



    
    
    
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {

        // For each custom sound file we have defined in Sounds
        for (String soundFile : soundFiles) {
            // Try to add the custom sound file to the pool of sounds
            try {
                event.manager.soundPoolSounds.addSound(soundFile, this.getClass().getResource("/" + soundFile));
            }
            // If we cannot add the custom sound file to the pool, log the exception
            catch (Exception e) {
                System.err.println("Failed loading sound file: " + soundFile);
            }
        }
    }
}