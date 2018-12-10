package Commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class SetspawnCommand implements CommandExecutor {
  String pr = "§7";
  String help = "'/help'";
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    
	  if (!(sender instanceof Player)) {
      sender.sendMessage(this.pr + "You must me a player!");
      return true;
    }
    Player p = (Player)sender;
    File file = new File("plugins//JacksLuckyConfig//Spawn.yml");
    if (p.hasPermission("server.setspawn"))
    {
      if (args.length == 0)
      {
        if (!file.exists()) {
          try
          {
            file.createNewFile();
          }
          catch (IOException e)
          {
            e.printStackTrace();
          }
        }
        Location loc = p.getLocation();
        
        double x = loc.getX();
        double y = loc.getY();
        double z = loc.getZ();
        float yaw = loc.getYaw();
        float pitch = loc.getPitch();
        String world = loc.getWorld().getName();
        
        YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        
        cfg.set("Spawn.X", Double.valueOf(x));
        cfg.set("Spawn.Y", Double.valueOf(y));
        cfg.set("Spawn.Z", Double.valueOf(z));
        cfg.set("Spawn.YAW", Float.valueOf(yaw));
        cfg.set("Spawn.PITCH", Float.valueOf(pitch));
        cfg.set("Spawn.WORLD", world);
        try
        {
          cfg.save(file);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        p.sendMessage(this.pr + "You have successfully set the spawnpoint!");
      }
      else
      {
        p.sendMessage(this.pr + "Correct Usage: /setspawn");
      }
    }
    else {
      p.sendMessage(this.pr + "Unknown command. Type " + this.help + " for help.");
    }
    return true;
  }
}
