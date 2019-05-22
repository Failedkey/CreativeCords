package creativeCords.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHelp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(!(arg0 instanceof Player)) {
			arg0.sendMessage("Must be a player to use this plugin!");
		}else {
			Player player = (Player) arg0;
			if(arg1.getName().equalsIgnoreCase("Chelp")) {
				player.sendMessage(ChatColor.GOLD + "===========================");
				player.sendMessage(ChatColor.GOLD + "CHelp - Plugin help command");
				player.sendMessage(ChatColor.GOLD + "===========================");
			}
		}
		return false;
	}

}
