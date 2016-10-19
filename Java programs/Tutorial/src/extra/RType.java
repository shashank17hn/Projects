package extra;

import java.util.Random;

class Base1 {
int i=99;
public void amethod(){
        System.out.println("Base.amethod()");
        }
}

public class RType extends Base1{
int i=-1;
        public static void main(String argv[]){
        Base1 b = new RType();//<= Note the type
        
        System.out.println(b.i);
        
       
        
        Random ran = new Random();
        
        
        int x;
       for(int h=0; h<=10;h++ )
       {
    	  // int d = (int)(Math.random()*30)+3;
    	   System.out.println((Math.random()*30)/3);
    	   

       }
     
       Integer w = new Integer(20);
       Float W = new Float(34);
       
       
       
      
       
       
       String fname = "abcd";
       fname = "bdvg";
       fname = new String(",nkvdnkmdv");
       
       System.out.println(fname);
        }

        public void amethod(){
                System.out.println("RType.amethod()");
               amethod();
        }
}
