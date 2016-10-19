package car_factory;

public class Factory_Interface {

	public static Factories getcar(String type)
	{
		if(type.equalsIgnoreCase("honda"))
		{
		return new Honda();
		}
		else if(type.equalsIgnoreCase("hyundai"))
		{
		return new Hyundai();
		}
		else
		{
			return null;
		}
		
	}
}
