package JavaSecession;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {

		Company co=new Company();
		String name=co.getCompanyName();
		System.out.println("Company Name "+name);
		double sharevalue=co.getCompanyShareValue();
		System.out.println("Comapany Share Value "+sharevalue);
		ArrayList<String> coursedetails=co.getCourseDetails();
		System.out.println("Array List size "+coursedetails.size());
		for(String cd:coursedetails) {
			System.out.println(cd);
		}
		
		String srudentlist[]=co.getStudentList();
		
		for(int i=0;i<srudentlist.length;i++) {
			  System.out.println(srudentlist[i]);
		}
		
		
		
		
		
	}

}
