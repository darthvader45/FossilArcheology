package mods.fossil.client;

import info.ata4.minecraft.dragon.DragonMounts;

import java.util.logging.Logger;

import mods.fossil.Fossil;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class FossilOptions
{
    private static final Logger Log = Fossil.Log;
    
    public static boolean Gen_Palaeoraphe;
    public static boolean Gen_Academy;
    public static boolean Gen_Ships;
    public static String  Lang_Server;
    public static boolean Heal_Dinos;
    public static boolean Dinos_Starve;
    public static boolean Dino_Block_Breaking;
    public static boolean Skull_Overlay;
    public static boolean LoginMessage;
    public static boolean FossilDebug;

    public void Load(Configuration config)
    {
        Gen_Palaeoraphe = config.get("option", "Palaeoraphe", false).getBoolean(false);
        Gen_Academy = config.get("option", "Academy", true).getBoolean(true);
        Gen_Ships = config.get("option", "Ships", true).getBoolean(true);
        Lang_Server = config.get("option", "Serverlanguage", "en_US").getString();
        Heal_Dinos = config.get("option", "Heal_Dinos", true).getBoolean(true);
        Dinos_Starve = config.get("option", "Dinos_Starve", true).getBoolean(true);
        Dino_Block_Breaking = config.get("option", "Dino_Block_Breaking", true).getBoolean(true);
        Skull_Overlay = config.get("option", "Skull_Overlay", false).getBoolean(false);
        LoginMessage = config.get("option", "Display_Login_Message", true).getBoolean(false);
        FossilDebug = config.get("debug", "Fossil_Debug", false).getBoolean(false);
    }

}
