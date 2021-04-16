package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Info implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(" ");
			sender.sendMessage("§6ShortCMDS wurde von LasaJoni programmiert!");
			sender.sendMessage("§6Die momentane Version ist " + main.main.version + ".");
			sender.sendMessage("§6Benutze /shortcmds help um Hilfe zu erhalten!");
			sender.sendMessage(" ");
		} else if (args.length == 1) {
			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(" ");
				sender.sendMessage("§6    ShortCMDS Help");
				sender.sendMessage("§7=======================");
				sender.sendMessage(" ");
				sender.sendMessage("§6Benutze /help ShortCMDS");
				sender.sendMessage(" ");
			} else {
				sender.sendMessage("§4Falsche Argumente!");
			}
		} else {
			sender.sendMessage("§4Falsche Argumente!");
		}
		return false;
	}
}
