
public class MainClass {
	public static void main(String args[]){
		
		//Two number hard coded:
		int a = 10;
		int b = 27;
		
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
		
		
		
		//==========================================//
		//Output to screen all operations here
		System.out.println("Sum =");
		
		
	}




}
