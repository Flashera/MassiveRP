package net.graystone.java.rp.characters;

import org.bukkit.entity.Player;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeInteger;
import net.graystone.java.rp.MassiveRP;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.entity.MConf;
import net.graystone.java.rp.integration.MassiveChannelsIntegration;

public class UseCmd extends RPCommand
{
	
	public UseCmd()
	{
		this.addAliases("use");
		this.setDesc("set the character you are usinng");
		this.setDescPermission("set the character you are using");
		this.addParameter(TypeInteger.get(), "char number (1,2,3)", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		int usedChar = this.readArg();
		String nick = "";
		Player rawPlayer = (Player) sender;
		/*
		World world = rawPlayer.getLocation().getWorld();
		double x = rawPlayer.getLocation().getX();
		double y = rawPlayer.getLocation().getY();
		double z = rawPlayer.getLocation().getZ();
		float yaw = rawPlayer.getLocation().getYaw();
		float pitch = rawPlayer.getLocation().getPitch();
		
		World w = null;
		double xPos = 1.0;
		double yPos = 1.0;
		double zPos = 1.0;
		float yawPos = 0;
		float pitchPos = 0;
		*/
		if (usedChar != 1 && usedChar != 2 && usedChar != 3) { msg("<red>Error: <rose>You must use either 1, 2, or 3<rose>."); return; }
		
		player.setCharUsing(usedChar);
		
		/*
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
		
		if (usedChar == 1) {
			w = player.getCharWorld();
				if (w == null) w = world;
			xPos = player.getCharX();
			yPos = player.getCharY();
			zPos = player.getCharZ();
			yawPos = player.getCharYaw();
			pitchPos = player.getCharPitch();
		}
		
		if (usedChar == 2) {
			w = player.getChar2World();
				if (w == null) w = world;
			xPos = player.getChar2X();
			yPos = player.getChar2Y();
			zPos = player.getChar2Z();
			yawPos = player.getChar2Yaw();
			pitchPos = player.getChar2Pitch();
		}
		
		if (usedChar == 3) {
			w = player.getChar3World();
				if (w == null) w = world;
			xPos = player.getChar3X();
			yPos = player.getChar3Y();
			zPos = player.getChar3Z();
			yawPos = player.getChar3Yaw();
			pitchPos = player.getChar3Pitch();
		}
		
		rawPlayer.teleport(new Location(w, xPos, yPos, zPos, pitchPos, yawPos));
		*/
		
		if (MassiveRP.get().isMChanAllowed()) {
			net.graystone.java.channels.entity.MPlayer player1 = MassiveChannelsIntegration.getPlayer(player);
			nick = MassiveChannelsIntegration.getNick(player1);
			if (usedChar == 1) nick = player.getCharName();
			if (usedChar == 2) nick = player.getChar2Name();
			if (usedChar == 3) nick = player.getChar3Name();

			MassiveChannelsIntegration.setNick(nick, player1);
		}
		
		if (MConf.isDisplayNamesEnabled()) {
			if (usedChar == 1) nick = player.getCharName();
			if (usedChar == 2) nick = player.getChar2Name();
			if (usedChar == 3) nick = player.getChar3Name();
			
			rawPlayer.setDisplayName(nick);
		}
		
		msg("<i>You are now <pink>using <i>character <pink>"+usedChar+"<i>.");
	}
	
}
