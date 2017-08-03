package net.graystone.java.rp.engine;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.massivecraft.massivecore.Engine;

import net.graystone.java.rp.entity.MPlayer;

public class LocationEngine extends Engine{
/*	
	private static LocationEngine i = new LocationEngine();
	public static LocationEngine get() { return LocationEngine.i; }
	
	@EventHandler
	public void join(PlayerJoinEvent event){
		Player rawPlayer = event.getPlayer();
		MPlayer player = MPlayer.get(rawPlayer);
		
		World world = rawPlayer.getLocation().getWorld();
		double x = rawPlayer.getLocation().getX();
		double y = rawPlayer.getLocation().getY();
		double z = rawPlayer.getLocation().getZ();
		float yaw = rawPlayer.getLocation().getYaw();
		float pitch = rawPlayer.getLocation().getPitch();
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) {
			player.setCharWorld(world);
			player.setCharX(x);
			player.setCharY(y);
			player.setCharZ(z);
			player.setCharYaw(yaw);
			player.setCharPitch(pitch);
		}
		
		if (charUsing == 2) {
			player.setChar2World(world);
			player.setChar2X(x);
			player.setChar2Y(y);
			player.setChar2Z(z);
			player.setChar2Yaw(yaw);
			player.setChar2Pitch(pitch);
		}
		
		if (charUsing == 3) {
			player.setChar3World(world);
			player.setChar3X(x);
			player.setChar3Y(y);
			player.setChar3Z(z);
			player.setChar3Yaw(yaw);
			player.setChar3Pitch(pitch);
		}
		return;
	}
		
	@EventHandler
	public void leave(PlayerQuitEvent event){
		Player rawPlayer = event.getPlayer();
		MPlayer player = MPlayer.get(rawPlayer);
			
		World world = rawPlayer.getLocation().getWorld();
		double x = rawPlayer.getLocation().getX();
		double y = rawPlayer.getLocation().getY();
		double z = rawPlayer.getLocation().getZ();
		float yaw = rawPlayer.getLocation().getYaw();
		float pitch = rawPlayer.getLocation().getPitch();
			
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) {
			player.setCharWorld(world);
			player.setCharX(x);
			player.setCharY(y);
			player.setCharZ(z);
			player.setCharYaw(yaw);
			player.setCharPitch(pitch);
		}
			
		if (charUsing == 2) {
			player.setChar2World(world);
			player.setChar2X(x);
			player.setChar2Y(y);
			player.setChar2Z(z);
			player.setChar2Yaw(yaw);
			player.setChar2Pitch(pitch);
		}
			
		if (charUsing == 3) {
			player.setChar3World(world);
			player.setChar3X(x);
			player.setChar3Y(y);
			player.setChar3Z(z);
			player.setChar3Yaw(yaw);
			player.setChar3Pitch(pitch);
		}		
	}*/
}
