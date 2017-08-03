package net.graystone.java.rp.integration;

import org.bukkit.entity.Player;

import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PEXIntegration {

	private static PEXIntegration i = new PEXIntegration();
	public static PEXIntegration get() { return PEXIntegration.i; }
	
	public static PermissionUser getUser(Player player)
	{
		PermissionUser user = PermissionsEx.getUser(player.getName());
				
		return user;
	}
	
}
