package net.graystone.java.rp.menu;

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
import net.graystone.java.rp.command.RPCommand;
import net.graystone.java.rp.engine.ChestGUIEngine;
import net.graystone.java.rp.entity.MPlayer;

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
