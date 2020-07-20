package JavaSecession;

public class DataTypes {
	
	byte b1=10;   //  class level variable

	public static void main(String[] args) {
		/*This is my first java program
		Today is my first day
		I am enjoying in java code*/
		
   //   primitive data types
		//non primitive data types
		//a. Boolean data types
		//Integral data types   byte,short,long,int,char
		//floating data types float,double
		
		
		// 1 byte
		//size 1 bytes=8 bits
		//range -127 to 128
		
		byte b1=120;   // local variable
		
		//b1=35;
		System.out.println("Bytes Value" +b1);
		
		//short
		//size 2 bytes=16 bits
		//range -32768 to 32767
		short s1;
		s1=(short) 40000;
		System.out.println("Answer s1 "+s1);
		System.out.println(32767+32768+1);
		
		//3.int
		//size 4 bytes=32 bits
		//range -2^31 to 2^31
		
		
		int a=10;
		System.out.println(a);
		
		
	    //4 long
		// size 8 bytes= 64 bits
		// range -2^63 to 2^63
		long l1=10000000000000l;
		System.out.println(l1);
		
		
		//5 float 
		//size 4 bytes = 32 bits
		//range after . upto 5 digits
		
		float f1= (float) 100.25123;
		float f2=200.25f;
		
		System.out.println(f1);
		System.out.println(f2);
		
		
		//6 double
		// size 8 bytes = 64 bits
		//range after decimal points upto 15 digits
		double d1=100.455555555;
		System.out.println(d1);
				
		// 7 boolean
		//true false
		// default value false
		boolean flag = true;
		System.out.println(flag);
		
		//8 char 
		//2 bytes = 16 bits
		//'a'
		
		char p1='A';
		char j1='B';
		
		System.out.println(p1);
		System.out.println(j1);
		
		System.out.println(p1+j1);
				
		
		
	   int  b5=30;
	    b5=b5+10;
	    System.out.println(b5);
		
		b5+=10;
	    System.out.println(b5);

		b5-=5;
		
	    System.out.println(b5);

		
	}

}
