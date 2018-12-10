package Listeners;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Chat implements Listener {
	
	
  public String getStaffRank(Player p)
  {
    if (PermissionsEx.getUser(p).inGroup("Owner")) {
      return "§8[§4§lOwner§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Lead-Developer")) {
      return "§8[§d§lLead Developer§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Developer")) {
        return "§8[§5§lDeveloper§8] ";
      } 
    if (PermissionsEx.getUser(p).inGroup("Head-Admin")) {
        return "§8[§e§lHead Admin§8] ";
      }   
    if (PermissionsEx.getUser(p).inGroup("Admin")) {
      return "§8[§6§lAdministrator§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Sr.Mod")) {
      return "§8[§2§lSenior Moderator§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Mod")) {
      return "§8[§a§lModerator§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Helper")) {
      return "§8[§b§lHelper§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Builder")) {
      return "§8[§3§lBuild Team§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Pac-Man")) {
      return "§8[§ePac-Man§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Tetris")) {
      return "§8[§6Tetris§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Asteroids")) {
      return "§8[§9Asteroids§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("Space-Invaders")) {
      return "§8[§aSpace Invaders§8] ";
    }
    if (PermissionsEx.getUser(p).inGroup("YouTuber")) {
      return "§8[§4§lYou§f§lTube§8] ";
    }
    return "";
  }
  
  public String getNameColor(Player p)
  {
	    if (PermissionsEx.getUser(p).inGroup("Owner")) {
	        return "§c";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Lead-Developer")) {
		    return "§5";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Developer")) {
		    return "§d";
		  } 
		  if (PermissionsEx.getUser(p).inGroup("Head-Admin")) {
			 return "§e";
		  }     
	      if (PermissionsEx.getUser(p).inGroup("Admin")) {
	        return "§6";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Sr.Mod")) {
	        return "§2";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Mod")) {
	        return "§a";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Helper")) {
	        return "§b";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Builder")) {
	        return "§3";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Pac-Man")) {
	        return "§e";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Tetris")) {
	        return "§6";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Asteroids")) {
	        return "§9";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Space-Invaders")) {
	        return "§a";
	      }
	      if (PermissionsEx.getUser(p).inGroup("YouTuber")) {
	        return "§f";
	      }
	      return "§7";
	    }
  
  public String getChatColor(Player p)
  {
	    if (PermissionsEx.getUser(p).inGroup("Owner")) {
	        return "§c";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Lead-Developer")) {
		    return "§5";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Developer")) {
		    return "§d";
		  } 
	      if (PermissionsEx.getUser(p).inGroup("Head-Admin")) {
		    return "§e";
		  }   
	      if (PermissionsEx.getUser(p).inGroup("Admin")) {
	        return "§6";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Sr.Mod")) {
	        return "§2";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Mod")) {
	        return "§a";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Helper")) {
	        return "§b";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Builder")) {
	        return "§3";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Pac-Man")) {
	        return "§f";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Tetris")) {
	        return "§f";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Asteroids")) {
	        return "§f";
	      }
	      if (PermissionsEx.getUser(p).inGroup("Space-Invaders")) {
	        return "§f";
	      }
	      if (PermissionsEx.getUser(p).inGroup("YouTuber")) {
	        return "§4";
	      }
	      return "§7";
	    }
  
  @EventHandler
  public void Chat(AsyncPlayerChatEvent e) {
    Player p = e.getPlayer();
    
    e.setFormat(getStaffRank(p) + getNameColor(p) + e.getPlayer().getDisplayName() + " §7» " + getChatColor(p) + e.getMessage().replaceAll("!@", "§").replaceAll("%", "¼"));
    	
  } 
  

}  