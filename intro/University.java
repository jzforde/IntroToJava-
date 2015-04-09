package intro;

public class University
{
	public static void main(String[] args)
    {
        Teacher mrsJones = new Teacher();
        Teacher mrsSmith = new Teacher();
        Teacher mrRomero = new Teacher();
        // code here to populate the teacher objects
        
        Student jillian = new Student();
        Student kyle = new Student();
        Student andrew = new Student();
        Student trent = new Student();
        Student joe = new Student();
        Student robert = new Student();
        Student wes = new Student();

        wes.setAdvisor(mrsJones);
        wes.addTeacher(mrsSmith);
        wes.addTeacher(mrRomero);
        
        mrsJones.addAdvisee(wes);
        mrsJones.addStudent(jillian);
        
    }
}
