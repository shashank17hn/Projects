
public class Main_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dogs = new Dog();
		Animal birds = new Bird();
		
		System.out.println("Dogs " + dogs.TryingToFly());
		System.out.println("Birds " + birds.TryingToFly());
		
		dogs.ability(new CanFly());
		
		System.out.println("Dogs " + dogs.TryingToFly());
		
	}

}
