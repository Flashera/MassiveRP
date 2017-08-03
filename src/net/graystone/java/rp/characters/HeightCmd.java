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

public class HeightCmd extends RPCommand
{
	
	public HeightCmd()
	{
		this.addAliases("height");
		this.setDesc("set character's height");
		this.setDesc("set your character's height");
		this.addParameter(TypeString.get(), "height", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		String height = this.readArg();
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) player.setCharHeight(height);
		if (charUsing == 2) player.setChar2Height(height);
		if (charUsing == 3) player.setChar3Height(height);
		
		msg("<i>Your character's height has been <pink>updated <i>to: <pink>"+height+"<i>.");
	}
	
}
