package leetCode;

import java.util.Stack;

public class EvaluateExpression {

/*	Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. Each operand may be an integer or another expression. For example:

		  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
		  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
	*/
	
	public static int evaluate(String[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0 ;i< arr.length ; i++ ) {
			if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("/") ||arr[i].equals("*")) {
				int j = stack.pop();
				int k= stack.pop();
				//System.out.println(j + " " + k + " " + arr[i]);
                switch(arr[i]) {
                 case "+":
                   stack.push(j+k);
                   break;
                 case "-":
              	   stack.push(k-j);
              	   break;
                 case "*":
              	   stack.push(j*k);
              	   break;
                 case "/":
              	   stack.push(k/j);
              	   break;
                }
                
             
			}else {
			//	System.out.println("parse " +  Integer.parseInt(arr[i]));
				stack.push(Integer.parseInt(arr[i]));
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr =  {"2", "1", "+", "3", "*"};
		String[] arr1 =  {"4", "13", "5", "/", "+"};
		System.out.println(evaluate(arr));
		System.out.println(evaluate(arr1));

	}

}
