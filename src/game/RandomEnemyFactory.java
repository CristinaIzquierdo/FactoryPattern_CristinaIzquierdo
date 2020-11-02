package game;

public class RandomEnemyFactory{
	
	//devuelve enemigos aleatoriamente
	public static Entity createEnemy() {	
		
		double randomNum = Math.random();
		if (randomNum > 0.66) {
			return new Chopper();				
		} 	else if (randomNum > 0.33) {
			return new Newtron();	
			}	else {
				return new Crabmeat();	
				}	
		
	}
	
}


