package Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class WhoIsCommand implements CommandExecutor{

	  String pr = "§c§lServer §8┃ §7";
	  String help = "'/help'";
	  
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		    if (cmd.getName().equalsIgnoreCase("whois"))
		    {
		      if (sender.hasPermission("server.whois"))
		      {
		        if ((args.length == 0))
		        {
		          Player player = (Player) sender;
		          
		          player.sendMessage("§8§m-----------------------------------------------------");

		          player.sendMessage("§7Name » §c§l" + player.getName());
		          
		          player.sendMessage("§7Health » §c§l" + player.getHealth() + "/" + player.getMaxHealth());
		          
		          player.sendMessage("§7Food  » §c§l" + player.getFoodLevel() + "/20");
		          
		          
		          if (player.getGameMode() == GameMode.SURVIVAL) {
		        	  
		        	  player.sendMessage("§7Gamemode: » §c§lSurvival");
		        	  
		          } else if (player.getGameMode() == GameMode.CREATIVE) {
		        	  
		        	  player.sendMessage("§7Gamemode: » §c§lCreative");
		        	  
		          } else if (player.getGameMode() == GameMode.ADVENTURE) {
		        	  
		        	  player.sendMessage("§7Gamemode: » §c§lAdventure");
		        	  
		          } else if (player.getGameMode() == GameMode.SPECTATOR) {
		        	  
		        	  player.sendMessage("§7Gamemode: » §c§lSpectator");
		        	  
		          }

		          
                  if (player.getAllowFlight() == true) {
                	  
                	  player.sendMessage("§7Fly  » §aYes");
                	  
                  } else {
                	  
                	  player.sendMessage("§7Fly  » §4No");
                	  
                  }
		          
		          if (player.hasPermission("*")) {
		        	  
		        	   player.sendMessage("§7All Permissions » §aYes");
		          
		          } else {
		        	  
		        	  player.sendMessage("§7All Permissions » §4No");
		        	  
		          }
		          
		          if (player.isOp()) {
		        	   
		        	  player.sendMessage("§7OP » §aYes");
		          } else {
		        	  
		        	  player.sendMessage("§7OP » §4No");
		        	  
		          }	
		          
		          
		          player.sendMessage("§8§m-----------------------------------------------------");
		        }
		        else if (args.length == 0)
		        {
		          sender.sendMessage("§7Usage: /whois <player>");
		        }
		        if (args.length > 0) {
		          switch (args.length)
		          {
		          case 1: 
		            Player player = Bukkit.getPlayer(args[0]);
		            if (player == null)
		            {
		              sender.sendMessage("§c§lServer §8┃ §7That player is not online");
		            }
		            else
		            {
				          
				          sender.sendMessage("§8§m-----------------------------------------------------");
				          
				          sender.sendMessage("§7Name » §c§l" + player.getDisplayName());
				          
				          sender.sendMessage("§7Health » §c§l" + player.getHealth() + "/" + player.getMaxHealth());
				          
				          sender.sendMessage("§7Food  » §c§l" + player.getFoodLevel() + "/20");
				          
				          if (player.getGameMode() == GameMode.SURVIVAL) {
				        	  
				        	  sender.sendMessage("§7Gamemode: » §c§lSurvival");
				        	  
				          } else if (player.getGameMode() == GameMode.CREATIVE) {
				        	  
				        	  sender.sendMessage("§7Gamemode: » §c§lCreative");
				        	  
				          } else if (player.getGameMode() == GameMode.ADVENTURE) {
				        	  
				        	  sender.sendMessage("§7Gamemode: » §c§lAdventure");
				        	  
				          } else if (player.getGameMode() == GameMode.SPECTATOR) {
				        	  
				        	  sender.sendMessage("§7Gamemode: » §c§lSpectator");
				        	  
				          }
				          
		                  if (player.getAllowFlight() == true) {
		                	  
		                	  sender.sendMessage("§7Fly  » §aYes");
		                	  
		                  } else {
		                	  
		                	  sender.sendMessage("§7Fly  » §4No");
		                	  
		                  }
				          
				          if (player.hasPermission("*") ) {
				        	  
				        	   sender.sendMessage("§7All Permissions » §aYes");
				          
				          } else {
				        	  
				        	  sender.sendMessage("§7All Permissions » §4No");
				        	  
				          }
				          
				          if (player.isOp()) {
				        	   
				        	  sender.sendMessage("§7OP » §aYes");
				          } else {
				        	  
				        	  sender.sendMessage("§7OP » §4No");
				        	  
				          }
				          
				          sender.sendMessage("§8§m-----------------------------------------------------");

		            }
		            break;
		          }
		        }
		      }
		      else
		      {
		        sender.sendMessage("Unknown command. Type " + help + " for help.");
		      }
		      return true;
		    }
    
    return false;
	  }
}
