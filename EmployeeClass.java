package Assessment1;


class Employee
{
	String Firstname;
	String Lastname;



    public Employee(String firstname, String lastname) {
		super();
		Firstname = firstname;
		Lastname = lastname;
	}


@Override
	public String toString() {
		return "Employee [Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}



}

   public class EmployeeClass {

	public static void main(String[] args) {
	
   Employee Firstname=new Employee("Firstname","chitra");
   
   Employee Lastname=new Employee("lastname","Dhananjayan");
   Firstname.toString();
   
   Lastname.toString();
   
	
	}

}
