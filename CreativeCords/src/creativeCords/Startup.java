package creativeCords;

import org.bukkit.plugin.java.JavaPlugin;

public class Startup extends JavaPlugin{

	public void onEnable() {
		this.saveConfig();
		super.onEnable();
	}
	
	public void onDisable() {
		this.saveConfig();
		super.onDisable();
	}
	
}