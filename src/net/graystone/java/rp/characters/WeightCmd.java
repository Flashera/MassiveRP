package net.graystone.java.rp.characters;

import java.util.Arrays;
import java.util.List;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeInteger;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import com.massivecraft.massivecore.util.Txt;

import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.entity.MConf;
import net.graystone.java.rp.entity.MConfColl;

public class WeightCmd extends RPCommand
{
	
	public WeightCmd()
	{
		this.addAliases("weight");
		this.setDesc("set character's weight");
		this.setDesc("set your character's weight");
		this.addParameter(TypeString.get(), "weight", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		String weight = this.readArg();
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) player.setCharWeight(weight);
		if (charUsing == 2) player.setChar2Weight(weight);
		if (charUsing == 3) player.setChar3Weight(weight);
		
		msg("<i>Your character's weight has been <pink>updated <i>to: <pink>"+weight+"<i>.");
	}
	
}
