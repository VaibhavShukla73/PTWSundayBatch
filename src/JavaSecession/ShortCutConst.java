package JavaSecession;

public class ShortCutConst {

	String name;
	int age;
	long phone;
	
	
	

	public ShortCutConst(String name, int age, long phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public static void main(String[] args) {

		ShortCutConst s1 = new ShortCutConst("Tom", 25, 34343);
		System.out.println(s1.name + "  " + s1.age + "   " + s1.phone);

        s1=null;	
	
        System.out.println(s1.name + "  " + s1.age + "   " + s1.phone);
	
	}
	
	

}
