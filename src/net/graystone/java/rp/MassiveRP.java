package net.graystone.java.rp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import com.massivecraft.massivecore.MassivePlugin;

import net.graystone.java.rp.entity.MPlayerColl;
import net.graystone.java.rp.entity.MPlayer;
import net.graystone.java.rp.characters.CharCmd;
import net.graystone.java.rp.command.CmdGraylist;
import net.graystone.java.rp.command.CmdRoll;
import net.graystone.java.rp.engine.CardInteractEngine;
import net.graystone.java.rp.entity.MConf;
import net.graystone.java.rp.entity.MConfColl;

public class MassiveRP extends MassivePlugin{

	private static MassiveRP i;
	public MassiveRP() { MassiveRP.i = this; }
	public static MassiveRP get() { return MassiveRP.i; }
	
	private boolean allowNick = false;
	private boolean allowPEX = false;
	
	@Override
	public void onEnableInner()
	{
		if (Bukkit.getPluginManager().getPlugin("MassiveChannels") != null && Bukkit.getPluginManager().getPlugin("MassiveChannels").isEnabled())
		{
			this.allowNick = true;
		}
		
		if (Bukkit.getPluginManager().getPlugin("PermissionsEx") != null && Bukkit.getPluginManager().getPlugin("MassiveChannels").isEnabled())
		{
			this.allowPEX = true;
		}
		
		this.activate(MConfColl.get(), MPlayerColl.get());
		
		//this.activate(CmdTest.get());
		if (MConf.isRollEnabled()) this.activate(CmdRoll.get());
		if (MConf.isCharactersEnabled()) this.activate(CharCmd.get(),CardInteractEngine.get());
		if (MConf.isGrayListEnabled()&&isPEXAllowed()==true) this.activate(CmdGraylist.get());
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player rawPlayer = event.getPlayer();
		MPlayer player = MPlayer.get(rawPlayer);
		String nick = "";
		int usedChar = player.getCharUsing();
		
		if (MConf.isDisplayNamesEnabled()) {
			if (usedChar == 1) nick = player.getCharName();
			if (usedChar == 2) nick = player.getChar2Name();
			if (usedChar == 3) nick = player.getChar3Name();
			
			rawPlayer.setDisplayName(nick);
		}
	}
	
	public boolean isMChanAllowed() {
		return this.allowNick;
	}
	
	public boolean isPEXAllowed() {
		return this.allowPEX;
	}
	
}
