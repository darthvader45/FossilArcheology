package mods.fossil.handler;

import mods.fossil.Fossil;
import mods.fossil.fossilEnums.EnumDinoType;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilAchievementHandler  {

	public static AchievementPage FossilsAchievementPage;
	
	public static Achievement FirstEgg;
	public static Achievement AllEggs;
	public static Achievement FoundFossils;
	
	public static void loadAchievements() {
		
		FirstEgg = new Achievement(5000, "FirstEgg", 0, 0, Item.bone, null).registerAchievement();
		addAchievementName("FirstEgg", "First Dinosaur!");
		addAchievementDesc("FirstEgg", "You brought back your first dinosaur!");
		
		AllEggs = new Achievement(5001, "AllEggs", 2, 0, Item.bone, FirstEgg).registerAchievement().setSpecial();
		addAchievementName("AllEggs", "All Dinosaur Eggs");
		addAchievementDesc("AllEggs", "You've found all the dinosaur eggs!");
		
		FoundFossils = new Achievement(5002, "FoundFossils", 3, 0, Item.bone, null).registerAchievement();
		addAchievementName("FoundFossils", "Digging for Bones");
		addAchievementDesc("FoundFossils", "You've found some fossils!");
		
        AchievementPage FossilsAchievementPage = new AchievementPage("Fossils", 
        		FirstEgg, 
        		AllEggs, 
        		FoundFossils);
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
