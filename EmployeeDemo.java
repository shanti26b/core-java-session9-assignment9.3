package Assignment9;     // here i am creating package name as Assignment9  

public class EmployeeDemo {     // here  i am creating class name as EmployeeDemo
	
	public static void main (String[]args){   // main method
		
		
		                   //Creating object of the permanentEmp and passing the arguments

		PermanentEmp pe= new PermanentEmp(2411,"shanti",17,70000.00);

		System.out.println("permanent employee detail");

		                    /* calling id,name,no of TotalLeaves */

		System.out.println("Id  =" + pe.empId);

		System.out.println("name =" + pe.empName);

		System.out.println("leave =" + pe.TotalLeaves);
 
		                  /* calling the method */

		pe.calculate_balanceLeaves();
		
                       //calculate the balances leaves and available leaves
		
	pe.avail_leave(17, (char)0);

		pe.calculate_salary();
		
                     //calculate the salary
		
		System.out.println("..................................");



		          //Creating object of the permanentEmp and passing the arguments

		TemporaryEmp te= new TemporaryEmp(6745,"komali",17,85000.00);

		System.out.println("Temprory employee detail");

		/* calling id,name,no of TotalLeaves */

		System.out.println("Id  =" + te.empId);

		System.out.println("name =" + te.empName);

		System.out.println("leave =" + te.TotalLeaves);

		/* calling the method */

		te.calculate_balanceLeaves();
		
		te.avail_leave(17, (char)0);

		te.calculate_salary();



	}




		
		
	}
	


