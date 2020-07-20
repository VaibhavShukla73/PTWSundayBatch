package JavaSecession;

import java.util.Scanner;

public class SalesInput {
	
	
	public Sales getSalesDetails() {
		Scanner sc=new Scanner(System.in);
		Sales sc1=new Sales();
				
		

		
	
		System.out.println("Enter Product Name");
		sc1.prodName=sc.nextLine();
		
		
		System.out.println("Enter Product Code");
		sc1.prodCode=Integer.parseInt(sc.nextLine());
		//sc1.prodCode=sc.nextInt();
		
		
		System.out.println("Enter Customer Name");
		sc1.custName=sc.nextLine();
		
		
		
		
		
		
		
		System.out.println("Enter Product Qty");
		sc1.qty=sc.nextInt();
		
		System.out.println("Enter Product Rate");
		sc1.rate=sc.nextDouble();
		
		return  sc1;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
