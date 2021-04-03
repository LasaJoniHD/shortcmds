package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import main.main;

public class CreateConfig implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		sender.sendMessage("Die Config wurde erstellt!");
		main.config.set("Messages.JoinMessage", "[Player] hat den Server betreten!");
		main.config.set("Messages.QuitMessage", "[Player] hat den Server verlassen!");
		main.getPlugin().saveConfig();
		return false;
	}
}