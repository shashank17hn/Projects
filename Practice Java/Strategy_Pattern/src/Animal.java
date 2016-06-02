
public class Animal {

	
	public Fly flying;
	
	
	public String TryingToFly()
	{
		return flying.Fly();
	}
	
	public void ability(Fly newfly)
	{
		flying = newfly;
	}
}
