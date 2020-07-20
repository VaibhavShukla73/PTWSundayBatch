package JavaSecession;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {
		
	
		//Per Increment ++i    before value assign increment by 1 i=10,++i,i become 11,j=i,j=11,i=11; 
		//Pre Decrement--i	   before value assign decrement by 1 i=10,--i,i become 9,j=i,j=9,i=9;
		//Post Increment i++   after value assign increment by 1 i=10,i++,i become 11 but i assign before increment,j=i,j=10,i=11
		//Post Decrement i--   after value assign decrement by 1 i=10,i--,i become 9 but i assign before decrement,j=i,j=10,i=9
		
		
		// ++ -->. increment by 1
		//--  -->  decrement by 1
		
		
		int x=100;
		
		int y=++x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		

	}

}
