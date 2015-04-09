package intro;

import java.io.*;

public class CopyBinaryFile
{

	public static void main(String[] args)
	{
		String fileNameIn = "/Users/jamie/Downloads/Netbeans-Duke.png";
		String fileNameOut = "/Users/jamie/Downloads/Duke.png";
		File file = new File(fileNameIn);
		byte[] byteArray = new byte[(int) file.length()];
		try
		{
			FileInputStream inputStream = new FileInputStream(file);
			// read contents of file into array
			inputStream.read(byteArray);

			FileOutputStream outputStream = new FileOutputStream(fileNameOut);
			// write contents of array to file
			outputStream.write(byteArray);
			System.out.println("File Copied!");

			inputStream.close();
			outputStream.close();
		}
		catch (IOException e)
		{
			System.err.println(e);
		}
	}

}
