package net.holopanio.dev;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
 
public class SettingsManager {
 
        private SettingsManager() { }
       
        static SettingsManager instance = new SettingsManager();
       
        public static SettingsManager getInstance() {
       
        	return instance;
        
        }
       
        
        Plugin p;
        FileConfiguration config;
        File cfile;
       
        
        /*
         * DO NOT USE THIS UNLESS YOU DON'T WANT COMMENTS!
         */
        
        public void setup(Plugin p) {
        
        	config = p.getConfig();
        	config.options().copyDefaults(true);
        	cfile = new File(p.getDataFolder(), "config.yml");
       
        	saveConfig();
        	
        }
       
        
        public FileConfiguration getConfig() {
        
        	return config;
        
        }
       
        
        public void saveConfig() {
        	try {
        	
        		config.save(cfile);
        		
        	}
                
        	catch (IOException e) {
            
        		Bukkit.getServer().getLogger().severe(ChatColor.RED + "Could not save config.yml!");
                
        	}
        
        }
       
        
        public void reloadConfig() {
        
        	config = YamlConfiguration.loadConfiguration(cfile);
       
        }
        
}
