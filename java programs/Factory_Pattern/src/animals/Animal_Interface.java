package animals;

public class Animal_Interface {
	
	public Animal create_object(String ani)
	{
		if(ani.equalsIgnoreCase("dog"))
		{
			return new Dog();
		}
		
		else if(ani.equalsIgnoreCase("cat"))
		{
			return new Cat();
		}
		
		else if(ani.equalsIgnoreCase("fox"))
		{
			return new Fox();
		}
		else
		{
			return null;
		}
	}
		
	}
	


