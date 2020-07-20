package JavaSecession;

public class SalesRecSystem {
	
	public  Sales getInput() {
		SalesInput sc=new SalesInput();
		return sc.getSalesDetails();
			
	}
	
	public  void getOutPutDetails(Sales s) {
		SalesOutPut salesoutput=new SalesOutPut();
		salesoutput.getOutPut(s);
		
		
}
	
	public  void getCalculate(Sales s) {
		
		SalesCalculate salescalculte=new SalesCalculate();
		salescalculte.getCalculate(s);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
