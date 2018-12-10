package Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class NoPlace implements Listener {
			
	@EventHandler
	
	public void BlockPlace(BlockPlaceEvent e) {	

		if (e.getPlayer().hasPermission("server.place.bypass")) {
			
			e.setCancelled(false);
			
		} else {
			
			e.setCancelled(true);
			e.getPlayer().sendMessage("§4§lERROR §8» §7Insufficient permissions!");
			
		}
		

 }

}
