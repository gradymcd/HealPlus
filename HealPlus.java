package com.teknostuf.healplus;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class HealPlus extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static HealPlus plugin;

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled.");
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;

		if (commandLabel.equalsIgnoreCase("healplus") || commandLabel.equalsIgnoreCase("hp") && player.hasPermission("hp.heal")){
			if (args.length == 0) {
				player.setHealth(20);
				player.setFireTicks(0);
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "You have been healed!");
			} else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				targetPlayer.setHealth(20);
				targetPlayer.setFireTicks(0);
				targetPlayer.setFoodLevel(20);
				player.sendMessage(ChatColor.RED + "You have healed" + player.getServer().getPlayerExact(getName()) + "!");
				targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been healed!");
			} else if (args.length == 2) {
				if (player.getServer().getPlayer(args[0]) != null) {
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				targetPlayer.setHealth(20);
				targetPlayer.setFireTicks(0);
				targetPlayer.setFoodLevel(20);
				player.sendMessage(ChatColor.GREEN + "You have healed that player!");
				targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been healed!");
			} else if (args.length == 3) {
				player.sendMessage(ChatColor.DARK_RED + "This feature is not yet available");
			} else {
				player.sendMessage(ChatColor.RED + "That player is not online!");
					}
				}
			}
		} if (commandLabel.equalsIgnoreCase("feedplus") || commandLabel.equalsIgnoreCase("fp") && player.hasPermission("hp.feed")) {
			if (args.length == 0) {
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "You have been fed!");
			} else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					player.setFoodLevel(20);
					player.sendMessage(ChatColor.RED + "You have fed" + player.getServer().getPlayerExact(getName()) + "!");
					targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been fed!");
			} else if (args.length == 2) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					player.setFoodLevel(20);
					player.sendMessage(ChatColor.GREEN + "You have fed" + player.getServer().getPlayerExact(getName()) + "!");
						targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been fed!");
			} else {
					player.sendMessage(ChatColor.RED + "That player is not online!");
					}
				}
			}
		}
		return false;
	}
}
