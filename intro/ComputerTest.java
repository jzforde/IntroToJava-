package intro;
import java.util.*;

public class ComputerTest
{
	public static void main(String[]args)
	{
		Computer c = new Computer(15, 100, "Mac");
		Computer c1 = new Computer(); 
		c.display(); 
		c1.display(); 
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Please enter your computer type: ");
		String btype = input.next();
		System.out.print("Please enter your monitor size: ");
		int mtype = input.nextInt();
		System.out.print("Please enter your screen resolution: ");
		int rtype = input.nextInt();
		
		c1.setBrand(btype);
		c1.setMonitorSize(mtype);
		c1.setScreenRes(rtype);
		c1.display();
		input.close();
		
	}
}
