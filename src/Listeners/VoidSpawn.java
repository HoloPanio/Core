package Listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class VoidSpawn implements Listener { 
  
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		Player p = event.getPlayer();
		Location loc = p.getLocation();;

		if (loc.getBlockY() <= 0){
			
			event.getPlayer().performCommand("spawn");
    
		}
  
	}    

}