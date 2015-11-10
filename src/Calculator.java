import java.util.ArrayList;

public class Calculator {

	int input1, input2;
	int output;
	
	public int [] getInput(){
		int[] ar = new int[2];
		ar[0]= this.input1;
		ar[1] = this.input2;
		return ar;
		
	}	
	
	public void setInput(int a, int b) {
		this.input1 = a;
		this.input2 = b;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	
	
	
	
	
}
