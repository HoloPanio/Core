package Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import Commands.FreezeCommand;

public class FreezeListener implements Listener {
	
	
	
	  @EventHandler
	  
	  public void onPlayerMove(PlayerMoveEvent e) {
	    
		  Player p = e.getPlayer();
	    
		  if (FreezeCommand.frozen.contains(p.getName())) {
	      
			  e.setTo(e.getFrom());
			  p.sendMessage("§7You are currently frozen!");
	    }
	  }

}
