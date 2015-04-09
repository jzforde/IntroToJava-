package intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParsePresidents
{
	private static final String INPUT_FILE = "presidents.txt";
	private JamiePresident[] presidents = new JamiePresident[44];

	private void parse()
	{
		try (BufferedReader buf = new BufferedReader(new FileReader(INPUT_FILE)))
		{

			String line;
			int counter = 0;
			while ((line = buf.readLine()) != null)
			{
				JamiePresident p = buildPresident(line);
				presidents[counter++] = p;
			}

		}
		catch (IOException e)
		{
			System.err.println(e);
		}
	}

	private JamiePresident buildPresident(String line)
	{
		int number = 0;
		String fname = "";
		String mname = "";
		String lname = "";
		String term = "";
		String party = "";

		number = Integer.parseInt(line.substring(0, line.indexOf(" ")));

		String allNames = line.substring(line.indexOf(" ") + 1,
				line.indexOf(","));
		String[] names = allNames.split(" ");

		fname = names[0];
		if (names.length == 2)
		{
			lname = names[1];
		}
		if (names.length == 3)
		{
			mname = names[1];
			lname = names[2];
		}
		if (names.length == 4)
		{
			mname = names[1] + " " + names[2];
			lname = names[3];
		}
		term = line.substring(line.indexOf(",") + 1, line.indexOf("(")).trim();

		int[] terms = getTerms(term);

		party = line.substring(line.indexOf("(") + 1, line.indexOf(")"));

		return new JamiePresident(number, fname, mname, lname, terms[0], terms[1], party);
	}

	private int[] getTerms(String termString)
	{
		String[] termStringArray = termString.split("-");

		int term1 = Integer.parseInt(termStringArray[0]);
		int term2 = 0;

		if (termStringArray.length == 1)
		{
			term2 = term1;
		}
		else
		{
			term2 = Integer.parseInt(termStringArray[1]);
		}

		// if you wanted to compute the difference, use this formula
		// int difference = (term2 - (term1 % 100)) % 100;

		// Our data sometimes has one or two digit values for term 2 :(
		if (term2 < 100)
		{
			// round term1 to the century, then add the century to term 2
			term2 = ((term1 / 100) * 100) + term2;
		}

		return new int[] { term1, term2 };
	}

	public void printPresidents()
	{
		for (JamiePresident president : presidents)
		{
			System.out.println(president);
		}
	}

	public void printWhigs()
	{
		for (JamiePresident president : presidents)
		{
			if (president.getParty().contains("Whig"))
			{
				System.out.println(president);
			}
		}
	}

	public void printPresidentsWhoseLastNameStartsWith(String prefix)
	{
		for (JamiePresident president : presidents)
		{
			if (president.getLastName().startsWith(prefix))
			{
				System.out.println(president);
			}
		}
	}

	public void printPresidentsWithTermsLessThan(int amount)
	{
		for (JamiePresident president : presidents)
		{
			if (president.getEndTerm() - president.getStartTerm() < amount)
			{
				System.out.println(president);
			}
		}
	}

	public static void main(String[] args)
	{
		ParsePresidents parser = new ParsePresidents();
		parser.parse();
		parser.printPresidentsWithTermsLessThan(4);
	}
}
