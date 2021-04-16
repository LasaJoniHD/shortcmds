package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import main.main;

public class Broadcast implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("shortcmds.broadcast")) {
			if (args.length >= 1) {
				String msg = "";
				for (int i = 0; i < args.length; i++) {
					msg = msg + args[i] + " ";
				}
				String msgTwo = main.config.getString("Messages.Broadcast");
				Bukkit.broadcastMessage(msgTwo.replaceAll("&", "§") + " " + msg.replaceAll("&", "§"));

			} else {
				sender.sendMessage("§6Bitte verwende /broadcast <Message>");
			}
		} else {
			sender.sendMessage("§4Dafür hast du keine Rechte!");
		}
		return false;
	}

}
