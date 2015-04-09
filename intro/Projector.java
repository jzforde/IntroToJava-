package intro;

public class Projector
{
	 // fields
    private String brand;
    private LightBulb bulb;
    private int volts;
    private String definition;
    
    // constructors
    public Projector(String brand, LightBulb bulb, int volts, String definition)
    {
        this.brand = brand;
        this.bulb = bulb;
        this.volts = volts;
        this.definition = definition;
    }

    // methods
    public void printSpecs() 
    {
        System.out.println("Brand: " + brand);
        bulb.printSpecs();
        System.out.println("Volts: " + volts);
        System.out.println("Definition: " + definition);
        
    }
    
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public LightBulb getBulb()
    {
        return bulb;
    }

    public void setBulb(LightBulb bulb)
    {
        this.bulb = bulb;
    }

    public int getVolts()
    {
        return volts;
    }

    public void setVolts(int volts)
    {
        this.volts = volts;
    }

    public String getDefinition()
    {
        return definition;
    }

    public void setDefinition(String definition)
    {
        this.definition = definition;
    }
    
}
