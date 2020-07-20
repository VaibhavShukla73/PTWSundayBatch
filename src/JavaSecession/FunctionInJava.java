package JavaSecession;

public class FunctionInJava {

	public static void main(String[] args) {

		
		FunctionInJava functionMethod=new FunctionInJava();
		
		
		functionMethod.test();
	   String sname=functionMethod.getTrainerName();
	   System.out.println(sname);
	   System.out.println(functionMethod.getTrainerName());
	   int d=functionMethod.add();
	   System.out.println(d);
	   System.out.println(functionMethod.add());
	   
	   int tot=functionMethod.totalTwoNumber(2000, 400);
	   System.out.println(tot);
	   System.out.println(functionMethod.isUSCitizen("tom"));
	   System.out.println(functionMethod.isUSCitizen("Smith"));

		int m=functionMethod.getStudentMarks("Tina");
		System.out.println(m);
		
	}
	
	//three types of method
	//simple method does not return any thing and does not take any parameter
	//void type
	//no ip and no op no return keyword void :does not return anything
	
	
	public void test() {
		
		System.out.println("Test Method");
		
		
	}
	
	
	//2 no input but some return
	
	public String  getTrainerName() {
		//System.out.println("Trainner Name Tom");
		String name="Tom";
		return name;
	}
	
	
	public int add() {
		System.out.println("Get Total");
		int a=100;
		int b=200;
		int total=a+b;
		return total;
	}
	
	public int  totalTwoNumber(int a,int b) {
		
		System.out.println("Addition on this method with parameter");
		
		int c=a+b;
		return c;
	}
	
	//return boolean
	
	public boolean isUSCitizen(String name) {
		
		  boolean flag=false;
		  if(name.equals("Tom")) {
			   flag=true;
		  }else if(name.equals("Peter")) {
			   flag=true;
		  }else if(name.equals("Smith")) {
			   flag=true;
		  }else
		  {
			 flag=false;
		  }
		
		  return flag;
		
				
		
	}
	
	
	public int getStudentMarks(String name) {
		   int mark=0;
		   if(name.equals("Nita")) {
			    mark=95;
		   }else  if(name.equals("Tina")) {
			    mark=85;
		
		   }else  if(name.equals("Mina")) {
			    mark=75;
		
		   }else
		   {
			   System.out.println(name+"  name is not found");
		   }
		
		
		return mark;
		
		
	}
	
	

}
