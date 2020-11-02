package game;

public class Crabmeat implements Entity{
	
	int vida = 150;


	@Override
	public void updateLogic() {
		System.out.println("Tengo: " +vida + " de vida");		
	}

	
}
