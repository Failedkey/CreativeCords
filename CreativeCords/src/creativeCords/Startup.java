package creativeCords;

import org.bukkit.plugin.java.JavaPlugin;

import creativeCords.Commands.CommandHelp;

public class Startup extends JavaPlugin{
	
	public void onEnable() {
		//Commands
		getCommand("Chelp").setExecutor(new CommandHelp());
		
		//Events
		
		this.saveConfig();
		super.onEnable();
	}
	
	public void onDisable() {
		this.saveConfig();
		super.onDisable();
	}
	
}