package adventureGame;

public class Player {
	public int level = 1;
	public int health = 50;
	public int magicka = 50;
	
	
	public int maxHealth(){
	
		return 50 + level*10;
		
	}
	
	public int maxMagicka(){
		
		return 50 + level*10;
		
	}
	
}
