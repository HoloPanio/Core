package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.holopanio.dev.SettingsManager;

public class HealCommand implements CommandExecutor {

	  String help = "\"/help\"";
	  String phelp = "Unknown command. Type " + help + " for help.";
	  String noPerm = "§4§lERROR §8» §7Insufficient permissions!";
	  
	  SettingsManager settings = SettingsManager.getInstance();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		/*
		 * Heal
		 * 
		 * Permissions:
		 *   - server.heal
		 *   - server.heal.others
		 */
		
		if ((settings.getConfig().getString("Lobby").equals("true"))) {
		
		if ((sender instanceof Player)) {
			
        	if (sender.hasPermission("server.heal")) {
        		
                Player player = (Player) sender;
        		
                if (args.length == 0) {
                	
                	    player.setFoodLevel(20); 
                        player.setHealth(20);
                        player.sendMessage("§7You have been healed!");
                        
                        return true;
                }
                
                if (sender.hasPermission("server.heal.others")) {
                	
                
                Player target = Bukkit.getServer().getPlayer(args[0]);
                if (target == null) {
                	
                        player.sendMessage("§cCould not find player!");
                    
                        return true;
                }
                
                target.setFoodLevel(20);
                target.setHealth(20);
                target.sendMessage("§7You have been healed!");
                player.sendMessage("§9" + target.getName() + " §7has been healed!");
                
                return true;
                
                }  else {
        			sender.sendMessage(noPerm);
        			
        			return true;
        		}
                
        	} else {
        		sender.sendMessage(phelp);
        		
        		return true;
        	}
        } else {
        	
        	
        	
        }
		
		} else if ((settings.getConfig().getString("Lobby").equals("false")) && (settings.getConfig().getString("Commands.Heal-Enabled").equals("false"))) {
			
			sender.sendMessage("§c§lERROR! §7This command has been disabled for this game.");
		
			return true;
			
		} else if ((settings.getConfig().getString("Lobby").equals("false")) && (settings.getConfig().getString("Commands.Heal-Enabled").equals("true"))) {
			
			if ((sender instanceof Player)) {
				
	        	if (sender.hasPermission("server.heal")) {
	        		
	                Player player = (Player) sender;
	        		
	                if (args.length == 0) {
	                	
	                	    player.setFoodLevel(20); 
	                        player.setHealth(20);
	                        player.sendMessage("§7You have been healed!");
	                        
	                        return true;
	                }
	                
	                if (sender.hasPermission("server.heal.others")) {
	                	
	                
	                Player target = Bukkit.getServer().getPlayer(args[0]);
	                if (target == null) {
	                	
	                        player.sendMessage("§cCould not find player!");
	                    
	                        return true;
	                }
	                
	                target.setFoodLevel(20);
	                target.setHealth(20);
	                target.sendMessage("§7You have been healed!");
	                player.sendMessage("§9" + target.getName() + " §7has been healed!");
	                
	                return true;
	                
	                }  else {
	        			sender.sendMessage(noPerm);
	        			
	        			return true;
	        		}
	                
	        	} else {
	        		sender.sendMessage(phelp);
	        		
	        		return true;
	        	}
	        } else {
	        	
	        	
	        	
	        }
			
		}
		
		return false;
	}

}
