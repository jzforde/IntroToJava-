package examples;

public class Vehicle3
{
	private int maxSpeed;
    private int numWheels;

    public Vehicle3() {
        this(0, 0);
    }
    
    public Vehicle3(int ms, int nw) {
        maxSpeed = ms;
        numWheels = nw;
    }
    
    @Override
    public String toString()
    {
        return "Vehicle3 [maxSpeed=" + maxSpeed + ", numWheels=" + numWheels
                + "]";
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getNumWheels()
    {
        return numWheels;
    }

    public void setNumWheels(int numWheels)
    {
        this.numWheels = numWheels;
    }
}
