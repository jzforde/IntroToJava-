package intro;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyOrder
{
	public static void main(String[] args)
	{
		Order r = new Order(1115, "Barbara Streisand");
	try
	{
		 FileOutputStream fout = new FileOutputStream("MyOrder.ser");
         ObjectOutputStream out = new ObjectOutputStream(fout);
         out.writeObject(r);
         out.close();
	}
	catch (IOException e) 
	{
	     System.err.println(e.getMessage());
	}
		 
	}
}
