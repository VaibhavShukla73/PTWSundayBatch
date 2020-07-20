package JavaSecession;

public class Test {

	public static void main(String[] args) {

		
		 Sales S=new Sales();
		 SalesRecSystem tom=new SalesRecSystem();
		 
		 
		 S= tom.getInput();
		 tom.getOutPutDetails(S);

		 
		 tom.getCalculate(S);
		 
		
		
		
		
	}

}
