package Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class NoBreak implements Listener {
	
	@EventHandler

	public void BlockBreak(BlockBreakEvent e) {
		
		if (e.getPlayer().hasPermission("server.break.bypass")) {
			
			e.setCancelled(false);
			
		} else {
			
			e.setCancelled(true);
			e.getPlayer().sendMessage("§4§lERROR §8» §7Insufficient permissions!");
			
		}
		
	}

}
