package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import main.main;

public class CreateConfig implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("shortcmds.createconfig")) {
			sender.sendMessage("§6Die Config wurde erstellt!");
			main.config.set("Messages.JoinMessage", "§c[Player]§6 hat den Server betreten!");
			main.config.set("Messages.QuitMessage", "§c[Player]§6 hat den Server verlassen!");
			main.config.set("Messages.Broadcast", "§7[§4§lBroadcast§7]");
			main.config.set("Messages.WrongPlayer", "§6Bitte gebe einen Spieler an!");
			main.config.set("Messages.WrongArguments", "§4Falsche Argumente!");
			main.config.set("Messages.NoPermission", "§4Däfür hast du keine Rechte!");
			main.config.set("Messages.OnlyPlayer", "§6Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
			main.getPlugin().saveConfig();
		}
		return false;
	}
}