package me.pogogui.spawnminigames;

import java.util.ArrayList;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class GuiListener implements Listener{
	
	private Main main;
	
	public GuiListener(Main main) {
		this.main = main;
	}
	
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player player = (Player) e.getWhoClicked();
		
		InventoryView view = e.getView();
		
		if(view.getTitle().equals("Toys menu")) {
			if(e.getCurrentItem() != null) {
				e.setCancelled(true);
				
				switch (e.getCurrentItem().getType()) {
				case DIAMOND_CHESTPLATE:
					player.getInventory().setHelmet(new ItemStack (Material.DIAMOND_HELMET));
					player.getInventory().setChestplate(new ItemStack (Material.DIAMOND_CHESTPLATE));
					player.getInventory().setLeggings(new ItemStack (Material.DIAMOND_LEGGINGS));
					player.getInventory().setBoots(new ItemStack (Material.DIAMOND_BOOTS));
					player.closeInventory();
					break;
				case IRON_CHESTPLATE:
					player.getInventory().setHelmet(new ItemStack (Material.IRON_HELMET));
					player.getInventory().setChestplate(new ItemStack (Material.IRON_CHESTPLATE));
					player.getInventory().setLeggings(new ItemStack (Material.IRON_LEGGINGS));
					player.getInventory().setBoots(new ItemStack (Material.IRON_BOOTS));
					player.closeInventory();
					break;
				case GOLDEN_CHESTPLATE:
					player.getInventory().setHelmet(new ItemStack (Material.GOLDEN_HELMET));
					player.getInventory().setChestplate(new ItemStack (Material.GOLDEN_CHESTPLATE));
					player.getInventory().setLeggings(new ItemStack (Material.GOLDEN_LEGGINGS));
					player.getInventory().setBoots(new ItemStack (Material.GOLDEN_BOOTS));
					player.closeInventory();
					break;
				case LEATHER_CHESTPLATE:
					player.sendMessage(ChatColor.RED + "Work in progress");
					ItemStack discohelmet = new ItemStack(Material.LEATHER_HELMET, 1);
					ItemMeta dhm = discohelmet.getItemMeta();
					dhm.setDisplayName("Disco Helmet");
					Color dhc = Color.fromRGB(255, 85, 85);
					player.closeInventory();
					break;
				case POTION:
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 400, 1));
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 400, 1));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 400, 1));
					player.closeInventory();
					break;
				case WATER_BUCKET:
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 400, 1));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 400, 1));
					player.closeInventory();
					break;
				case MINECART:
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 99));
					player.closeInventory();
					break;
				case LEVER:
					player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 400, 1));
					player.closeInventory();
					break;
				case BOW:
					ItemStack bow = new ItemStack(Material.BOW, 1);
					ItemMeta bm = bow.getItemMeta();
					ArrayList<String> bl = new ArrayList<String>();
					bm.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
					bl.add("It's a bow ! Wow !");
					bm.setLore(bl);
					bm.setDisplayName("Bow");
					bow.setItemMeta(bm);
					player.getInventory().addItem(bow);
					player.closeInventory();
					break;
				case EGG:
					ItemStack eggs = new ItemStack(Material.EGG, 16);
					ItemMeta em = eggs.getItemMeta();
					ArrayList<String> el = new ArrayList<String>();
					el.add("Eggs to throw to other players");
					em.setLore(el);
					em.setDisplayName("Eggs");
					eggs.setItemMeta(em);
					player.getInventory().addItem(eggs);
					player.closeInventory();
					break;
				case SNOWBALL:
					ItemStack snowballs = new ItemStack(Material.SNOWBALL, 16);
					ItemMeta sbm = snowballs.getItemMeta();
					ArrayList<String> sbl = new ArrayList<String>();
					sbl.add("Snowballs to throw to other players");
					sbm.setLore(sbl);
					sbm.setDisplayName("Snowballs");
					snowballs.setItemMeta(sbm);
					player.getInventory().addItem(snowballs);
					player.closeInventory();
					break;
				case BREAD:
					ItemStack baguette = new ItemStack(Material.BREAD, 1);
					ItemMeta bam = baguette.getItemMeta();
					ArrayList<String> bal = new ArrayList<String>();
					bal.add("Cuz i'm french ; )");
					bam.setLore(bal);
					bam.setDisplayName("Baguette");
					baguette.setItemMeta(bam);
					player.getInventory().addItem(baguette);
					player.chat("Look i'm french cuz i have a baguette");
					player.closeInventory();
					break;
				case CARROT_ON_A_STICK:
					String[] dumbjokes = {"A T-Rex in a one man show says : What is a dinosaur's least favorite reindeer ? COMET !",
							"What creature is smarter than a talking parrot? A spelling bee.", 
							"How does the ocean say hello? It waves.", 
							"What did one plate whisper to the other plate ? Dinner is on me",
							"Why aren’t dogs good dancers? They have two left feet.",
							"Why is a baseball stadium always cold? Because it’s full of fans!"};  
					java.util.Random random = new java.util.Random();
					int randomdumbjoke = random.nextInt(dumbjokes.length);
					player.chat(dumbjokes[randomdumbjoke]);
					player.closeInventory();
					break;
				case OAK_SIGN:
					String[] obvious = {"Did you know that you are playing minecraft ?",
							"Did you know that you are in a lobby or in a spawn ?",
							"Did you know that minecraft is a game ?"};
					java.util.Random randoma = new java.util.Random();
					int randomobvious = randoma.nextInt(obvious.length);
					player.chat(obvious[randomobvious]);
					player.closeInventory();
					break;
				case RED_BED:
					String[] funfacts = {"In Switzerland it is illegal to own just one guinea pig.",
					"29th May is officially “Put a Pillow on Your Fridge Day”.",
					"The Pokémon Hitmonlee and Hitmonchan are based off of Bruce Lee and Jackie Chan."};
					java.util.Random randomb = new java.util.Random();
					int randomfunfacts = randomb.nextInt(funfacts.length);
					player.chat(funfacts[randomfunfacts]);
					player.closeInventory();
				case RED_STAINED_GLASS_PANE:
					player.closeInventory();
				break;
			default:
				return;
			}
		}
		}
		
	}
}

