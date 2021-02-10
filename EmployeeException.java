package Test;


class NullPointerException extends Exception //custome exception class
{
	String msg;

	public NullPointerException(String msg) {
		super(msg);
		
		
	}
	
	
}

public class EmployeeException{
	private String FirstName;
	private String LastName;
	
	

	public EmployeeException(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

  void validation(String FirstName,String LastName ) throws NullPointerException 
  {
	  if(FirstName== null || LastName==null)
	   {
		 throw new NullPointerException("Entry Missing"); //message of exception
	   }
	  

	  else if(FirstName.length()<3|| LastName.length()<3)
	   {
		 throw new NullPointerException("Name should be minimum 3 character");//message of exception
	   }
	  
  }

	public static void main(String[] args) throws NullPointerException {
	
		EmployeeException emp=new EmployeeException("Rahul", "Sharma");
		  
		  emp.validation("Ra", "sh");
	}
}