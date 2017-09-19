package net.graystone.java.rp.integration;

import net.graystone.java.channels.entity.MPlayer;

public class MassiveChannelsIntegration {

	private static MassiveChannelsIntegration i = new MassiveChannelsIntegration();
	public static MassiveChannelsIntegration get() { return MassiveChannelsIntegration.i; }

	public static String getNick(MPlayer player) {
		String nick = MPlayer.get(player).getNick();
		return nick;
	}
	
	public static void setNick(String nick, MPlayer player) {
		MPlayer.get(player).setNick(nick);
	}
	
	public static MPlayer getPlayer(net.graystone.java.rp.entity.MPlayer player){		
		net.graystone.java.channels.entity.MPlayer player1 = net.graystone.java.channels.entity.MPlayer.get(player);
		return player1;
	}
	
}
