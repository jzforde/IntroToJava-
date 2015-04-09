package intro;
import java.util.*;

public class KilosToPounds
{
	public static void main(String[]args)
	{
		Scanner input = new java.util.Scanner(System.in); 
		double convweight = 0; 
		char scale = getScale(input); 
		double weight = getWeight(input); 
		if (scale == '1')
		{
			convweight = weight * 2.20462; 
		}
		else if (scale == '2')
		{
			System.out.println("Here");
			convweight = weight / 2.20462; 
		}
		else if (!(scale != '1' && scale != '2'))
		{
			System.out.println("I'm sorry, you did not enter a valid option. Please select '1' for Kilos to Pounds or  '2' Pounds to Kilos: "); 
		}
		System.out.println(convweight); 
		input.close();
	}
	
	static char getScale(Scanner input)
	{
		 
		 System.out.println(" Please select '1' for Kilos to Pounds or  '2' Pounds to Kilos: ");
		 char scale = input.next().charAt(0); 
		 return scale; 
		  
	}
	
	static double getWeight(Scanner input)
	{
		System.out.println("Please enter the weight: ");
		double weight = input.nextDouble(); 
		return weight; 
		
	}
}
