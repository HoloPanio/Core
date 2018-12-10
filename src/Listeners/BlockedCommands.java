
package Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class BlockedCommands implements Listener{

	@EventHandler
	public void PlayerCMD(PlayerCommandPreprocessEvent e) {
		
		String msg = e.getMessage().toLowerCase();
		
		if (msg.startsWith("/minecraft:")) {
			
			e.setCancelled(true);
			e.getPlayer().sendMessage("§c§lERROR! §7This command is disabled.");
			
		}
	}
	
	@EventHandler
	public void PlayerCMD1(PlayerCommandPreprocessEvent e) {
		
		String msg = e.getMessage().toLowerCase();
		
		if (msg.startsWith("/bukkit:")) {
			
			e.setCancelled(true);
			e.getPlayer().sendMessage("§c§lERROR! §7This command is disabled.");
			
		}
	}
	
	@EventHandler
	public void PlayerCMD2(PlayerCommandPreprocessEvent e) {
		
		String msg = e.getMessage().toLowerCase();
		
		if (msg.startsWith("/pl")) {
			
			if (!(e.getPlayer().hasPermission("server.pl.bypass"))) {
			e.setCancelled(true);
			e.getPlayer().sendMessage("Plugins (2): §aMortalCore§r, §aMortalHub");
			
			
			} else {
				
				e.setCancelled(false);
			
			}
		}
	}
	
}
