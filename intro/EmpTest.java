package intro;

public class EmpTest
{
	public static void main(String[] args)
	{
		//Employee emp = new Employee("Jilly", "Forde"); 
		Employee emp = new Employee();
		//emp.setFirstName("Jilly");
		//emp.setLastName("Forde");
		emp.setEMP_ID(123);
		emp.setSal(80000); 
		//emp.sal = 80000; This won't run b/c sal is private
		emp.showEmp(); 
	}
}
