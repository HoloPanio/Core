package BanGUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Menus
{
   public static void openMenu(Player player) {
       Inventory inv = Bukkit.createInventory(null, 36, ChatColor.RED + "Ban Menu");
      
       /*
        * Generic Bans
        */
       
       ItemStack xrayIcon = new ItemStack(Material.DIAMOND, 1);
       ItemMeta xrayMeta = xrayIcon.getItemMeta();
       xrayMeta.setDisplayName("§b§oXray Hacks");
       xrayIcon.setItemMeta(xrayMeta);
      
       ItemStack flyIcon = new ItemStack(Material.FEATHER, 1);
       ItemMeta flyMeta = flyIcon.getItemMeta();
       flyMeta.setDisplayName("§b§oFly Hacking / Speed Hacking / Water Walking");
       flyIcon.setItemMeta(flyMeta);
       
       ItemStack pvpIcon = new ItemStack(Material.IRON_SWORD, 1);
       ItemMeta pvpMeta = pvpIcon.getItemMeta();
       pvpMeta.setDisplayName("§b§oPvP / KillAura Hacks");
       pvpIcon.setItemMeta(pvpMeta);
       
       ItemStack exploitIcon = new ItemStack(Material.ENDER_CHEST, 1);
       ItemMeta exploitMeta = exploitIcon.getItemMeta();
       exploitMeta.setDisplayName("§b§oExploiting (Destroy Items / Money)");
       exploitIcon.setItemMeta(exploitMeta);
       
       ItemStack griefingIcon = new ItemStack(Material.TNT, 1);
       ItemMeta griefingMeta = griefingIcon.getItemMeta();
       griefingMeta.setDisplayName("§b§oGriefing");
       griefingIcon.setItemMeta(griefingMeta);
       
       ItemStack harassmentIcon = new ItemStack(Material.BOOK_AND_QUILL, 1);
       ItemMeta harassmentMeta = harassmentIcon.getItemMeta();
       harassmentMeta.setDisplayName("§b§oHarassment / Sexism / Threats");
       harassmentIcon.setItemMeta(harassmentMeta);

       ItemStack impersonationIcon = new ItemStack(Material.SKULL_ITEM, 1);
       ItemMeta impersonationMeta = impersonationIcon.getItemMeta();
       impersonationMeta.setDisplayName("§b§oStaff Impersonation / Disrespect");
       impersonationIcon.setItemMeta(impersonationMeta);
       
       ItemStack advertisingIcon = new ItemStack(Material.COMPASS, 1);
       ItemMeta advertisingMeta = advertisingIcon.getItemMeta();
       advertisingMeta.setDisplayName("§b§oAdvertising");
       advertisingIcon.setItemMeta(advertisingMeta);
       
       ItemStack otherIcon = new ItemStack(Material.BED, 1);
       ItemMeta otherMeta = otherIcon.getItemMeta();
       otherMeta.setDisplayName("§b§oOther / Minor Offenses");
       otherIcon.setItemMeta(otherMeta);
       
       ItemStack autoclickerIcon = new ItemStack(Material.WOOD_SWORD, 1);
       ItemMeta autoclickerMeta = autoclickerIcon.getItemMeta();
       autoclickerMeta.setDisplayName("§b§oAutoclicker (Non-PVP)");
       autoclickerIcon.setItemMeta(autoclickerMeta);
       
       ItemStack spamIcon = new ItemStack(Material.BOOK, 1);
       ItemMeta spamMeta = spamIcon.getItemMeta();
       spamMeta.setDisplayName("§b§oSpamming Chat or Commands");
       spamIcon.setItemMeta(spamMeta);
       
       ItemStack racismIcon = new ItemStack(Material.COAL_BLOCK, 1);
       ItemMeta racismMeta = racismIcon.getItemMeta();
       racismMeta.setDisplayName("§b§oRacism (Verbal / Other)");
       racismIcon.setItemMeta(racismMeta);    

       ItemStack skinIcon = new ItemStack(Material.LEATHER, 1);
       ItemMeta skinMeta = skinIcon.getItemMeta();
       skinMeta.setDisplayName("§b§oInappropriate Skin / Name");
       skinIcon.setItemMeta(skinMeta);
       
       ItemStack botIcon = new ItemStack(Material.COMMAND, 1);
       ItemMeta botMeta = botIcon.getItemMeta();
       botMeta.setDisplayName("§b§oBotting / Raiding");
       botIcon.setItemMeta(botMeta);
       
       ItemStack phaseIcon = new ItemStack(Material.WEB, 1);
       ItemMeta phaseMeta = phaseIcon.getItemMeta();
       phaseMeta.setDisplayName("§b§oPhase / Freecam Hacking");
       phaseIcon.setItemMeta(phaseMeta);
       
       ItemStack derpIcon = new ItemStack(Material.ARMOR_STAND, 1);
       ItemMeta derpMeta = derpIcon.getItemMeta();
       derpMeta.setDisplayName("§b§oDerp / Flasking Skin / Crouch Spam");
       derpIcon.setItemMeta(derpMeta);
       
       ItemStack lagIcon = new ItemStack(Material.DISPENSER, 1);
       ItemMeta lagMeta = lagIcon.getItemMeta();
       lagMeta.setDisplayName("§b§oLag Machine / DDoS Threats or Attempts");
       lagIcon.setItemMeta(lagMeta);
       
       ItemStack creativeIcon = new ItemStack(Material.DIAMOND_BLOCK, 1);
       ItemMeta creativeMeta = creativeIcon.getItemMeta();
       creativeMeta.setDisplayName("§b§oHacked Creative Items");
       creativeIcon.setItemMeta(creativeMeta);
       
       
       /*
        * Spacers
        */
       
       ItemStack spacerIcon = new ItemStack(Material.STAINED_GLASS_PANE, 1);
       ItemMeta spacerMeta = spacerIcon.getItemMeta();
       spacerMeta.setDisplayName(" ");
       spacerIcon.setItemMeta(spacerMeta);
       
       /*
        *  Manual Bans
        */
       
       ItemStack threeIcon = new ItemStack(Material.COAL_ORE, 1);
       ItemMeta threeMeta = threeIcon.getItemMeta();
       threeMeta.setDisplayName("§b§oManual 3 Day Ban");
       threeIcon.setItemMeta(threeMeta);
       
       ItemStack sevenIcon = new ItemStack(Material.IRON_ORE, 1);
       ItemMeta sevenMeta = sevenIcon.getItemMeta();
       sevenMeta.setDisplayName("§b§oManual 7 Day Ban");
       sevenIcon.setItemMeta(sevenMeta);
       
       ItemStack fourteenIcon = new ItemStack(Material.GOLD_ORE, 1);
       ItemMeta fourteenMeta = fourteenIcon.getItemMeta();
       fourteenMeta.setDisplayName("§b§oManual 14 Day Ban");
       fourteenIcon.setItemMeta(fourteenMeta);
       
       ItemStack twentyoneIcon = new ItemStack(Material.REDSTONE_ORE, 1);
       ItemMeta twentyoneMeta = twentyoneIcon.getItemMeta();
       twentyoneMeta.setDisplayName("§b§oManual 21 Day Ban");
       twentyoneIcon.setItemMeta(twentyoneMeta);
       
       ItemStack thirtyIcon = new ItemStack(Material.LAPIS_ORE, 1);
       ItemMeta thirtyMeta = thirtyIcon.getItemMeta();
       thirtyMeta.setDisplayName("§b§oManual 30 Day Ban");
       thirtyIcon.setItemMeta(thirtyMeta);
       
       ItemStack sixtyIcon = new ItemStack(Material.DIAMOND_ORE, 1);
       ItemMeta sixtyMeta = sixtyIcon.getItemMeta();
       sixtyMeta.setDisplayName("§b§oManual 60 Day Ban");
       sixtyIcon.setItemMeta(sixtyMeta);
       
       ItemStack ninetyIcon = new ItemStack(Material.EMERALD_ORE, 1);
       ItemMeta ninetyMeta = ninetyIcon.getItemMeta();
       ninetyMeta.setDisplayName("§b§oManual 90 Day Ban");
       ninetyIcon.setItemMeta(ninetyMeta);
       
       ItemStack onetwentyIcon = new ItemStack(Material.OBSIDIAN, 1);
       ItemMeta onetwentyMeta = onetwentyIcon.getItemMeta();
       onetwentyMeta.setDisplayName("§b§oManual 120 Day Ban");
       onetwentyIcon.setItemMeta(onetwentyMeta);
       
       
       ItemStack permIcon = new ItemStack(Material.BEDROCK, 1);
       ItemMeta permMeta = permIcon.getItemMeta();
       permMeta.setDisplayName("§b§oManual Permanent Ban");
       permIcon.setItemMeta(permMeta);
       
       //Generic Bans
       
       inv.setItem(0, xrayIcon);
       inv.setItem(1, flyIcon);
       inv.setItem(2, pvpIcon);
       inv.setItem(3, exploitIcon);
       inv.setItem(4, griefingIcon);
       inv.setItem(5, harassmentIcon);
       inv.setItem(6, impersonationIcon);
       inv.setItem(7, advertisingIcon);
       inv.setItem(8, otherIcon);
       inv.setItem(9, autoclickerIcon);
       inv.setItem(10, spamIcon);
       inv.setItem(11, racismIcon);
       inv.setItem(12, skinIcon);
       inv.setItem(13, botIcon);
       inv.setItem(14, phaseIcon);
       inv.setItem(15, derpIcon);
       inv.setItem(16, lagIcon);
       inv.setItem(17, creativeIcon);

       //Spacers
       
       inv.setItem(18, spacerIcon);
       inv.setItem(19, spacerIcon);
       inv.setItem(20, spacerIcon);
       inv.setItem(21, spacerIcon);
       inv.setItem(22, spacerIcon);
       inv.setItem(23, spacerIcon);
       inv.setItem(24, spacerIcon);
       inv.setItem(25, spacerIcon);
       inv.setItem(26, spacerIcon);
       
       //Manual Bans
       
       inv.setItem(27, threeIcon);
       inv.setItem(28, sevenIcon);
       inv.setItem(29, fourteenIcon);
       inv.setItem(30, twentyoneIcon);
       inv.setItem(31, thirtyIcon);
       inv.setItem(32, sixtyIcon);
       inv.setItem(33, ninetyIcon);
       inv.setItem(34, onetwentyIcon);
       inv.setItem(35, permIcon);
       
       player.openInventory(inv);
   }
  
//   public static void openWarps(Player player)
//   {
//       Inventory inv = Bukkit.createInventory(null, 54, "Warp Menu");
//       List<String> commands = new ArrayList<String>();
//       commands.add("say first warp");
//       commands.add("say 2 warp");
//       commands.add("say 3 warp");
//       commands.add("say 4 warp");
//       commands.add("say 5 warp");
//      
//       int warpNum = 1;
//      
//       for (String cmd : commands)
//       {
//           ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, warpNum);
//           ItemMeta data = item.getItemMeta();
//           data.setDisplayName("Warp Number: " + String.valueOf(warpNum));
//           List<String> lore = new ArrayList<String>();
//           lore.add(ChatColor.LIGHT_PURPLE + cmd);
//           data.setLore(lore);
//           item.setItemMeta(data);
//           inv.addItem(item);
//           warpNum++;
//       }
//      
//       player.openInventory(inv);
//   }
  
  
  
  
}