package mods.fossil.handler;

import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class FossilAchievementHandler
{
    public static AchievementPage FossilsAchievementPage;

    public static Achievement FirstEgg;
    public static Achievement AllEggs;
    public static Achievement FoundFossils;
    public static Achievement Permafrost;
    public static Achievement ArchWorkbench;
    public static Achievement Analyzer;
    public static Achievement CultVat;
    public static Achievement Sifter;
    public static Achievement Dinopedia;
    public static Achievement IceAge;
    public static Achievement TheKing;

    public static void loadAchievements()
    {   
        FirstEgg = new Achievement(5000, "FirstEgg", 5, 0, Item.bone, CultVat).registerAchievement();
        addAchievementName("FirstEgg", "Dawn of the Dinosaurs!");
        addAchievementDesc("FirstEgg", "One small step for a dinosaur,");

        AllEggs = new Achievement(5001, "AllEggs", 5, 1, Item.bone, FirstEgg).registerAchievement().setSpecial();
        addAchievementName("AllEggs", "Gotta Hatch 'Em All!");
        addAchievementDesc("AllEggs", "One giant leap for Dinosauria.");
        
        FoundFossils = new Achievement(5002, "FoundFossils", 2, 0, Item.bone, null).registerAchievement();
        addAchievementName("FoundFossils", "Trace from the past.");
        addAchievementDesc("FoundFossils", "Digging for bones!");
 
        Permafrost = new Achievement(5003, "Permafrost", 0, 1, Item.book, null).registerAchievement();
        addAchievementName("Permafrost", "Try not to get a cold!");
        addAchievementDesc("Permafrost", "What wonders could be inside it?"); 
        
        ArchWorkbench = new Achievement(5004, "ArchWorkbench", 3, -1, Item.shovelIron, null).registerAchievement();
        addAchievementName("ArchWorkbench", "Let's get the party started!");
        addAchievementDesc("ArchWorkbench", "First step in becoming an archaeologist.");         
        
        Analyzer = new Achievement(5005, "Analyzer", 3, 0, Item.book, FoundFossils).registerAchievement();
        addAchievementName("Analyzer", "For SCIENCE!");
        addAchievementDesc("Analyzer", "Discovering the past!");    
        
        CultVat = new Achievement(5006, "CultVat", 4, 0, Item.book, Analyzer).registerAchievement();
        addAchievementName("CultVat", "Genetic manipulation.");
        addAchievementDesc("CultVat", "Bring history back to live!");
        
        Sifter = new Achievement(5007, "Sifter", 4, 1, Item.book, null).registerAchievement();
        addAchievementName("Sifter", "Cuz' baby I'm a Gold Digger!");
        addAchievementDesc("Sifter", "Even if I have to go through all the dirt!");
        
        Dinopedia = new Achievement(5008, "Dinopedia", 3, 1, Item.book, Analyzer).registerAchievement();
        addAchievementName("Dinopedia", "Fill all the pages!");
        addAchievementDesc("Dinopedia", "Find all the dinos!");

        IceAge = new Achievement(5009, "IceAge", 3, 1, Item.book, Analyzer).registerAchievement();
        addAchievementName("IceAge", "I do not know how you�ll give birth...");
        addAchievementDesc("IceAge", "However I want the ice age back!");
        
        TheKing = new Achievement(5010, "TheKing", 5, -1, Item.book, null).registerAchievement().setSpecial();
        addAchievementName("TheKing", "Ruler of the Late Cretaceous.");
        addAchievementDesc("TheKing", "Long live the king!");


        AchievementPage FossilsAchievementPage = new AchievementPage("Fossils",
                FirstEgg,
                AllEggs,
                FoundFossils,
                Permafrost,
                ArchWorkbench,
                Analyzer,
                CultVat,
                Sifter,
                Dinopedia,
                IceAge,
                TheKing
        		);
        AchievementPage.registerAchievementPage(FossilsAchievementPage);
    }

    private static void addAchievementName(String ach, String name)
    {
        LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
    }

    private static void addAchievementDesc(String ach, String desc)
    {
        LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
    }
}
