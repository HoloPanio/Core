package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.holopanio.dev.SettingsManager;

public class FlyCommand implements CommandExecutor {

	  String help = "\"/help\"";
	  String phelp = "Unknown command. Type " + help + " for help.";
	  String noPerm = "§4§lERROR §8» §7Insufficient permissions!";
	  
      SettingsManager settings = SettingsManager.getInstance();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("fly")) {
        	
        	if (settings.getConfig().getString("Lobby").equals("true")) {
        		
            if (sender.hasPermission("server.fly")) {
              
          	  if ((args.length == 0) && ((sender instanceof Player))) {
                
          		  Player player = (Player)sender;
                
          		  if (player.getAllowFlight()) {
                  
          			  player.setAllowFlight(false);
          			  player.sendMessage("§7Set fly mode §9disabled§7 for " + player.getName());
          			  
          			  return true;
          			  
          		  } else {
                  
          			  player.setAllowFlight(true);
          			  player.sendMessage("§7Set fly mode §9enabled§7 for " + player.getName());
                  
          			  return true;
          			  
          		  }
              
          	  } else if (args.length == 0) {
                
          		  sender.sendMessage("§7Usage: /fly or /fly <Player>");
              
          		  return true;
          		  
          	  }
              
          	  if (args.length > 0) {
                
              	switch (args.length)
               
              	{
                
              	case 1: 
                  if (sender.hasPermission("server.fly.others")) {
              		Player player = Bukkit.getPlayer(args[0]);
              		if (player == null)
                 
              		{
                    
              			sender.sendMessage("§7That player is not online");
              
              			return true;

              		} else if (player.getAllowFlight()) {
                    
              			player.setAllowFlight(false);
              			player.sendMessage("§7Set fly mode §9disabled§7 for " + player.getName());
              			sender.sendMessage("§7Set fly mode §9disabled§7 for " + player.getName());
              			
              			return true;
              		
              		} else {        			
                   
              			player.setAllowFlight(true);
              			player.sendMessage("§7Set fly mode §9enabled§7 for " + player.getName());
              			sender.sendMessage("§7Set fly mode §9enabled§7 for " + player.getName());
              		
              			return true;
              			
              		} 
                  }  else {
          			sender.sendMessage(noPerm);
          		
          			return true;
                  
                  }
              		                
              	}
             
              }
            
            } else {
          	  sender.sendMessage(phelp);
            
          	  return true;
            }
            
        	} else if (settings.getConfig().getString("Lobby").equals("false")) {
        		
                if (sender.hasPermission("server.game.fly")) {
                    
                	  if ((args.length == 0) && ((sender instanceof Player))) {
                      
                		  Player player = (Player)sender;
                      
                		  if (player.getAllowFlight()) {
                        
                			  player.setAllowFlight(false);
                			  player.sendMessage("§7Set fly mode §9disabled§7 for " + player.getName());
                			  
                			  return true;
                			  
                		  } else {
                        
                			  player.setAllowFlight(true);
                			  player.sendMessage("§7Set fly mode §9enabled§7 for " + player.getName());
                        
                			  return true;
                			  
                		  }
                    
                	  } else if (args.length == 0) {
                      
                		  sender.sendMessage("§7Usage: /fly or /fly <Player>");
                    
                		  return true;
                		  
                	  }
                    
                	  if (args.length > 0) {
                      
                    	switch (args.length)
                     
                    	{
                      
                    	case 1: 
                        if (sender.hasPermission("server.game.fly.others")) {
                    		Player player = Bukkit.getPlayer(args[0]);
                    		if (player == null) {
                          
                    			sender.sendMessage("§7That player is not online");
                    
                    			return true;

                    		} else if (player.getAllowFlight()) {
                          
                    			player.setAllowFlight(false);
                    			player.sendMessage("§7Set fly mode §9disabled§7 for " + player.getName());
                    			sender.sendMessage("§7Set fly mode §9disabled§7 for " + player.getName());
                    			
                    			return true;
                    		
                    		} else {        			
                         
                    			player.setAllowFlight(true);
                    			player.sendMessage("§7Set fly mode §9enabled§7 for " + player.getName());
                    			sender.sendMessage("§7Set fly mode §9enabled§7 for " + player.getName());
                    		
                    			return true;
                    			
                    		} 
                        }  else {
                			sender.sendMessage(noPerm);
                		
                			return true;
                        
                        }
                    		                
                    	}
                   
                    }
                  
                  } else {
                	  sender.sendMessage(phelp);
                  
                	  return true;
                  }
        		
        	}
        	
          }
		
		return false;
	}

}
