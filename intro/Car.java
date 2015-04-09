package intro;

public class Car
{
	    // fields
	    private String make;
	    private String model;
	    private ColorEnum color;
	    private int year;
	    
	    // constructors
	    public Car(String make, String model, int year)
	    {
	        this(make, model, year, ColorEnum.BLACK);
	            
	    }

	    public Car(String make, String model, int year, ColorEnum color)
	    {
	        this.make = make;
	        this.model = model;
	        this.color = color;
	        this.year = year;
	    }
	    
	    // methods
	    public void display() 
	    {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	        System.out.println("Color: " + color);
	    
	    }

	    public String getMake()
	    {
	        return make;
	    }

	    public void setMake(String make)
	    {
	        this.make = make;
	    }

	    public String getModel()
	    {
	        return model;
	    }

	    public void setModel(String model)
	    {
	        this.model = model;
	    }

	    public ColorEnum getColor()
	    {
	        return color;
	    }

	    public void setColor(ColorEnum color)
	    {
	        this.color = color;
	    }

	    public int getYear()
	    {
	        return year;
	    }

	    public void setYear(int year)
	    {
	        this.year = year;
	    }
	}
}
