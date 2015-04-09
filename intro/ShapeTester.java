package intro;

public class ShapeTester
{
	    public static void main(String[] args)
	    {
	        double area;
	        
	        area = ShapeUtilities.getRectangleArea(10, 5);
	        System.out.println("Area: "  + area);
	        area = ShapeUtilities.getRectangleArea(8, 5);
	        System.out.println("Area: "  + area);
	        area = ShapeUtilities.getCircleArea(3);
	        System.out.println("Area: "  + area);
	        
	    }

	}
}
