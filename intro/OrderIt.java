package intro;
import java.io.*;


public class OrderIt
{
	public static void main(String[] args)
	{
		Order r = new Order(1115, "Barbara Streisand");
	        try {
	            FileOutputStream fin = new FileOutputStream("MyOrder.ser");
	            FileWriter fin2 = new FileWriter("MyOrder.txt");
	            FileOutputStream fin3 = new FileOutputStream("MyOrder.dat");
	            ObjectOutputStream out = new ObjectOutputStream(fin);
	            PrintWriter in2 = new PrintWriter(fin2);
	            DataOutputStream in3 = new DataOutputStream(fin3);
	            out.writeObject(r);
	            out.close();
	        }
	        catch (IOException e) {
	            System.err.println(e.getMessage());
	        }
	        System.out.println(r);
	}
}
