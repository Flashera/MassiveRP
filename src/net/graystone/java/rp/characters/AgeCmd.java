package net.graystone.java.rp.characters;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeInteger;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;

public class AgeCmd extends RPCommand
{
	
	public AgeCmd()
	{
		this.addAliases("age");
		this.setDesc("set character's age");
		this.setDescPermission("set your character's age");
		this.addParameter(TypeInteger.get(), "age", true);
		
		this.addRequirements(RequirementHasPerm.get(Perm.CHAR_USE.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		int age = this.readArg();
		
		int charUsing = player.getCharUsing();
		
		if (charUsing == 1) player.setCharAge(age);
		if (charUsing == 2) player.setChar2Age(age);
		if (charUsing == 3) player.setChar3Age(age);
		
		msg("<i>Your character's age has been <pink>updated <i>to: <pink>"+age+"<i>.");
	}
	
}
