package challenge14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	// Add your code here
int a1[]; 
Difference(int[] a)
    {
    a1=a;  
}


public void computeDifference()
    {
   
    int inter =0;
    for (int i=0; i< a1.length; i++)
        {
        for(int j=0;j<a1.length;j++)
            {
            inter= Math.abs(a1[i]- a1[j]);
            
            if(inter >= maximumDifference)
                {
                maximumDifference = inter;
               
            }
        }
    }
    
}


}