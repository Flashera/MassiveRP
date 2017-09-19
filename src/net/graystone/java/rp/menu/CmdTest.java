package net.graystone.java.rp.menu;

import java.util.List;
import org.bukkit.entity.Player;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.util.MUtil;
import net.graystone.java.rp.Perm;
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.engine.ChestGUIEngine;

public class CmdTest extends RPCommand
{
	
	private static CmdTest i = new CmdTest();
	public static CmdTest get() { return CmdTest.i; }
	
	public CmdTest()
	{
		this.setDescPermission("tests");
		
		this.addRequirements(RequirementHasPerm.get(Perm.TEST.getNode()));
	}
	
	@Override
	public void perform() throws MassiveException
	{
		ChestGUIEngine.openCharGUI((Player) sender, player);
	}
	
	@Override
	public List<String> getAliases()
	{
		return MUtil.list("test");
	}
	
}
