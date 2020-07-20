package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		Bmw b=new Bmw();
		
		b.start();    //overridden method
		b.refuel(); //inherited method
		b.stop();    //ingerited method
		b.autoparking(); //child class method
		b.engine();
		
		
		Car c=new Car();
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		
		
		
		Car c1=new Bmw();    //top casting  //Webdriver driver=new ChormeDriver();
		
		c1.start();
		c1.stop();
		c1.refuel();
		
	
		
      		
		
	
		
		
		
		
		
		
		
		
		
	}

}
