package net.graystone.java.rp.characters;

import org.bukkit.entity.Player;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import net.graystone.java.rp.MassiveRP;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.entity.MConf;
import net.graystone.java.rp.integration.MassiveChannelsIntegration;

public class NameCmd extends RPCommand
{
	
	public NameCmd()
	{
		this.addAliases("name");
		this.setDesc("set character's name");
		this.setDescPermission("set your character's name");
		this.addParameter(TypeString.get(), "name", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		String name = this.readArg();
		String nick = "";
		Player rawPlayer = (Player) sender;
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) player.setCharName(name);
		if (charUsing == 2) player.setChar2Name(name);
		if (charUsing == 3) player.setChar3Name(name);
				
		if (MassiveRP.get().isMChanAllowed()) {
			net.graystone.java.channels.entity.MPlayer player1 = MassiveChannelsIntegration.getPlayer(player);
			//nick = MassiveChannelsIntegration.getNick(player1);
			if (charUsing == 1) nick = player.getCharName();
			if (charUsing == 2) nick = player.getChar2Name();
			if (charUsing == 3) nick = player.getChar3Name();
			
			MassiveChannelsIntegration.setNick(nick, player1);
		}
		
		if (MConf.isDisplayNamesEnabled()) rawPlayer.setDisplayName(name);
		
		msg("<i>Your character's name has been <pink>updated <i>to: <pink>"+name+"<i>.");
	}
	
}
