package adventureGame;

public class Potions {

	public Potions(){
	
		
		
		
	
	}
	
	public void smallHealthPotion(Player player){
		
		if (player.health >= player.maxHealth() - 20){
			
			 player.setCurrentHealth(player.maxHealth());
			 System.out.print("You are at max Health");
		}
		else	
			player.setCurrentHealth(player.health + 20);
			System.out.print("You are at " + player.health + " Health");
			
	}
	
	public void largeHealthPotion(Player player){
			
		if (player.health >= player.maxHealth() - 50){
			
			player.setCurrentHealth(player.maxHealth());
			System.out.print("You are at max Health");
		}
		else
			player.setCurrentHealth(player.health + 50);	
			System.out.print("You are at " + player.health + " Health");
		
	}
	
	public void ultimateHealthPotion(Player player){
		
		player.setCurrentHealth(player.maxHealth()); 
		System.out.print("You are at max Health");
		
	}
	
	public void smallMagickaPotion(Player player){
		
		if (player.magicka >= player.maxHealth()-20){
			
			player.setCurrentMagicka(player.maxMagicka());
			System.out.print("You are at max Magicka");
		}
		else 
			player.setCurrentMagicka(player.magicka + 20); 
			System.out.print("You are at " + player.magicka + " Magicka");
		
	}
	
	public void largeMagickaPotion(Player player){
		
		if (player.magicka >= player.maxHealth()-50){
			
			player.setCurrentMagicka(player.maxMagicka());
			System.out.print("You are at max Magicka");
		}
		else 
			player.setCurrentMagicka(player.magicka + 50); 
			System.out.print("You are at " + player.magicka + " Magicka");
		
	}
	
	public void ultimateMagickaPotion(Player player){
				
		player.setCurrentMagicka(player.maxMagicka()); 
		System.out.print("You are at max Magicka");
		
	}

}
