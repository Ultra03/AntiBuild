package me.ultramlg1108.AntiBuild;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockDestroyEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("Enabling AntiBuild v0.0.1 by ultraMLG1108");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Disabling AntiBuild v0.0.1 by ultraMLG1108");
	}
	
	@EventHandler
	public void antiBuild(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		
		if(!player.hasPermission("antibuild.build")) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void antiDestroy(BlockDestroyEvent event) {
		Player player = event.getPlayer();
		
		if(!player.hasPermission("antibuild.destroy")) {
			event.setCancelled(true);
		}
	}
	
	
	
	
	
}
