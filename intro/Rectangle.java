package intro;

public class Rectangle
{
	    // fields
	    private int width;
	    private int length;
	    
	    // methods
	    public int getWidth() {
	        return width;
	    }
	    public void setWidth(int w) {
	        if (w <= 0)
	            System.err.println("Can't have a zero or negative width");
	        else
	            width = w;
	    }
	    public int getHeight() {
	        return length;
	    }
	    public void setHeight(int h) {
	        if (h <= 0)
	            System.err.println("Can't have a zero or negative height");
	        else 
	            length = h;
	    }

	    public double getArea() {
	        return width * length;
	    }
	    
	    public double getPerimeter() {
	        return width * 2 +  length * 2;
	    }
}
