package Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OpBlocker implements Listener{

	@EventHandler
	public void PlayerCMD1(PlayerCommandPreprocessEvent e) {
		
		String msg = e.getMessage().toLowerCase();
		
		if (msg.startsWith("/op")) {
			
			if (!(e.getPlayer().hasPermission("server.op.bypass"))) {
			e.setCancelled(true);
			e.getPlayer().sendMessage("§c§lERROR! §7This command is disabled.");
			
			
			} else {
				
				e.setCancelled(false);
			
			}
		}
	}
	
}
