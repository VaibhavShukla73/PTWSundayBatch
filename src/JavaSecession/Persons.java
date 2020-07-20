package JavaSecession;

public class Persons {
	
	
	String name;
	int age;
	long phone;
	
	
//	public Persons() {  //default constuctor    
//	  
//		System.out.println("default const");
//	}
//	
//	
//	
//   public Persons(int i) {  //default parameters one
//		System.out.println("one parameter const");
//	}
	
	
	public Persons(String name,int age,long phone) {
		//name=name1;
		this.name=name;
		this.age=age;
		this.phone=phone;
		
	}
	public Persons(String name,int age) {
		//name=name1;
		this.name=name;
		this.age=age;
				
	}

	

	public static void main(String[] args) {
		
  
		
		Persons p1=new Persons("Tom",25,234344);
		Persons p2=new Persons("Tom",25);
	
//		
//		
//		p1.name="Tom";
//		p1.age=25;
//		p1.phone=293434;
//		
//		
   	System.out.println(p1.name+"   "+p1.age+"   "+p1.phone);
   	System.out.println(p2.name+"   "+p2.age+"   "+p2.phone);
		

		
		
		
		
		
		
		
		
		
	}

}
