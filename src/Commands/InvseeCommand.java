package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand implements CommandExecutor{
	  String help = "\"/help\"";
	  String phelp = "Unknown command. Type " + help + " for help.";
	  String noPerm = "§c§lERROR! §7Insufficient Permissions";
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			if (sender.hasPermission("server.invsee.use")) {
			Player p = (Player) sender;

			if(args.length == 1) {
				Player target = Bukkit.getPlayer(args[0]);
				
               if(target == null) {
            	   
            	   p.sendMessage("§7This player is not online");
            	   
            	   return true;
            	   
               } else {
            	   p.sendMessage("§7You are looking in the invintory of §9" + target.getName());
            	   
            	   p.openInventory(target.getInventory());
            	   
            	   return true;
               }
				
			}
			
			} else {
		        sender.sendMessage(phelp);
		      }
		}
		
		return false;
	}

	
	
}
