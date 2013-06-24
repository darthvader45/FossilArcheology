package mods.fossil.client;

import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Equivalent-Exchange-3
 * https://github.com/pahimar/Equivalent-Exchange-3
 * 
 * Localizations
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class Localizations {

    private static final String LANG_RESOURCE_LOCATION = "/mods/fossil/Fossillang/";

    public static String[] localeFiles = { 
        LANG_RESOURCE_LOCATION + "en_US.xml", 
    };

    
    
    
    
    public static void loadLanguages() {

        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : Localizations.localeFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, getLocaleFromFileName(localizationFile), isXMLLanguageFile(localizationFile));
        }
    }
    
    /***
     * Simple test to determine if a specified file name represents a XML file
     * or not
     * 
     * @param fileName
     *            String representing the file name of the file in question
     * @return True if the file name represents a XML file, false otherwise
     */
    public static boolean isXMLLanguageFile(String fileName) {

        return fileName.endsWith(".xml");
    }

    /***
     * Returns the locale from file name
     * 
     * @param fileName
     *            String representing the file name of the file in question
     * @return String representation of the locale snipped from the file name
     */
    public static String getLocaleFromFileName(String fileName) {

        return fileName.substring(fileName.lastIndexOf('/') + 1, fileName.lastIndexOf('.'));
    }

    public static String getLocalizedString(String key) {

        return LanguageRegistry.instance().getStringLocalization(key);
    }
}