import java.util.*;


public class Process {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiate Calculator class 
		Calculator c=new Calculator();
		
		// scanner object to scan input from user
		Scanner sc=new Scanner(System.in);
		    
		 System.out.println("                  MY CALCULATOR         ");
		 System.out.println("Welcome to my calculator......");
		 System.out.println(" ");
		 
		 System.out.println("Enter two numbers to perform following operations:");
		 c.input1=sc.nextInt();
		 c.input2=sc.nextInt();
		 System.out.println("please select below options to perform ur desired operations");
		 System.out.println("1.Add(+)                2.Multiply(*)  ");           
		 System.out.println("3.Subtract(-)          4.Division(/)  ");  
		 c.value=sc.nextInt();
	 
		 switch(c.value)
		 {
			 
	case 1:  c.addition();      
	          break;
	    
	case 2: c.multiplication();
	        break;
	
	case 3:  c.subtract();
	        break;	
	case 4:  c.division();
	        break;
	
	default: System.out.println("enter the correct option ");
		     break;
		 }
		 
		 
		 
		     
	}

}
