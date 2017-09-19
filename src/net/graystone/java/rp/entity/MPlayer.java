package net.graystone.java.rp.entity;

import com.massivecraft.massivecore.store.SenderEntity;

import net.graystone.java.rp.entity.MPlayer;
import net.graystone.java.rp.entity.MPlayerColl;

public class MPlayer extends SenderEntity<MPlayer>{

	public static MPlayer get(Object oid) { return MPlayerColl.get().get(oid); }
	
	private static boolean isGrayListed = true;
	public MPlayer setGrayListed(boolean set) { isGrayListed = set; this.changed(); return this; }
	public boolean isGrayListed() { return isGrayListed; }
	
	/*
	World charWorld;
	public MPlayer setCharWorld(World set) { this.charWorld = set; this.changed(); return this; }
	public World getCharWorld() { return charWorld; }
	
	double charX = 1.0;
	public MPlayer setCharX(double set) { this.charX = set; this.changed(); return this; }
	public double getCharX() { return charX; }
	
	double charY = 1.0;
	public MPlayer setCharY(double set) { this.charY = set; this.changed(); return this; }
	public double getCharY() { return charY; }
	
	double charZ = 1.0;
	public MPlayer setCharZ(double set) { this.charZ = set; this.changed(); return this; }
	public double getCharZ() { return charZ; }
	
	float charYaw = 0;
	public MPlayer setCharYaw(float set) { this.charYaw = set; this.changed(); return this; }
	public float getCharYaw() { return charYaw; }
	
	float charPitch = 0;
	public MPlayer setCharPitch(float set) { this.charPitch = set; this.changed(); return this; }
	public float getCharPitch() { return charPitch; }
	
	World char2World;
	public MPlayer setChar2World(World set) { this.char2World = set; this.changed(); return this; }
	public World getChar2World() { return char2World; }
	
	double char2X = 1.0;
	public MPlayer setChar2X(double set) { this.char2X = set; this.changed(); return this; }
	public double getChar2X() { return char2X; }
	
	double char2Y = 1.0;
	public MPlayer setChar2Y(double set) { this.char2Y = set; this.changed(); return this; }
	public double getChar2Y() { return char2Y; }
	
	double char2Z = 1.0;
	public MPlayer setChar2Z(double set) { this.char2Z = set; this.changed(); return this; }
	public double getChar2Z() { return char2Z; }
	
	float char2Yaw = 0;
	public MPlayer setChar2Yaw(float set) { this.char2Yaw = set; this.changed(); return this; }
	public float getChar2Yaw() { return char2Yaw; }
	
	float char2Pitch = 0;
	public MPlayer setChar2Pitch(float set) { this.char2Pitch = set; this.changed(); return this; }
	public float getChar2Pitch() { return char2Pitch; }
	
	World char3World;
	public MPlayer setChar3World(World set) { this.char3World = set; this.changed(); return this; }
	public World getChar3World() { return char3World; }
	
	double char3X = 1.0;
	public MPlayer setChar3X(double set) { this.char3X = set; this.changed(); return this; }
	public double getChar3X() { return char3X; }
	
	double char3Y = 1.0;
	public MPlayer setChar3Y(double set) { this.charY = set; this.changed(); return this; }
	public double getChar3Y() { return char3Y; }
	
	double char3Z = 1.0;
	public MPlayer setChar3Z(double set) { this.char3Z = set; this.changed(); return this; }
	public double getChar3Z() { return char3Z; }
	
	float char3Yaw = 0;
	public MPlayer setChar3Yaw(float set) { this.char3Yaw = set; this.changed(); return this; }
	public float getChar3Yaw() { return char3Yaw; }
	
	float char3Pitch = 0;
	public MPlayer setChar3Pitch(float set) { this.char3Pitch = set; this.changed(); return this; }
	public float getChar3Pitch() { return char3Pitch; }
	*/
	private int charUsing = 1;
	public MPlayer setCharUsing(int set) { this.charUsing = set; this.changed(); return this; }
	public int getCharUsing() { return charUsing; }
	
	private String charName = "";
	public MPlayer setCharName(String set) { this.charName = set; this.changed(); return this; }
	public String getCharName() { return charName; }

	private int charAge = 0;
	public MPlayer setCharAge(int set) { this.charAge = set; this.changed(); return this; }
	public int getCharAge() { return charAge; }
	
	private String charRace = "";
	public MPlayer setCharRace(String race) { this.charRace = race; this.changed(); return this; }
	public String getCharRace() { return charRace; }
	
	private String charWeight = "";
	public MPlayer setCharWeight(String weight) { this.charWeight = weight; this.changed(); return this; }
	public String getCharWeight() { return charWeight; }
	
	private String charHeight = "";
	public MPlayer setCharHeight(String set) { this.charHeight = set; this.changed(); return this; }
	public String getCharHeight() { return charHeight; }
	
	private String charDesc = "";
	public MPlayer setCharDesc(String set) { this.charDesc = set; this.changed(); return this; }
	public String getCharDesc() { return charDesc; }
	
	private String char2Name = "";
	public MPlayer setChar2Name(String set) { this.char2Name = set; this.changed(); return this; }
	public String getChar2Name() { return char2Name; }

	private int char2Age = 0;
	public MPlayer setChar2Age(int set) { this.char2Age = set; this.changed(); return this; }
	public int getChar2Age() { return char2Age; }
	
	private String char2Race = "";
	public MPlayer setChar2Race(String race) { this.char2Race = race; this.changed(); return this; }
	public String getChar2Race() { return char2Race; }
	
	private String char2Weight = "";
	public MPlayer setChar2Weight(String weight) { this.char2Weight = weight; this.changed(); return this; }
	public String getChar2Weight() { return char2Weight; }
	
	private String char2Height = "";
	public MPlayer setChar2Height(String set) { this.char2Height = set; this.changed(); return this; }
	public String getChar2Height() { return char2Height; }
	
	private String char2Desc = "";
	public MPlayer setChar2Desc(String set) { this.char2Desc = set; this.changed(); return this; }
	public String getChar2Desc() { return char2Desc; }
	
	private String char3Name = "";
	public MPlayer setChar3Name(String set) { this.char3Name = set; this.changed(); return this; }
	public String getChar3Name() { return char3Name; }

	private int char3Age = 0;
	public MPlayer setChar3Age(int set) { this.char3Age = set; this.changed(); return this; }
	public int getChar3Age() { return char3Age; }
	
	private String char3Race = "";
	public MPlayer setChar3Race(String race) { this.char3Race = race; this.changed(); return this; }
	public String getChar3Race() { return char3Race; }
	
	private String char3Weight = "";
	public MPlayer setChar3Weight(String weight) { this.char3Weight = weight; this.changed(); return this; }
	public String getChar3Weight() { return char3Weight; }
	
	private String char3Height = "";
	public MPlayer setChar3Height(String set) { this.char3Height = set; this.changed(); return this; }
	public String getChar3Height() { return char3Height; }
	
	private String char3Desc = "";
	public MPlayer setChar3Desc(String set) { this.char3Desc = set; this.changed(); return this; }
	public String getChar3Desc() { return char3Desc; }
	
}
