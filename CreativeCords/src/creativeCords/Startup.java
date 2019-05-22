package creativeCords;

import org.bukkit.plugin.java.JavaPlugin;

import creativeCords.Commands.CommandHelp;
import creativeCords.Commands.CommandPos;

public class Startup extends JavaPlugin{
	
	public void onEnable() {
		//Commands
		getCommand("Chelp").setExecutor(new CommandHelp());
		getCommand("pos").setExecutor(new CommandPos());
		
		//Events
		
		this.saveConfig();
		super.onEnable();
	}
	
	public void onDisable() {
		this.saveConfig();
		super.onDisable();
	}
	
}