package Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.LeavesDecayEvent;

public class WorldGuard implements Listener{
	

	@EventHandler
	public void onIceMelt(BlockFadeEvent e) {
		
		 if (e.getBlock().getType().equals(Material.ICE)) {
			
			e.setCancelled(true);
			
		}
		
	}
	
	@EventHandler
	public void onLeafDecay(LeavesDecayEvent e) {
		
		e.setCancelled(true);
		
	}
	
}

