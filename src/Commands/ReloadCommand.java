package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.holopanio.dev.SettingsManager;

public class ReloadCommand implements CommandExecutor{
	
	  String help = "\"/help\"";
	  String phelp = "Unknown command. Type " + help + " for help.";
	
	  SettingsManager settings = SettingsManager.getInstance();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  
		if (sender.hasPermission("server.config.reload")) {
			
			settings.reloadConfig();
			
			sender.sendMessage("§7Successfully reloaded the server core configuration!");
			
			return true;
			
		} else {

			sender.sendMessage(phelp);
			
			return true;
			
		}
		
	}

}
