package car_factory;

public class Hyundai implements Factories{

public Car createcar(String type) {
		
		if(type.equalsIgnoreCase("sonata"))
		{
		return new Sonata();
		}
		else if(type.equalsIgnoreCase("elantra"))
		{
		return new Elantra();
		}
		else
		{
			return null;
		}
	}
}
