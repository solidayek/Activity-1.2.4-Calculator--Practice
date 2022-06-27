import java.util.Scanner;


class Main 
{
	public static void main(String[] args) 
	{

  	//ask user for two doubles and store 

    double firstDouble;    // To hold the 1st input.
    double secondDouble;     // To hold the 2nd input.
    
    //myobject//
    Calculator myCalculator = new Calculator();
      
    // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

    // Get the x DOUBLE input from the user
    System.out.print("Enter the first Double:");
    firstDouble = console.nextDouble();

// Get the Y DOUBLE input from the user
    System.out.print("Enter the second Double:");
    secondDouble = console.nextDouble();

    
  myCalculator.sum(firstDouble,secondDouble);
  myCalculator.multiply(firstDouble,secondDouble);
  myCalculator.divide(firstDouble,secondDouble);
  myCalculator.subtract(firstDouble,secondDouble);

console.close();



    	
	}
}
/*
My output result must look like this:

Enter two doubles:
 3.4
 1.6
3.4 + 1.6 = 5.0
3.4 - 1.6 = 1.7999999999999998
3.4 * 1.6 = 5.44
3.4 / 1.6 = 2.125 */