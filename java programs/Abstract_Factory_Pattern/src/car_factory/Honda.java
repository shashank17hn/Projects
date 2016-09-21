package car_factory;

public class Honda implements Factories{

	@Override
	public Car createcar(String type) {
		
		if(type.equalsIgnoreCase("civic"))
		{
		return new Civic();
		}
		else if(type.equalsIgnoreCase("accord"))
		{
		return new Accord();
		}
		else
		{
			return null;
		}
	}
	

	
}
