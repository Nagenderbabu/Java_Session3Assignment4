
public class Calculator {
  
	//declaring input1 and input2 variables
	int input1;
	int input2;
	int value;
       // creating constructor
	Calculator(){
		
	}
  // add method	
public void addition(){
	// temp variable two store added inputs
	int temp;
	// adding inputs and storing in temp variable
	temp=input1+input2;
	// prints the output
	System.out.println("addition of two numbers is: "+temp);
}
  // subtract method
public void subtract(){
	// temp variable two store added inputs
	int temp;
	// subtracts inputs and storing in temp variable
	temp=input1-input2;
	// prints the output
	System.out.println("subtraction of two numbers is: "+temp);
}
public void multiplication(){
	// temp variable two store added inputs
	int temp;
	// multiplying inputs and storing in temp variable
	temp=input1*input2;
	// prints the output
	System.out.println("multiplied value of two numbers is: "+temp);
}
public void division(){
	// temp variable two store added inputs
	int temp;
	// dividing inputs and storing in temp variable
	temp=input1/input2;
	// prints the output
	System.out.println("divided value of two numbers is: "+temp);
}
}
