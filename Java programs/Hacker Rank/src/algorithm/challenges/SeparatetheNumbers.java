package algorithm.challenges;

public class SeparatetheNumbers {
	
    static void separateNumbers(String s) {

    	char[] temp = s.toCharArray();
    	for(int i=0;i<temp.length;i++) {
    		if(temp[i+1] - temp[i] != 1) {
    			
    		}
    	}

    	
    }
    static String[] bigSorting(String[] unsorted) {

        for( int i=0 ; i<unsorted.length-1 ; i++){
            
            for(int j=1; j<unsorted.length ; j++){
                
                  if(Integer.parseInt(unsorted[i]) > Integer.parseInt(unsorted[j])){
                      
                    String temp = unsorted[i];
                      unsorted[i]= unsorted[j];
                      unsorted[j]= temp;
                  }
            
            }
            
        }
                     
        return unsorted;

    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
