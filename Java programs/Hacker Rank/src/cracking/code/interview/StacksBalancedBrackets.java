package cracking.code.interview;

import java.util.Scanner;
import java.util.Stack;

/*Output Format

For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.

Sample Input

3
{[()]}
{[(])}
{{[[(())]]}}
Sample Output

YES
NO
YES

5
{()[][{}]}
({}{[]})({)}
()[]
[()][{}]{[({})[]]}
((){)}

YES
NO
YES
YES
NO


1
({}{[]})({)}
*
*/

public class StacksBalancedBrackets {

	  public static boolean isBalanced(String expression) {
		  Stack<Character> stack = new Stack<>();
		  //System.out.println(stack);
		  for(int i=0; i < expression.length() ;i++) {
			// System.out.println(stack);
			  if(expression.charAt(i) == '{' ||  expression.charAt(i) == '[' || expression.charAt(i) == '(')
				  stack.push(expression.charAt(i));
			  if(expression.charAt(i) == '}' ||  expression.charAt(i) == ']' || expression.charAt(i) == ')')
			  {
				  if(stack.size()!=0 && matchBracket(stack.peek(), expression.charAt(i)))
				  {
					  stack.pop();
				  }
				  else
				  {
					  return false;
				  }
			  }
		  }
		  if(stack.size() ==0) 
			  return true;
		  else
		     return false;
	        
	    }
	  
	  public static boolean matchBracket(char exp1, char exp2) {
		  if(exp1 == '{' && exp2 == '}')
			  return true;
		  if(exp1 == '[' && exp2 == ']')
			  return true;
		  if(exp1 == '(' && exp2 == ')') 
			  return true;
		  else 
			  return false;
	  }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int a0 = 0; a0 < t; a0++) {
	            String expression = in.next();
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	        }
	    }

}
 