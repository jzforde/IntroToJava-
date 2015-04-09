package intro;

public class Stud
{
	private double gpa; 
	private String teacher; 
	private String subject;
	private String firstName;
	private String lastName; 

public Stud(String firstName, String lastName, double gpa, String teacher, String subject)
{
	this.gpa = gpa;
	this.teacher = teacher;
	this.subject = subject;
	this.firstName = firstName; 
	this.lastName = lastName; 
}

public double getGpa()
{
	return gpa;
}

public void setGpa(int gpa)
{
	this.gpa = gpa;
}

public String getTeacher()
{
	return teacher;
}

public void setTeacher(String teacher)
{
	this.teacher = teacher;
}

public String getSubject()
{
	return subject;
}

public void setSubject(String subject)
{
	this.subject = subject;
} 

public void display()
{
	System.out.println(firstName + " " + lastName + 
						"\n"+ "GPA: " + gpa + 
						"\n" + "Course: " + subject + 
						"\n" +"Teacher: " + teacher);
}
	
}
