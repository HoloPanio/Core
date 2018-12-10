package Commands;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import net.holopanio.dev.SettingsManager;

public class SpawnCommand
  implements CommandExecutor
{
  String pr = "§7";
  String help = "\"/help\"";
  String phelp = "Unknown command. Type " + help + " for help.";
  
  SettingsManager settings = SettingsManager.getInstance();
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	  
	  if (settings.getConfig().getString("Lobby").equals("true")) {
	  
		  if (!(sender instanceof Player)) {
			  
			  sender.sendMessage("Only players can  use this command!");
      
			  return true;
		  }	
		 
		  Player p = (Player)sender;

		  File file = new File("plugins//JacksLuckyConfig//Spawn.yml");
		  YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    
		  if (p.hasPermission("server.spawn")) {
			  
			  if (file.exists()) {
				  
				  Location loc = p.getLocation();
				  
				  double yaw = cfg.getDouble("Spawn.YAW");
				  double pitch = cfg.getDouble("Spawn.PITCH");
        
				  loc.setX(cfg.getDouble("Spawn.X"));
				  loc.setY(cfg.getDouble("Spawn.Y"));
				  loc.setZ(cfg.getDouble("Spawn.Z"));
				  loc.setYaw((float)yaw);
				  loc.setPitch((float)pitch);
        
				  World world = Bukkit.getWorld(cfg.getString("Spawn.WORLD"));
        
				  loc.setWorld(world);
        
				  p.sendMessage(this.pr + "Teleporting...");
				  p.teleport(loc);
				  
				  return true;

			  } else {
        
				  p.sendMessage(this.pr + "There is currently no spawn point!");
				  
				  return true;
			  }
      

		  } else {
	
			  p.sendMessage(phelp);
     
			  return true;
		  }	
	  
	  } else if ((settings.getConfig().getString("Lobby").equals("false")) && (settings.getConfig().getString("Commands.Spawn-Enabled").equals("false"))) {
		  
		  sender.sendMessage("§c§lERROR! §7This command has been disabled for this game.");
		  return true;
		  
	  } else if ((settings.getConfig().getString("Lobby").equals("false")) && (settings.getConfig().getString("Commands.Spawn-Enabled").equals("true"))) {
		  
		  
		  if (!(sender instanceof Player)) {
			  
			  sender.sendMessage("Only players can  use this command!");
      
			  return true;
		  }	
		 
		  Player p = (Player)sender;

		  File file = new File("plugins//JacksLuckyConfig//Spawn.yml");
		  YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
    
		  if (p.hasPermission("server.spawn")) {
			  
			  if (file.exists()) {
				  
				  Location loc = p.getLocation();
				  
				  double yaw = cfg.getDouble("Spawn.YAW");
				  double pitch = cfg.getDouble("Spawn.PITCH");
        
				  loc.setX(cfg.getDouble("Spawn.X"));
				  loc.setY(cfg.getDouble("Spawn.Y"));
				  loc.setZ(cfg.getDouble("Spawn.Z"));
				  loc.setYaw((float)yaw);
				  loc.setPitch((float)pitch);
        
				  World world = Bukkit.getWorld(cfg.getString("Spawn.WORLD"));
        
				  loc.setWorld(world);
        
				  p.sendMessage(this.pr + "Teleporting...");
				  p.teleport(loc);
				  
				  return true;

			  } else {
        
				  p.sendMessage(this.pr + "There is currently no spawn point!");
				  
				  return true;
			  }
      

		  } else {
	
			  p.sendMessage(phelp);
     
			  return true;
		  }	
		  
	  }
    
	  return false;
    }
  
}
