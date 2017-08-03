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

import net.graystone.java.rp.Perm;
import net.graystone.java.rp.entity.MPlayer;

public class CmdRoll extends RPCommand
{
	
	private static CmdRoll i = new CmdRoll();
	public static CmdRoll get() { return CmdRoll.i; }
	
	public CmdRoll()
	{
		this.setDescPermission("makes a roll of a dice");
		
		this.addRequirements(RequirementHasPerm.get(Perm.CAN_ROLL.getNode()));
		
		this.addParameter(TypeInteger.get(), "dice");
		this.addParameter(TypeInteger.get(), "optional modifier", "0");
	}
	
	@Override
	public void perform() throws MassiveException
	{
		int baseDice = this.readArg();
		
		int optionalMod = this.readArg(0);
		
	    Random rand = new Random();
	    int fullVal = 0;
		if (!(baseDice == 0)) fullVal = rand.nextInt(baseDice) + 1;
		fullVal += optionalMod;
		String diceString = String.valueOf(baseDice);
		if (optionalMod > 0) diceString = diceString + " + " + String.valueOf(optionalMod);
		if (optionalMod < 0) diceString = diceString + " - " + String.valueOf(Math.abs(optionalMod));
		
        if(sender instanceof Player){
        	for(Player player : ((Player) sender).getWorld().getPlayers()) {
        		Entity esender = (Player) sender;
        		if(esender.getLocation().distance(player.getLocation())<30)
        		player.sendMessage(Txt.parse("<pink>" + sender.getName() + " <i>rolled a<pink> " + diceString + " <i>and got <pink>" + fullVal));
        	}
        }
	}
	
	@Override
	public List<String> getAliases()
	{
		return MUtil.list("roll");
	}
	
}
