package adventureGame;

public class Potions {

	public Potions(){
	
		
		
		
	
	}
	
	public int smallHealthPotion(Player player){
		
		if (player.health >= player.maxHealth() - 20){
			
			return player.health = player.maxHealth();
		}
		else	
			return player.health + 20;
			
	}
	
	public int largeHealthPotion(Player player){
			
		if (player.health >= player.maxHealth() - 50){
			
			return player.health = player.maxHealth();
		}
		else
			return player.health + 50;	
		
	}
	
	public int ultimateHealthPotion(Player player){
		
		return player.health = player.maxHealth(); 
		
	}
	
	public int smallMagickaPotion(Player player){
		
		if (player.magicka >= player.maxHealth()-20){
			
			return player.magicka = player.maxMagicka();
		}
		else 
		   return player.magicka + 20; 
		
	}
	
	public int largeMagickaPotion(Player player){
		
		if (player.magicka >= player.maxHealth()-50){
			
			return player.magicka = player.maxMagicka();
		}
		else 
		   return player.magicka + 50; 
		
	}
	
public int ultimateMagickaPotion(Player player){
				
		   return player.magicka = player.maxMagicka(); 
		
	}

}
