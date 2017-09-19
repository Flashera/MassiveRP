package net.graystone.java.rp.characters;

import org.bukkit.entity.Player;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.sender.TypePlayer;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.engine.CardInteractEngine;
import net.graystone.java.rp.entity.MPlayer;

public class CmdShow extends RPCommand
{
	
	public CmdShow()
	{
		this.addAliases("show");
		this.setDesc("show character card");
		this.setDescPermission("show character card");
		this.addParameter(TypePlayer.get(), "username", "you", true);
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		Player userRaw = (Player) this.readArg(sender);
		MPlayer userName = MPlayer.get(userRaw);
		MPlayer senderName = MPlayer.get(sender);
		
		CardInteractEngine.showCard(userName, senderName);
	}
	
}
