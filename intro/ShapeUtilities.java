package intro;

public class ShapeUtilities
{
	    public static double getRectangleArea(double w, double h) {
	        return w * h;
	    }

	    public static double getRectanglePerimeter(double w, double h) {
	        return w * 2 +  h * 2;
	    }

	    public static double getCircleArea(double rad) {
	        return Math.PI * rad * rad;
	    }
	    
	    public static double getCircleCircumference(double rad) {
	        return 2 * Math.PI * rad;
	    }
}
