package intro;

public class Color
{  
	//fields 
	private int red; 
	private int blue; 
	private int green;
	private float transp; 
	/**
	 * constructors
	 */
	public Color(int red, int blue, int green, float transp)
	{
		this.red = red;
		this.blue = blue;
		this.green = green;
		this.transp = transp; 
	}
	public Color(int red, int blue, int green)
	{
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
	public Color()
	{
		this(20, 15, 5);	
	}
	
	//These are my getters and setters. Woohoo! 
	public int getRed()
	{
		return red;
	}
	public void setRed(int red)
	{
		this.red = red;
	}
	public int getBlue()
	{
		return blue;
	}
	public void setBlue(int blue)
	{
		this.blue = blue;
	}
	public int getGreen()
	{
		return green;
	}
	public void setGreen(int green)
	{
		this.green = green;
	}
	public float getTransp()
	{
		return transp;
	}
	public void setTransp(float transp)
	{
		this.transp = transp;
	}
	public void display()
	{
		System.out.println("Red:  " + red); 
		System.out.println("Blue:  " + blue); 
		System.out.println("Green:  " + green); 
		System.out.println("Transparency:  " + transp); 
	}
	
	
	
	
	
	
}
