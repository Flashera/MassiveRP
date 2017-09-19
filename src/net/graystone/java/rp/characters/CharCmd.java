package net.graystone.java.rp.characters;

import java.util.List;

import com.massivecraft.massivecore.command.MassiveCommandHelp;
import com.massivecraft.massivecore.util.MUtil;

import net.graystone.java.rp.command.RPCommand;

public class CharCmd extends RPCommand
{
	
	private static CharCmd i = new CharCmd();
	public static CharCmd get() { return CharCmd.i; }
	
	public CharCmd()
	{
		this.addChild(new MassiveCommandHelp());
		this.addChild(new RaceCmd());
		this.addChild(new NameCmd());
		this.addChild(new AgeCmd());
		this.addChild(new DescCmd());
		this.addChild(new HeightCmd());
		this.addChild(new WeightCmd());
		this.addChild(new CmdShow());
		this.addChild(new UseCmd());
		//this.addChild(new MassiveCommandVersion(MassiveRP.get())); TODO add set command
	}
	
	@Override
	public List<String> getAliases()
	{
		return MUtil.list("char", "characters", "charactercard", "card", "cc");
	}
	
}
