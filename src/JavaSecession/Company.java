package JavaSecession;

import java.util.ArrayList;

public class Company {
	
	public String getCompanyName() {
		return "PTW";
		
	}
	
	public double getCompanyShareValue() {
		return 45.55;
		
	}
	
	
	public ArrayList<String> getCourseDetails() {
		
		ArrayList<String> course=new ArrayList<String>();
		course.add("QC");
		course.add("SQL");
		course.add("QTP");
		course.add("JAVA");
		course.add("SELENIUM");
		
		
		return course;
		
			
		
	}
	
	
	public String[] getStudentList() {
		
		String sname[]=new String[7];
		sname[0]="Tom";
		sname[1]="Peter";
		sname[2]="Smith";
		sname[3]="Kan";
		sname[4]="John";
		sname[5]="Vimal";
		sname[6]="Vikram";
		return sname;
		
	
		
		
		
	}
	
	
public ArrayList<Object> batchInformation() {
	
	ArrayList<Object> batchInfo=new ArrayList<Object>();
	batchInfo.add("QTP");
	batchInfo.add(25);
	batchInfo.add("Evening");
	batchInfo.add(2500);
	
	return batchInfo;
	
	
	
	
	
}
	
	
	

}
