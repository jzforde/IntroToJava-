package intro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search
{
	public static void main(String[] args)
	{
		System.out.println(args[0] + " " + args[1] );
		BufferedReader buf = null;  
		try
		{
			buf = new BufferedReader (new FileReader(args[1]));
			//buf = new BufferedReader (new FileReader(args[1]));
			String m; 
			while((m = buf.readLine()) !=null)
				if (m.indexOf(args[0]) != -1)
				{
					System.out.println(m);
				}
			buf.close();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
