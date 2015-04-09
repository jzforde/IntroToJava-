package examples;

public class Jet2
{
	 private static int nextId = 0;
	    private int id;
	    private String model;    // i.e. Bombardier
	    private float topSpeed;  // mach units
	    private int range;       // miles
	    
	    // constructors
	    public Jet2() 
	    {
	        this("Unknown", 0, 0);  // call three arg constructor
	    }
	    
	    public Jet2(String model, float topSpeed, int range)
	    {
	        this.model = model;
	        this.topSpeed = topSpeed;
	        this.range = range;
	        this.id = ++nextId;
	    }

	    public String getModel()
	    {
	        return model;
	    }

	    public void setModel(String model)
	    {
	        this.model = model;
	    }

	    public float getTopSpeed()
	    {
	        return topSpeed;
	    }

	    public void setTopSpeed(float topSpeed)
	    {
	        this.topSpeed = topSpeed;
	    }

	    public int getRange()
	    {
	        return range;
	    }

	    public void setRange(int range)
	    {
	        this.range = range;
	    }

	    @Override
	    public String toString()
	    {
	        return "Jet [id=" + id + ", model=" + model + ", topSpeed=" + topSpeed
	                + ", range=" + range + "]";
	    }
}
