package lesson2;

public class Offence implements Strategy {

	@Override
	public void play(String Team) {
		
		System.out.println(Team + " is playing offensive.");
		
	}

}
