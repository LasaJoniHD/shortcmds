package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Info implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(" ");
			sender.sendMessage("ShortCMDS wurde von LasaJoni programmiert!");
			sender.sendMessage("Benutze /shortcmds help um Hilfe zu erhalten!");
			sender.sendMessage(" ");
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(" ");
				sender.sendMessage("ShortCMDS Help");
			} else {
				sender.sendMessage("Falsche Argumente!");
			}
		} else {
			sender.sendMessage("Falsche Argumente!");
		}
		return false;
	}
}
