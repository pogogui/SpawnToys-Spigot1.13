package me.pogogui.spawnminigames;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getCommand("toys").setExecutor(new Gui());
		Bukkit.getPluginManager().registerEvents(new GuiListener(this), this);
	}
	
	
}
