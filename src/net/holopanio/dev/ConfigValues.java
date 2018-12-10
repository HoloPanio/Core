package net.holopanio.dev;

public class ConfigValues {
	
	SettingsManager settings = SettingsManager.getInstance();
	
	public void lobbyCfg() {
		
		settings.getConfig().getString("Lobby");
		
	}
	
}
