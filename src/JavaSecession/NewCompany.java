package JavaSecession;

public class NewCompany {
	
	
	public int empId;
	public String empName;
	private int sal;
	
	
	//public String ssn;
		
	
	public void getCompanyName() {
		System.out.println("ProtectWorld");
	}
	
	public void empIno() {
		
		NewCompany n1=new NewCompany();
		n1.sal=2000;
		System.out.println("emp Salary "+n1.sal);
		System.out.println("Company emp info");
		getSalary();
	}
	
	private void getSalary() {
		System.out.println("Empl. Salary");
		
	}
	
	
	
	}
