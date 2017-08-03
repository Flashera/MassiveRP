package net.graystone.java.rp;

public enum Perm
{
	CAN_ROLL("roll"), 
	CHAR_USE("char.use"),
	
	TEST("test"),
	GRAYLIST("graylist");
	
	private String node;
	
	Perm(String node)
	{
		this.node = "massiverp."+node;
	}
	
	public String getNode() { return this.node; }
	
}
