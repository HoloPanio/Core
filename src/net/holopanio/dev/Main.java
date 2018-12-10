package net.holopanio.dev;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import BanGUI.ListenerClass;
import BanGUI.TempbanCommand;
import Commands.FeedCommand;
import Commands.FlyCommand;
import Commands.FreezeCommand;
import Commands.HealCommand;
import Commands.InvseeCommand;
import Commands.ReloadCommand;
import Commands.SetspawnCommand;
import Commands.SpawnCommand;
import Commands.WhoIsCommand;
import GamemodeCommands.GMA;
import GamemodeCommands.GMC;
import GamemodeCommands.GMS;
import GamemodeCommands.GMSP;
import Listeners.BlockedCommands;
import Listeners.Chat;
import Listeners.DeathEvent;
import Listeners.FreezeListener;
import Listeners.NoBreak;
import Listeners.NoHunger;
import Listeners.NoPlace;
import Listeners.NoRain;
import Listeners.OpBlocker;
import Listeners.VoidSpawn;
import Listeners.WorldGuard;

public class Main extends JavaPlugin implements Listener {
	
	
	  public String help = "\"/help\"";
	  
	  String phelp = "Unknown command. Type " + help + " for help.";
	  String noPerm = "§c§lERROR! §7Insufficient Permissions";
	
      SettingsManager settings = SettingsManager.getInstance();
      
      Plugin p;
      FileConfiguration config;

	  
	public void onEnable() {
		
		config();
		
		getServer().getPluginManager().registerEvents(this, this);

		registerCommands();

		registerListeners();

	}

	public void onDiable() {
		
	}
	
	private void config() {

		config = p.getConfig();
		
		config.options().copyDefaults(true);
		saveDefaultConfig();
		
//		settings.setup(this);
		
	}
	
	private void registerCommands() {
		
	    getCommand("heal").setExecutor(new HealCommand());
   	    getCommand("freeze").setExecutor(new FreezeCommand());
   	    getCommand("invsee").setExecutor(new InvseeCommand());
   	    getCommand("fly").setExecutor(new FlyCommand());
   	    getCommand("whois").setExecutor(new WhoIsCommand());
   	    getCommand("feed").setExecutor(new FeedCommand());
   	    getCommand("tempban").setExecutor(new TempbanCommand());
   	    getCommand("setspawn").setExecutor(new SetspawnCommand());
   	    getCommand("spawn").setExecutor(new SpawnCommand());
   	    getCommand("scrl").setExecutor(new ReloadCommand());
   	    
   	    getCommand("gmc").setExecutor(new GMC());
   	    getCommand("gms").setExecutor(new GMS());
   	    getCommand("gma").setExecutor(new GMA());
   	 	getCommand("gmsp").setExecutor(new GMSP());
   	    
	}
	
	private void registerListeners() {
		
		getServer().getPluginManager().registerEvents(this, this);

   	    getServer().getPluginManager().registerEvents(new FreezeListener(), this);
   	    getServer().getPluginManager().registerEvents(new NoRain(), this);
   	    getServer().getPluginManager().registerEvents(new OpBlocker(), this);
   	    getServer().getPluginManager().registerEvents(new BlockedCommands(), this);
   	    getServer().getPluginManager().registerEvents(new NoBreak(), this);
   	    getServer().getPluginManager().registerEvents(new NoPlace(), this);
   	    getServer().getPluginManager().registerEvents(new Chat(), this);
   	    getServer().getPluginManager().registerEvents(new ListenerClass(), this);
   	    getServer().getPluginManager().registerEvents(new NoHunger(), this);
   	    getServer().getPluginManager().registerEvents(new VoidSpawn(), this);
   	    getServer().getPluginManager().registerEvents(new DeathEvent(), this);
  	    getServer().getPluginManager().registerEvents(new WorldGuard(), this);
   	    
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
 
		
		if (cmd.getName().equalsIgnoreCase("cver")) {
			  
			if (sender.hasPermission("server.cver")) {
			
				  Player p = (Player) sender;
			  
				  p.sendMessage("§7You are running TheServerCore version §c§l12/3/18!");
			
			  }  else {
			
				sender.sendMessage(phelp);
			
			  }
			  return true; 
		}
		
		return true;
	
	}
}