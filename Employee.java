package Test;


	public class Employee {
		String FirstName;
		String LastName;
		

		public Employee(String firstName, String lastName) {
			super();
			FirstName = firstName;  
			LastName = lastName; 
		}
	    

		@Override
		public String toString()
		{
			return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
		}


		public static void main(String[] args) {
			
	      Employee emp1=new Employee("Rahul","Sharma");
	      System.out.println(emp1);
	      
	      Employee emp2=new Employee("Anjali","Kumari");
	      System.out.println(emp2);
	      
	      Employee emp3=new Employee("Monika","jha");
	      System.out.println(emp3);
		}

	}

