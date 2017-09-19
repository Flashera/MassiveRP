package net.graystone.java.rp.engine;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import com.massivecraft.massivecore.Engine;
import com.massivecraft.massivecore.chestgui.ChestActionCommand;
import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.util.Txt;

import net.graystone.java.rp.entity.MPlayer;

public class ChestGUIEngine extends Engine{
	
	private static ChestGUIEngine i = new ChestGUIEngine();
	public static ChestGUIEngine get() { return ChestGUIEngine.i; }
	
	public static void openCharGUI(Player player, MPlayer user) {
	    ChestGui gui = new ChestGui();
	    Inventory inventory = Bukkit.createInventory(null, 9, Txt.parse("&eCharacter Menu"));
	    gui.setInventory(inventory);
	    gui.setBottomInventoryAllow(false);
	    gui.setSoundOpen(null);
	    gui.setSoundClose(null);
	    ChestActionCommand cmd = new ChestActionCommand();
	    ChestActionCommand cmd2 = new ChestActionCommand();
	    ChestActionCommand cmd3 = new ChestActionCommand();
	    cmd.setCommand("/char use 1");
	    gui.setAction(6, cmd);
	    
	    cmd2.setCommand("/char use 2");
	    gui.setAction(7, cmd2);
	    
	    cmd3.setCommand("/char use 3");
	    gui.setAction(8, cmd3);
	    
	    ItemStack item1 = new ItemStack(Material.BOOK, 1);
	    
		ItemMeta data1 = item1.getItemMeta();
		List<String> lore1 = new ArrayList<String>();
		lore1.add(Txt.parse("&eTo switch characters, simply click"));
		lore1.add(Txt.parse("&eyour choice and it will set your"));
		lore1.add(Txt.parse("&echaracter for you!"));
		data1.setDisplayName(Txt.parse("&6Info"));
		data1.setLore(lore1);
		data1.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item1.setItemMeta(data1);
		
	    inventory.setItem(0, item1);
		
	    ItemStack item2 = new ItemStack(Material.GOLD_NUGGET, 1);
	    
		ItemMeta data2 = item2.getItemMeta();
		List<String> lore2 = new ArrayList<String>();
		lore2.add(Txt.parse("&eClick to become " + user.getCharName() + "!"));
		data2.setDisplayName(Txt.parse("&6"+user.getCharName()));
		data2.setLore(lore2);
		data2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item2.setItemMeta(data2);
	    
	    inventory.setItem(6, item2);
		
	    ItemStack item3 = new ItemStack(Material.GOLD_NUGGET, 1);
	    
		ItemMeta data3 = item3.getItemMeta();
		List<String> lore3 = new ArrayList<String>();
		lore3.add(Txt.parse("&eClick to become " + user.getChar2Name() + "!"));
		data3.setDisplayName(Txt.parse("&6"+user.getChar2Name()));
		data3.setLore(lore3);
		data3.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item3.setItemMeta(data3);
	    
	    inventory.setItem(7, item3);
	    
	    ItemStack item4 = new ItemStack(Material.GOLD_NUGGET, 1);
	    
		ItemMeta data4 = item4.getItemMeta();
		List<String> lore4 = new ArrayList<String>();
		lore4.add(Txt.parse("&eClick to become " + user.getChar3Name() + "!"));
		data4.setDisplayName(Txt.parse("&6"+user.getChar3Name()));
		data4.setLore(lore4);
		data4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item4.setItemMeta(data4);
	    
	    inventory.setItem(8, item4);
	    
	    gui.add();
	    player.openInventory(inventory);
	}
	
	public static void openCraftingGUI(Player player, MPlayer user) {
	    ChestGui gui = new ChestGui();
	    Inventory inventory = Bukkit.createInventory(null, 9, Txt.parse("&eCharacter Menu"));
	    gui.setInventory(inventory);
	    gui.setBottomInventoryAllow(false);
	    gui.setSoundOpen(null);
	    gui.setSoundClose(null);
	    gui.add();
		
	    ItemStack item1 = new ItemStack(Material.DIAMOND, 8);
	    
		ItemMeta data1 = item1.getItemMeta();
		data1.setDisplayName(Txt.parse("&cNext Page"));
		data1.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item1.setItemMeta(data1);
	    
	    inventory.setItem(0, item1);
		
	    player.openInventory(inventory);
	}

	
}
