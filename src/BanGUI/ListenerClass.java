package BanGUI;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;

import net.md_5.bungee.api.ChatColor;

public class ListenerClass implements Listener {
	
  ArrayList<String> target = TempbanCommand.target;
  String targets = TempbanCommand.targets;
  
  @EventHandler
  public void leave(InventoryCloseEvent event)
  {
    Player player = (Player)event.getPlayer();
    
    this.target.clear();
  }
  
  @EventHandler
  public void invDragEvent(InventoryDragEvent e)
  {
    Inventory inv = e.getInventory();
    String name = inv.getName();
    if (name.equals(ChatColor.RED + "Ban Menu"))
    {
      e.setCancelled(true);
      return;
    }
  }
  
  @EventHandler
  public void invClickEvent(InventoryClickEvent e)
  {
    Inventory inv = e.getInventory();
    Player player = (Player)e.getWhoClicked();
    
    String name = inv.getName();
    if (name.equals(ChatColor.RED + "Ban Menu"))
    {
      e.setCancelled(true);
      int slot = e.getSlot();
      if (slot < 0) {
        return;
      }
      if (slot == 0)
      {
        player.performCommand("ban " + this.target + " 3d xRay Hacking");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 1)
      {
        player.performCommand("ban " + this.target + " 7d Fly Hacking / Speed Hacking");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 2)
      {
        player.performCommand("ban " + this.target + " 30d PVP / KillAura Hacks");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 3)
      {
        player.performCommand("ban " + this.target + " Exploiting (Destroy Items/ Money)");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 4)
      {
        player.performCommand("ban " + this.target + " 60d Griefing");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 5)
      {
        player.performCommand("ban " + this.target + " 7d Harassment / Sexism / Threats");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 6)
      {
        player.performCommand("ban " + this.target + " 7d Staff Impersonation / Disrespect");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 7)
      {
        player.performCommand("mute " + this.target + " Advertising");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 8)
      {
        player.performCommand("ban " + this.target + " 3d Other / Minor Offenses");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 9)
      {
        player.performCommand("ban " + this.target + " 14d Autoclicker (Non-PVP)");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 10)
      {
        player.performCommand("mute " + this.target + " 3d Spamming Chat or Commands");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 11)
      {
        player.performCommand("ban " + this.target + " 7d Racism (Verbal / Other)");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 12)
      {
        player.performCommand("ban " + this.target + " Inappropiate Skin / Name -- Apply after you have changed it.");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 13)
      {
        player.performCommand("ban " + this.target + " 30d Botting / Raiding");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 14)
      {
        player.performCommand("ban " + this.target + " 60d Phase / Freecam Hacking");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 15)
      {
        player.performCommand("ban " + this.target + " 3d Derp / Flasking Skin / Crouch Spam");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 16)
      {
        player.performCommand("ban " + this.target + " Lag Machine / DDoS Threats or Attempts");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 17)
      {
        player.performCommand("ban " + this.target + " Lag Machine / DDoS Threats or Attempts");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 27)
      {
        player.performCommand("ban " + this.target + " 3d Manual 3 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 28)
      {
        player.performCommand("ban " + this.target + " 7d Manual 7 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 29)
      {
        player.performCommand("say ban " + this.target + " 14d Manual 14 Day say ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 30)
      {
        player.performCommand("ban " + this.target + " 21d Manual 21 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 31)
      {
        player.performCommand("ban " + this.target + " 30d Manual 30 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 32)
      {
        player.performCommand("ban " + this.target + " 60d Manual 60 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 33)
      {
        player.performCommand("ban " + this.target + " 90d Manual 90 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 34)
      {
        player.performCommand("ban " + this.target + " 120d Manual 120 Day Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      if (slot == 35)
      {
        player.performCommand("ban " + this.target + " Manual Perm Ban");
        player.closeInventory();
        this.target.clear();
        
        return;
      }
      return;
    }
  }
}
