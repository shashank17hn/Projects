
public interface Fly {
	
	String Fly();

}

class CanFly implements Fly
{
	public String Fly()
	{
		return "Can Fly";
	}
}

class CantFly implements Fly
{
	public String Fly()
	{
		return "Can't Fly";
	}
	
}