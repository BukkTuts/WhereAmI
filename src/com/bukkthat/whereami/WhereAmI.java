package com.bukkthat.whereami;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class WhereAmI extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players have locations D:");
		} else {
			Player player = (Player) sender;
			double x = player.getLocation().getX();
			double y = player.getLocation().getY();
			double z = player.getLocation().getZ();
			String world = player.getWorld().getName();
			player.sendMessage(ChatColor.GOLD + "X: " + x + ", Y: " + y + ", Z: " + z + ", World: " + world);
		}
		return true;
	}

}
