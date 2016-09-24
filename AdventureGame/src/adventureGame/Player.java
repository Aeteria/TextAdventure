package adventureGame;

public class Player {
	public int level;
	public int health;
	public int maxHealth;
	public int magicka;
	public int strength;
	public int gold; 

	
		
public Player(){
	level = 1;
	health = 50;
	maxHealth = 50 + level*10;
	magicka = 50;
	strength = 10*level;
	gold = 0; 
}


	
	public void setCurrentHealth(int hp){
		
		health = hp;
		
	}
	
	public int maxMagicka(){
		
		return 50 + level*10;
		
	}
	
	public void setCurrentMagicka(int mp){
		
		magicka = mp;
		
	}
	
}
