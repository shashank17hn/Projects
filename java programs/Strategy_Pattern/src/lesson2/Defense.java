package lesson2;

public class Defense implements Strategy{

	@Override
	public void play(String Team) {
		
		System.out.println(Team + " is playing defensive");
		
	}


}
