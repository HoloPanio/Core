package Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class NoHunger implements Listener {

	@EventHandler
	
	public void food(FoodLevelChangeEvent e) {
		
		e.setFoodLevel(20);
		
	}
	
}
