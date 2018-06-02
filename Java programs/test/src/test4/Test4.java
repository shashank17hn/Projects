package test4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"6","31415926535897932384626433832795","1","3","10","3","5"};
		bigSorting(a);
		//for(String x:a) {
			//System.out.println(x);
	//	}

	}
	
	
	  static String[] bigSorting(String[] unsorted) {

	        for( int i=0 ; i<unsorted.length ; i++){
	            
	            for(int j=0; j<unsorted.length ; j++){
	                
	                  if(Double.parseDouble(unsorted[i]) <  Double.parseDouble(unsorted[j])){
	                      
	                    String temp = unsorted[i];
	                      unsorted[i]= unsorted[j];
	                      unsorted[j]= temp;
	                     // System.out.println( "after : " + unsorted[i]);
	                  }
	                  
	                
	          		
	            
	            }
	            
	        }
	                     
	        return unsorted;

	    }

}
