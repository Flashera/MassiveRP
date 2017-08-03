package net.graystone.java.rp.entity;

import com.massivecraft.massivecore.store.MStore;
import com.massivecraft.massivecore.store.SenderColl;

import net.graystone.java.rp.MassiveRP;

public class MPlayerColl extends SenderColl<MPlayer>
{
	
	private static MPlayerColl i = new MPlayerColl();
	public static MPlayerColl get() { return MPlayerColl.i; }
	
	public MPlayerColl()
	{
		super("massiverp_mplayers", MPlayer.class, MStore.getDb(), MassiveRP.get());
	}
	
}
