package intro;

public class myFib
{

	public static void main(String[] args)
	{
		int i = 0; 
		int a = 0; 
		int b = 0; 
		
		for ( i = 0; i < 21; i++)
		{
			a = i + 1; 
			b = a + i; 
			System.out.println(b); 
		}

	}

}
