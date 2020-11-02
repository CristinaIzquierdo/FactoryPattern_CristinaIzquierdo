package game;

public class Chopper implements Entity{
	
	int vida = 100;

	
	@Override
	public void updateLogic() {
		System.out.println("Tengo: " +vida + " de vida");
	}


		
	

}
