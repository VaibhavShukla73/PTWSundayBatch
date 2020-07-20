package JavaSecession;

public class Canditate {
	
	
	public String name;
	public int age;
	public String location;
	
	public Canditate(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	

	public static void main(String[] args) {

		Canditate a=new Canditate("Tom",25,"NY");
		Canditate b=new Canditate("Smith",35,"NJ");
		Canditate c=new Canditate("Pter",45,"LA");
		
		
		System.out.println(a.name+"   "+a.age+"   "+a.location);
		System.out.println(b.name+"   "+b.age+"   "+b.location);
		System.out.println(c.name+"   "+c.age+"   "+c.location);
		
		System.out.println("==========================");
		
		a=b;
		
		System.out.println(a.name+"   "+a.age+"   "+a.location);
		System.out.println(b.name+"   "+b.age+"   "+b.location);
		System.out.println(c.name+"   "+c.age+"   "+c.location);
		
		
		b=c;
		System.out.println("==========================");
		
		System.out.println(a.name+"   "+a.age+"   "+a.location);
		System.out.println(b.name+"   "+b.age+"   "+b.location);
		System.out.println(c.name+"   "+c.age+"   "+c.location);
		
		
		
		
		
		
	}




	

}
