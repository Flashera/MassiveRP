package net.graystone.java.rp.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.ps.PS;
import com.massivecraft.massivecore.store.Entity;

@EditorName("config")
public class MConf extends Entity<MConf>{	

	protected static transient MConf i;
	public static MConf get() { return i; }
		
	private static boolean rollEnabled = true;
	public MConf setRollEnabled(boolean set) { MConf.rollEnabled = set; this.changed(); return this; }
	public static boolean isRollEnabled() { return rollEnabled; }
	
	private static boolean statsEnabled = true;
	public MConf setStatsEnabled(boolean set) { MConf.statsEnabled = set; this.changed(); return this; }
	public static boolean isStatsEnabled() { return statsEnabled; }
	
	private static boolean charactersEnabled = true;
	public MConf setCharactersEnabled(boolean set) { MConf.charactersEnabled = set; this.changed(); return this; }
	public static boolean isCharactersEnabled() { return charactersEnabled; }
	
	private static boolean grayListEnabled = true;
	public MConf setGrayListEnabled(boolean set) { MConf.grayListEnabled = set; this.changed(); return this; }
	public static boolean isGrayListEnabled() { return grayListEnabled; }
	
	public static String listGroup = "Listed";
	public MConf setGrayListGroup(String set) { MConf.listGroup = set; this.changed(); return this; }
	public static String getGrayListGroup() { return listGroup; }
}
