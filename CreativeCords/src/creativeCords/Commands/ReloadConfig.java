package creativeCords.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import creativeCords.Config;

public class ReloadConfig implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(!(arg0 instanceof Player)) {
			arg0.sendMessage("Must be a player to use this plugin!");
		}else {
			Player player = (Player) arg0;
			Config config = new Config();
			config.reloadConfig();
			player.sendMessage("Creative Coords config reloaded.");

			}
		return false;
	}
}
