package camelcase;

import java.util.Scanner;

public class Solution {

    static int camelcase(String s) {
        // Complete this function
        char[] a = s.toCharArray();
        //boolean start = false;
        int counter = 1;
        for(int i =0 ; i< s.length() ; i++){
            if(Character.isUpperCase(a[i]))
            {
            	
              counter++;
            	
            }  
        }
        return counter;
        
    }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}