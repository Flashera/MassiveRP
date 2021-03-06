package net.graystone.java.rp.characters;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;

public class DescCmd extends RPCommand
{
	
	public DescCmd()
	{
		this.addAliases("description");
		this.setDesc("set character's description");
		this.setDescPermission("set your character's description");
		this.addParameter(TypeString.get(), "description", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		String desc = this.readArg();
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) player.setCharDesc(desc);
		if (charUsing == 2) player.setChar2Desc(desc);
		if (charUsing == 3) player.setChar3Desc(desc);
		
		msg("<i>Your character's description has been <pink>updated <i>to: <pink>"+desc+"<i>.");
	}
	
}
