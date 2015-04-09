package intro;

public class President
{
	private int num;
	private String fname; 
	private String lname; 
	private String mname; 
	private String term; 
	private String party;
	
	public President(int num, String fname, String mname, String lname, 
			String term, String party)
	{
		this.num = num;
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.term = term;
		this.party = party;
	}

	public President(int num, String fname)
	{
		this.num = num;
		this.fname = fname;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public String getMname()
	{
		return mname;
	}

	public void setMname(String mname)
	{
		this.mname = mname;
	}

	public String getTerm()
	{
		return term;
	}

	public void setTerm(String term)
	{
		this.term = term;
	}

	public String getParty()
	{
		return party;
	}

	public void setParty(String party)
	{
		this.party = party;
	}

	@Override
	public String toString()
	{
		return "President [number=" + num + ", first name=" + fname + ", last name="
				+ lname + ", middle name=" + mname + " term= " + term + ", party="
				+ party + "]";
	} 

}
