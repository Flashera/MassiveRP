package net.graystone.java.rp.characters;

import java.util.Arrays;
import java.util.List;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import com.massivecraft.massivecore.util.Txt;

import net.graystone.java.channels.MassiveChannels;
import net.graystone.java.channels.entity.MPlayer;
import net.graystone.java.channels.integration.PEXIntegration;
import net.graystone.java.rp.MassiveRP;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.entity.MConf;
import net.graystone.java.rp.entity.MConfColl;
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
			
		msg("<i>Your character's name has been <pink>updated <i>to: <pink>"+name+"<i>.");
	}
	
}
