package GamemodeCommands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMSP implements CommandExecutor{
	
	  String help = "\"/help\"";
	  String phelp = "Unknown command. Type " + help + " for help.";
	  String noPerm = "�4�lERROR �8� �7Insufficient permissions!";
	
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  
		  if (sender instanceof Player) {
		  
		      if (sender.hasPermission("server.gmsp")) {
		  
		    	  if ((args.length == 0)) {
		    		  
		          Player player = (Player)sender;
		          
		          player.setGameMode(GameMode.SPECTATOR);
		          player.sendMessage("�7Set game mode �9spectator �7for �9" + sender.getName());
		          
		          return true;
		       
		    	  } else if (args.length == 0) {
		    		  
		          sender.sendMessage("�7Usage: /gmsp <player>");
		        
		          return true;
		          
		    	  }
		        
		    	  if (args.length > 0) {
		         
		    		  switch (args.length) {
		   
		    		  case 1: 
		    			  if (sender.hasPermission("server.gmsp.others")) {
		    				  Player player = Bukkit.getPlayer(args[0]);
		        
		    			  	if (player == null) {
		    				        
		    			  		sender.sendMessage("�7That player is not online");
		    			  
		    			  		return true;
		    				  
		    			  	} else {
		    				  
		    			  		player.setGameMode(GameMode.SPECTATOR);	
		    			  		player.sendMessage("�7Set game mode �9spectator �7for �9" + player.getName());
		    			  		sender.sendMessage("�7Set game mode �9spectator �7for �9" + player.getName());
		    				    
		    			  		return true;
		           
		    			  	}
		    		  		} else {
		    		  			
		    		  			sender.sendMessage(noPerm);
		    		  			
		    		  		}
		    	  }
		      }
		    	  
		  }	else {
		        
		    	  	sender.sendMessage(phelp);
		      
		  }
		    	
		      
	  }
		  
	  return true;
}

}

