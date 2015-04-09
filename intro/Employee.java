package intro;

public class Employee
{
	private String firstName;
	private String lastName;
	private int sal;
	private int EMP_ID;
	
	//no argument constructor! 
	Employee()
	{
		this("J", "Doe");
	}
	//two argument constructor! 
	Employee(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	
	//getters and setters! 
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int getSal()
	{
		return sal;
	}

	public void setSal(int sal)
	{
		this.sal = sal;
	}

	public int getEMP_ID()
	{
		return EMP_ID;
	}

	public void setEMP_ID(int eMP_ID)
	{
		EMP_ID = eMP_ID;
	}

	void showEmp()
	{
		System.out.println(firstName + " " + 
						   lastName + " " +
						   sal + " " + EMP_ID);
	}

	
}
