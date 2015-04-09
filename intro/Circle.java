package intro;

public class Circle
{
	    // fields
	    double radius;
	    
	    // methods
	    public  double getArea() {
	        return Math.PI * radius * radius;
	    }
	    
	    public  double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public double getRadius()
	    {
	        return radius;
	    }

	    public void setRadius(double radius)
	    {
	        this.radius = radius;
	    }
}
