package intro;

public class Student
{
	    private float gpa;
	    private Teacher[] teachers = new Teacher[5];
	    private Teacher advisor;
	    
	    public Teacher getAdvisor()
	    {
	        return advisor;
	    }
	    public void setAdvisor(Teacher advisor)
	    {
	        this.advisor = advisor;
	    }
}
