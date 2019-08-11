package me.pogogui.spawnminigames;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Gui implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			System.out.println("You cannot execute this command in the console");
			return true;
		}
		
		Player player = (Player) sender;
				
		Inventory gui = Bukkit.createInventory(null, 54, "Toys menu");
		
		
		//Full diamond armor
		
		ItemStack fullDiamond = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta dcm = fullDiamond.getItemMeta();
		dcm.setDisplayName("Diamond Armor");
		ArrayList<String> fdl = new ArrayList<String>();
		fdl.add("With that armor you're ready to pvp! ");
		dcm.setLore(fdl);
		fullDiamond.setItemMeta(dcm);
		
		gui.setItem(0, fullDiamond);
		
		//Full iron armor
		
		ItemStack fullIron = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta icm = fullIron.getItemMeta();
		icm.setDisplayName("Iron Armor");
		ArrayList<String> fil = new ArrayList<String>();
		fil.add("With that old medieval armor,");
		fil.add("You're ready to a good old sword fight !");
		icm.setLore(fil);
		fullIron.setItemMeta(icm);
		
		gui.setItem(1, fullIron);
		
		//Full golden armor
		
		ItemStack fullGolden = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemMeta gcm = fullGolden.getItemMeta();
		gcm.setDisplayName("Golden Armor");
		ArrayList<String> fgl = new ArrayList<String>();
		fgl.add("With that armor, everyone think you're rich !");
		gcm.setLore(fgl);
		fullGolden.setItemMeta(gcm);
		
		gui.setItem(2, fullGolden);
		
		//Disco armor
		
		ItemStack discoarmor = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta lcm = discoarmor.getItemMeta();
		lcm.setDisplayName("Disco Armor");
		ArrayList<String> dal = new ArrayList<String>();
		dal.add("With that armor, you're ready to dance !");
		dal.add("Work in progress !");
		lcm.setLore(dal);
		discoarmor.setItemMeta(lcm);
		
		gui.setItem(3, discoarmor);
		
		//moon potion
		
		ItemStack moonpotion = new ItemStack(Material.POTION);
		ItemMeta pm = moonpotion.getItemMeta();
		pm.setDisplayName("Moon Potion");
		ArrayList<String> pl = new ArrayList<String>();
		pl.add("Move like in the moon for 20s !");
		pm.setLore(pl);
		moonpotion.setItemMeta(pm);
		
		gui.setItem(4, moonpotion);
		
		//Vodka
		
		ItemStack vodka = new ItemStack(Material.WATER_BUCKET);
		ItemMeta wbm = vodka.getItemMeta();
		wbm.setDisplayName("Vodka");
		ArrayList<String> wbl = new ArrayList<String>();
		wbl.add("Alcohol is water");
		wbm.setLore(wbl);
		vodka.setItemMeta(wbm);
		
		gui.setItem(5, vodka);
		
		//HYPERSPEED!!!!!
		
		ItemStack hyperspeed = new ItemStack(Material.MINECART);
		ItemMeta mm = hyperspeed.getItemMeta();
		mm.setDisplayName("HYPERSPEED!!!!!!!!");
		ArrayList<String> ml = new ArrayList<String>();
		ml.add("HYPERSPEED!!!!!!!!!!!!!!!!!!!!!!!!!!");
		mm.setLore(ml);
		hyperspeed.setItemMeta(mm);
		
		gui.setItem(6, hyperspeed);
		
		//GravitySwitch
		
		ItemStack gravityswitch = new ItemStack(Material.LEVER);
		ItemMeta lm = gravityswitch.getItemMeta();
		lm.setDisplayName("Gravity Switch");
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("Switch the gravity for 20s !");
		lm.setLore(ll);
		gravityswitch.setItemMeta(lm);
		
		gui.setItem(7, gravityswitch);
		
		//bow
		
		ItemStack bow = new ItemStack(Material.BOW);
		ItemMeta bm = bow.getItemMeta();
		bm.setDisplayName("Bow");
		ArrayList<String> bl = new ArrayList<String>();
		bl.add("It's a bow ! Wow !");
		bm.setLore(bl);
		bow.setItemMeta(bm);
		
		gui.setItem(8, bow);
		
		//eggs
		
		ItemStack egg = new ItemStack(Material.EGG);
		ItemMeta em = egg.getItemMeta();
		em.setDisplayName("Eggs");
		ArrayList<String> el = new ArrayList<String>();
		el.add("Egg to throw to others players");
		em.setLore(el);
		egg.setItemMeta(em);
		
		gui.setItem(9, egg);
		
		//snowballs
		
		ItemStack snowball = new ItemStack(Material.SNOWBALL);
		ItemMeta sbm = snowball.getItemMeta();
		sbm.setDisplayName("Snowballs");
		ArrayList<String> sbl = new ArrayList<String>();
		sbl.add("Snowballs to throw to others players");
		sbm.setLore(sbl);
		snowball.setItemMeta(sbm);
		
		gui.setItem(10, snowball);
		
		//baguette
		
		ItemStack baguette = new ItemStack(Material.BREAD);
		ItemMeta bam = baguette.getItemMeta();
		bam.setDisplayName("Baguette");
		ArrayList<String> bal = new ArrayList<String>();
		bal.add("Cuz i'm french ; )");
		bam.setLore(bal);
		baguette.setItemMeta(bam);
		
		gui.setItem(11, baguette);
		
		//Dumb Jokes
		
		ItemStack carrot = new ItemStack(Material.CARROT_ON_A_STICK);
		ItemMeta csm = baguette.getItemMeta();
		csm.setDisplayName("Dumb Jokes");
		ArrayList<String> csl = new ArrayList<String>();
		csl.add("Tell a dumb joke");
		csm.setLore(csl);
		carrot.setItemMeta(csm);
		
		gui.setItem(12, carrot);
		
		//Obvious
		
		ItemStack sign = new ItemStack(Material.SIGN);
		ItemMeta sm = sign.getItemMeta();
		sm.setDisplayName("Obvious");
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("Tell some obvious things");
		sm.setLore(sl);
		sign.setItemMeta(sm);
		
		gui.setItem(13, sign);
		
		//Fun Fact
		ItemStack bed = new ItemStack(Material.RED_BED);
		ItemMeta bem = bed.getItemMeta();
		bem.setDisplayName("Random Fun fact");
		ArrayList<String> bel = new ArrayList<String>();
		bel.add("Tell some random fun fact");
		bem.setLore(bel);
		bed.setItemMeta(bem);
				
		gui.setItem(14, bed);

		
		// Display gui
		
		player.openInventory(gui);
		
		return false;
	}

}
