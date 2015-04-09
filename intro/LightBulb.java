package intro;

public class LightBulb
{
	// fields
    private int watts;
    private String brand;
    
    // constructors
    public LightBulb(int watts, String brand)
    {
        this.watts = watts;
        this.brand = brand;
    }

    // methods
    public void printSpecs() 
    {
        System.out.println("Watts: " + watts);
        System.out.println("Brand: " + brand);
    }
    public int getWatts()
    {
        return watts;
    }

    public void setWatts(int watts)
    {
        this.watts = watts;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }
}
