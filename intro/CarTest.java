package intro;
import java.util.Scanner;
public class CarTest
{
	    public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        String color = null;
	        
	        do
	        {
	            System.out.println("Please enter a color: ");
	            color = input.next();
	            color = color.toUpperCase();
	        } while (! isValidColor(color));
	        
	        input.close();
	        
	        Car c1 = new Car("Honda", "Accord", 1999);
	        Car c2 = new Car("Ford", "F100", 1958, ColorEnum.valueOf(color));
	        
	        c1.setColor(ColorEnum.SILVER);
	        c1.display();
	        c2.display();

	    }
	    
	    public static boolean isValidColor(String c) {
	        ColorEnum[] colors = ColorEnum.values();
	        
	        for (ColorEnum color : colors)
	        {
	            String colorString = color.toString();
	            if (colorString.equalsIgnoreCase(c)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
