package lesson1;

public class Triangle {
    
	private String type;
	private int height;
	
	public Triangle(int height)
	{
	   this .height = height;	
	}
	
	public Triangle(String type)
	{
		this.type=type;
	}

	public Triangle(String type, int height)
	{
		this.type=type;
		this.height = height;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	/*public void setType(String type) {
		this.type = type;                       //<property name="type" value="Equilateral " /> used in xml
	}*/

	public void draw()
	{
		System.out.println(getType()+ "Triangle is drawn of height " + getHeight());
	}
}
