package extra;

import java.util.ArrayList;

public class Test4{
	
	static public String abcd;
	
	static public void letsc( String ab)
    {
		abcd= ab;
    	//return 5;
    }
	
 static public void Main(String argv[]){
               
	 
	 boolean myBool = false; // line 1
	 int yourInt = 10; // line 2
	 float hisFloat = 19.54f;
	 
	 
	 System.out.println(hisFloat > yourInt); // line 4
	 System.out.println(yourInt += 20); // line 5
	 System.out.println(myBool = false);
                
                
                double a7 = 10;
               
                long l = 99;
                float d = 1;
                int i = 1;
                int j = 0;
               
                
                int abc = 12_3;
                float cv = 20.12f;
                long vc = 89;
                char se = '1';
                boolean b1,b2,b3;
                b1=b2=b3= true;
                
                
              
                System.out.println("value of char : "+ b3);
                
                String hjk1 = new String("hello"); 
                String hjk2 = new String("hello"); 
                
                String k1 ="hello";
                String k2 = "hello";
                
                StringBuilder bnh = new StringBuilder();
                bnh.append(k1);
                bnh.append(new String("hrlko"));
                System.out.println("bnh value : " + bnh);
               // bnh.capacity();
                System.out.println("bnh value : " + bnh.capacity());
                
                
                
                System.out.println(hjk1==hjk2);
                System.out.println(k1==k2);
                System.out.println(hjk2.hashCode());
                
                ArrayList<String> myArrList = new ArrayList<String>();
                String one = "One";
                String two = new String("Two");
                myArrList.add(one);
                myArrList.add(two);
                ArrayList<String> yourArrList = myArrList;
                one.replace("O", "B");
                ArrayList<String> yourArrList2 = myArrList;
                for (String val : myArrList)
                	System.out.print(val + ":");
                	for (String val : yourArrList)
                	System.out.print(val + ":");
                	for (String val : yourArrList2)
                    	System.out.print(val + ":");
                	
               
                	
                	
                	System.out.println("get" + myArrList.get(1));
                	
                	System.out.println("-------------------------------");

                	String result = "1";
                	int score = 10;
                	if ((score = score+10) == 100)
                	result = "A";
                	else if ((score = score+29) == 50)
                	result = "B";
                	else if ((score = score+200) == 10)
                	result = "C";
                	else
                	result = "F";
                	System.out.println(result + ":" + score);
                	float f = 45.98f;
              
                	final int a = 10;
                	final int b = 20;
                	final int c;
                	c = 30;
                	switch (a) {
                	case a+b: System.out.println(b+c);
                	break;
               
                	}
                	
                	
                	int num = 9;
                	boolean divisibleBy7 = false;
                	while (!divisibleBy7) {
                	System.out.println(num);
                	if (num % 7 == 0) divisibleBy7 = true;
                	--num;
                	}
                	boolean noMoreBuns = true;
                	boolean bunsAvailable = true;
                	

               //  j= i<<j;

                // j=i<<d;

                 //j=i<<l;
                 
                // Integer it = Integer.valueOf("181d");
                 //System.out.println(it);
        
      
        
      
}
}
