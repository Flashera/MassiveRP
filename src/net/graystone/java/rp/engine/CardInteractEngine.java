package net.graystone.java.rp.engine;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.MainHand;

import com.massivecraft.massivecore.Engine;

import net.graystone.java.rp.entity.MPlayer;

public class CardInteractEngine extends Engine {

	private static CardInteractEngine i = new CardInteractEngine();
	public static CardInteractEngine get() { return CardInteractEngine.i; }
	
	@EventHandler
	public void shiftClick (PlayerInteractEntityEvent event){
		Player eventplayer = event.getPlayer();
		MPlayer player = MPlayer.get(eventplayer);
		
		if (!eventplayer.isSneaking()) return;
		
		if (event.getHand() == EquipmentSlot.HAND) {
			if (event.getRightClicked() instanceof Player) showCard(MPlayer.get(event.getRightClicked()), player);
		}
		
	}

	public static void showCard(MPlayer userName, MPlayer sender) {
		
		int charUsing = userName.getCharUsing();

		String userCName = userName.getCharName();
		int userAge = userName.getCharAge();
		String userRace = userName.getCharRace();
		String userHeight = userName.getCharHeight();
		String userWeight = userName.getCharWeight();
		String userDesc = userName.getCharDesc();
		
		if (charUsing == 1) {
			userCName = userName.getCharName();
			userAge = userName.getCharAge();
			userRace = userName.getCharRace();
			userHeight = userName.getCharHeight();
			userWeight = userName.getCharWeight();
			userDesc = userName.getCharDesc();
		}
		
		if (charUsing == 2) {
			userCName = userName.getChar2Name();
			userAge = userName.getChar2Age();
			userRace = userName.getChar2Race();
			userHeight = userName.getChar2Height();
			userWeight = userName.getChar2Weight();
			userDesc = userName.getChar2Desc();
		}
		
		if (charUsing == 3) {
			userCName = userName.getChar3Name();
			userAge = userName.getChar3Age();
			userRace = userName.getChar3Race();
			userHeight = userName.getChar3Height();
			userWeight = userName.getChar3Weight();
			userDesc = userName.getChar3Desc();
		}
		
		sender.msg("&6_________.[&2 "+userName.getName()+"'s Character Card &6]._________");
		sender.msg("&dName: &b"+userCName);
		sender.msg("&dAge: &b"+userAge);
		sender.msg("&dRace: &b"+userRace);
		sender.msg("&dHeight: &b"+userHeight);
		sender.msg("&dWeight: &b"+userWeight);
		sender.msg("&dDescription: &b"+userDesc);		
	}
	
}
