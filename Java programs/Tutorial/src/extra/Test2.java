package extra;


	public class Test2{
        static int l = 4;
        private int k=2;
        int p;
        
         Test2(){}

public static void main(String argv[]){
        Test2 a = new Test2();
        a.amethod();
        System.out.println( "value" +  l); 
        
        }

     public void amethod(){
        int i = 99;
        int j = 6;
        
       
        class CInMet{
        	 int z =99;
                public void mymethod(int q){
                                //Here
                	int z;
                	System.out.println( "value" +  i + j + k + l + this.z);
                     }//end of mymethod
                
                class Abc
                 {
                	  public void mymethod2(int q){
                	System.out.println( "value" +  i + j + k + l); 
                	  }
                 }
                }//End of CInMet

                CInMet c = new CInMet();
                c.mymethod(i);
                
               
                int k = 10;
                k=p;
                
                
                
                boolean b[] = new boolean[5];
                System.out.println("boolean value : " + b[2]);
                
                int o=0777;
                System.out.println("value of " + o);
                
                System.out.println("shift");
                System.out.println( 3  >>> 64); 
                System.out.println( 3<<1);
                System.out.println( 1<<32); 
                int d = 1 + 'a';
                System.out.println(d); 
                
                String s = "Hello";  
                String s2 = "Hello"; 
                if (s==s2){  
                    System.out.println("Equal without new operator 1st");  
                    }  

                 

                String t = new String("Hello");  
                String u = new String("Hello"); 
                if (t==u){  
                    System.out.println("Equal with new operator ===");  
                    }
                
                
                boolean b1 = true;
                boolean b2 = true;
                if(b1 ==b2){
                                 System.out.println("true");
                                 }
                
                  
                boolean b3=false;
                boolean b4=true;
                System.out.println(b3&&b4);
                
                System.out.println(020);
                
                
                
                


                
     }//End of amthod
}

	


