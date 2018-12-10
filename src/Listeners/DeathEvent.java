package Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener{
	
	
	@EventHandler
	public void onPlayerRespawn(PlayerDeathEvent e) {
		
		Player p = (Player) e.getEntity();
		
		if (e.getEntity() instanceof Player) {
		
			if (p.isDead()) {
				
			p.spigot().respawn();
				
			p.performCommand("spawn");
			}
			
		}
	}

}
