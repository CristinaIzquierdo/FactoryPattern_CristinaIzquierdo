package game;

public class FactoryPatternExample {
	
	 public static void main(String[] args) {
		 FactoryPatternExample example = new FactoryPatternExample();
		 example.createEnemy();
		 
	 }
	 
	 public void createEnemy() {
		 Entity entity = RandomEnemyFactory.createEnemy();
		 entity.updateLogic();
	 }
	 

}
