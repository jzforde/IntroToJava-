package intro;

public class Computer
{
	private int monitorSize; 
	private int screenRes; 
	private String brand;

public Computer(int monitorSize, int screenRes, String brand)
{
	this.monitorSize = monitorSize;
	this.screenRes = screenRes;
	this.brand = brand;
}

public Computer()
{
	this(0, 0, "Unknown"); 
}
public int getMonitorSize()
{
	return monitorSize;
}

public void setMonitorSize(int monitorSize)
{
	this.monitorSize = monitorSize;
}

public int getScreenRes()
{
	return screenRes;
}

public void setScreenRes(int screenRes)
{
	this.screenRes = screenRes;
}

public String getBrand()
{
	return brand;
}

public void setBrand(String brand)
{
	this.brand = brand;
}
public void display()
{
	System.out.println("Information on your computer..."); 
	System.out.println("Monitor Size is: " + monitorSize); 
	System.out.println("Screen Resolution is: " + screenRes);
	System.out.println("The brand is: " + brand);
}
}


