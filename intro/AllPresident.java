package intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AllPresident
{
	public static void main(String[] args)
	{
		int arraySize = 45;
		//System.out.println(args[0] + " " + args[1]);
		BufferedReader buf = null;
		try
		{
			buf = new BufferedReader(new FileReader("Presidents.txt"));
			String line = null; 
			President [] p = new President[arraySize];
			while ((line = buf.readLine()) != null)
					System.out.println(line);
			buf.close();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
