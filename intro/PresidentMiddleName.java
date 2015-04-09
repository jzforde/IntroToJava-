package intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PresidentMiddleName
{
	private static int arraySize = 44;
	private static President[] presArray = new President[arraySize];
	public static void main(String[] args)
	{
		buildPresidentArray();
		//printMiddleNamePresidents();
		//printWhigs();
		//printAllPresidents(); 
		printR();
	}
	
	private static void buildPresidentArray() 
	{
		BufferedReader buf = null;
		try
		{
			buf = new BufferedReader(new FileReader("Presidents.txt"));
			String line = null;
			int i = 0;
			while ((line = buf.readLine()) != null)
			{
				String[] tokens = line.split(" ");
				if (tokens.length == 6) //middle name exists test 
				{
					presArray[i] = new President(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
				}
				else
				{
					presArray[i] = new President(Integer.parseInt(tokens[0]), tokens[1],  "" , tokens[2], tokens[3], tokens[4]); 
				}		
				i++; 
			}
			buf.close();
			
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
	private static void printMiddleNamePresidents() 
	{
		for (President president : presArray)
		{
			if (tokens.length == 5)
			{
				System.out.println(president);
			}
			
		}
	}
	
	private static void printNoMiddleNamePresidents() 
	{
		for (President president : presArray)
		{
			if (president.getMname().length() > 1)
			{
				presArray[i] = new President(Integer.parseInt(tokens[0]), tokens[1], "", tokens[2], tokens[3], tokens[4]); 
			}
			else
			{
				presArray[i] = new President(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
			}
			i++;
		}
	}
	
	private static void printWhigs()
	{
		for (President president : presArray)
		{
			if (president.getParty().contains("Whigs"))
			{
				System.out.println(president);
			}
			//System.out.println(president);
		}
	}
	
	private static void printR()
	{
		for (President president : presArray)
		{
			if (president.getLname().charAt(0) == 'R')
			{
				System.out.println(president);
			} 
		}
	}
	
	private static void printAllPresidents()
	{
		for (President president : presArray)
		{
			System.out.println(president);
		}
	}
}
