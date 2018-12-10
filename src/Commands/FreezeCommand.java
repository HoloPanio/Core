package Commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FreezeCommand implements CommandExecutor {

	  String help = "\"/help\"";
	  String phelp = "Unknown command. Type " + help + " for help.";
	
	  public static ArrayList<String> frozen = new ArrayList();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
	      if (sender.hasPermission("server.freeze")) {
	    	  
	        if (args.length == 0) {
	          
	        	sender.sendMessage("§7Please specify a player!");
	          
	        	return true;
	        	
	        
	        }
	        
	        Player target = Bukkit.getServer().getPlayer(args[0]);
	        
	        if (target == null) {
	          
	        	sender.sendMessage("§7Could not find player§9 " + args[0] + "§7!");
	        	
	        	return true;
	        }
	        
	        if (this.frozen.contains(target.getName())) {
	        	
	          this.frozen.remove(target.getName());
	          
	          sender.sendMessage("§7You have unfrozen§9 " + target.getName() + "§7!");
	          target.sendMessage("§7You have been unfrozen by§9 " + sender.getName() + "§7!");
	          
	          return true;
	        }
	        
	        this.frozen.add(target.getName());
	        
	        sender.sendMessage("§7You have frozen§9 " + target.getName() + "§7!");
	        target.sendMessage("§7You have been frozen by§9 " + sender.getName() + "§7!");
	      } else {
	        sender.sendMessage(phelp);
	      }
	      return true;
	    }
		
		return false;
	}

	
	
}
