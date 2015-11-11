
public class MainClass {
	public static void main(String args[]){
		
		//Two number hard coded:
		int a = 10;
		int b = 27;
		//new variables added
		int sum = 0;
		int product = 0;
		int difference = 0;
		int division = 0;
		
		Calculator calobject = new Calculator();
		calobject.setInput(a,b);
		//========================================//
		
		//read the inputs here
		int[] inputArray = new int[2];
		inputArray = calobject.getInput();
		
		
		//=========================================//
		//perform all operations here
		//use calopobject to perform operations and get the result back
		CalculateOperations calopobject = new CalculateOperations();
		// operations being performed
		sum = calopobject.add(a, b);
		product = calopobject.multiply(a, b);
		difference = calopobject.subtract(a, b);
		division = calopobject.divide(a, b);
		
		
		//==========================================//
		//Output to screen all operations here
		System.out.println("Sum =");
		
		
	}




}
