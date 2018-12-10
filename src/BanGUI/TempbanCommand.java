package BanGUI;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
 
public class TempbanCommand implements CommandExecutor {
	
	public static String targets;
	public String life = "life";
	
	public static ArrayList<String> target = new ArrayList<String>()
	{
	    private static final long serialVersionUID = 1L;

	    @Override public String toString()
	    {
	        return super.toString().substring(1,super.toString().length()-1) ;
	    }
	};
   
   
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
        if (sender instanceof Player && args.length == 1)
        {
            Player p = (Player) sender;
            if (args.length > 0) {
                switch (args.length)
                {
                case 1: 
                  Player targets = Bukkit.getPlayer(args[0]);
                  if (life == "life" && sender.hasPermission("tempban.use"))
                  {
                      target.add(args[0]);
                	  Menus.openMenu(p);
                  

                  } 
                }
            }
//            else
//            {
//                if (args[0].equalsIgnoreCase("main"))
//                {
//                    Menus.openMain(player);
//                }
//                else
//                {
//                    Menus.openWarps(player);
//                }
//            }
            return true;
        }
       
        return false;
    }
}