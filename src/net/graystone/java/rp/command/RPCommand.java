package net.graystone.java.rp.command;

import org.bukkit.command.CommandSender;

import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.util.Txt;

import net.graystone.java.rp.entity.MPlayer;

public class RPCommand extends MassiveCommand
{
	
	protected MPlayer player;
	
	public boolean msg(String txt)
	{
		if (player==null) return false;
		
		player.message(Txt.parse(txt));
		
		return true;
	}
	
	@Override
	public void senderFieldsOuter(CommandSender sender)
	{
		super.senderFieldsOuter(sender);
		
		this.player = MPlayer.get(sender);
	}
	
}
