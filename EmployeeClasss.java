package Assessment1;

class EmployeeClass
{
	String Firstname=null;
	String Lastname=null;


    public EmployeeClass(String firstname, String lastname) {
		super();
		Firstname = firstname;
		Lastname = lastname;
	  
    


				try
				{
				System.out.println("enter Firstname value");
				
				
				System.out.println("enter lastname value");
				

				}
				catch(NullPointerException e)
				{
					System.out.println("write your name");
				}
				
				catch(Exception e)
				{
					System.out.println("minimum number of words 3");
				}
				
			}

		}



