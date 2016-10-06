package java8_Interfaces;

public class Default_Static implements Actors{
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actors obj = new Default_Static();
		Default_Static ds= new Default_Static();
		
		
		ds.act();
		obj.dialog();

	}

	@Override
	public void act() {
		{
			
			System.out.println("Hero Learns to act from an Actor");
			
			Actors.fight();
			
		}
		

		
	}

}
