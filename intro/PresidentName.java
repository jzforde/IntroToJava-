package intro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PresidentName
{
	public static void main(String[] args)
	{
		int arraySize = 44; 
		//System.out.println(args[0] + " " + args[1] );
		BufferedReader buf = null;  
		try
		{
			
			President [] presArray = new President[arraySize];
			buf = new BufferedReader(new FileReader("Presidents.txt"));
			String line = null; 
			int i = 0; 
			while ((line = buf.readLine()) != null)
			{
				//System.out.println(line);
				String [] tokens = line.split(" ");
				//System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " " + tokens[3] + " " + tokens[4] + tokens[5]);
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
			for (President president : presArray)
			{
				if (president.getParty().contains("Whig"))
				{
					System.out.println(president);
				}
				//System.out.println(president);
			}
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
