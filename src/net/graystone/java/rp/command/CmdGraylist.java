package net.graystone.java.rp.command;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.sender.TypePlayer;
import com.massivecraft.massivecore.command.type.primitive.TypeInteger;
import com.massivecraft.massivecore.util.MUtil;
import com.massivecraft.massivecore.util.Txt;

import net.graystone.java.channels.entity.MConf;
import net.graystone.java.rp.MassiveRP;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.entity.MPlayer;
import net.graystone.java.rp.integration.MassiveChannelsIntegration;
import net.graystone.java.rp.integration.PEXIntegration;
import ru.tehkode.permissions.PermissionUser;
import net.graystone.java.rp.entity.MConfColl;

public class CmdGraylist extends RPCommand
{
	
	private static CmdGraylist i = new CmdGraylist();
	public static CmdGraylist get() { return CmdGraylist.i; }
	
	public CmdGraylist()
	{
		this.setDescPermission("graylists a user");
		
		this.addRequirements(RequirementHasPerm.get(Perm.GRAYLIST.getNode()));
		
		this.addParameter(TypePlayer.get(), "player");
	}
	
	@Override
	public void perform() throws MassiveException
	{
		Player player1 = (Player) this.readArg();
		
		if (MassiveRP.get().isPEXAllowed()&&!player.isGrayListed()) {
			PermissionUser user = PEXIntegration.getUser(player1);
			user.addGroup(net.graystone.java.rp.entity.MConf.getGrayListGroup());
		}
	}
	
	@Override
	public List<String> getAliases()
	{
		return MUtil.list("graylist","greylist" , "gl");
	}
	
}
