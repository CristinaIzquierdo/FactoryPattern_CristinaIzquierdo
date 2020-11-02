package game;

public class Newtron implements Entity{
	
	int vida = 200;

	
	@Override
	public void updateLogic() {
		System.out.println("Tengo: " +vida + " de vida");		
	}

}
