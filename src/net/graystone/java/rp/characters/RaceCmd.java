package net.graystone.java.rp.characters;

import java.util.Arrays;
import java.util.List;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import com.massivecraft.massivecore.util.Txt;

import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.entity.MConf;
import net.graystone.java.rp.entity.MConfColl;

public class RaceCmd extends RPCommand
{	
	public RaceCmd()
	{
		this.addAliases("race");
		this.setDesc("set character's race");
		this.setDescPermission("set your character's race");
		this.addParameter(TypeString.get(), "race", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		String race = this.readArg();
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) player.setCharRace(race);
		if (charUsing == 2) player.setChar2Race(race);
		if (charUsing == 3) player.setChar3Race(race);
		
		msg("<i>Your character's race has been <pink>updated <i>to: <pink>"+race+"<i>.");
	}
	
}
