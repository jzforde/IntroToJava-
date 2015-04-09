package intro;

public class ShapeTester2
{
	public static void main(String[] args)
	{
	        double area;
	        double perimeter;
	        
	        Rectangle r1 = new Rectangle();
	        Rectangle r2 = new Rectangle();
	        Rectangle r3 = new Rectangle();
	        
	        r1.setHeight(10);
	        r1.setWidth(5);
	        area = r1.getArea();
	        perimeter = r1.getPerimeter();
	        System.out.println("The area of a rectangle with width " + 
	                r1.getWidth()  + "and height " + r1.getHeight() + 
	                " = " + area);
	        System.out.println("Perimeter: " + perimeter);

	        r2.setHeight(8);
	        r2.setWidth(5);
	        area = r2.getArea();
	        System.out.println("Area: " + area);
	        
	        r3.setHeight(6);
	        r3.setWidth(4);
	        area = r3.getArea();
	        System.out.println("Area: " + area);
	    }
	}
}
