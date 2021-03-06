package creativeCords.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import creativeCords.Startup;

public class CommandPos implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Startup sp = new Startup();
		if(arg0.getName().equalsIgnoreCase("pos1")) {
			if(!(arg0 instanceof Player)) {
				arg0.sendMessage("Must be a player to run this command!");
			}else {
				Player player = (Player) arg0;
				if(player.hasPermission("CreativeCords.cords") || player.isOp()) {
					sp.getConfig().set("pos1", player.getLocation());
					
					player.sendMessage(ChatColor.GOLD + "CreativeCords: " + ChatColor.RESET + "Config cords set to (X,Z): " + 
							ChatColor.GREEN + player.getLocation().getX() + " " + player.getLocation().getZ());

				}
				if(arg0.getName().equalsIgnoreCase("pos2")) {
					if(!(arg0 instanceof Player)) {
						arg0.sendMessage("Must be a player to run this command!");
					}else {
						if(player.hasPermission("CreativeCords.cords") || player.isOp()) {
							sp.getConfig().set("pos2", player.getLocation());
							
							player.sendMessage(ChatColor.GOLD + "CreativeCords: " + ChatColor.RESET + "Config cords set to (X,Z): " + 
									ChatColor.GREEN + player.getLocation().getX() + " " + player.getLocation().getZ());
						}
					}
				}
			}
		}
		return false;
	}
}