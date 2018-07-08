package largestRectangleInHistogram;

import java.util.Stack;

public class LargestRectangleInAHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {2,1,5,6,2,3};
		//int[] height = {6, 2, 5, 4, 5, 1, 6}; 
		calLargestArea(height);
	}
	
	public static void calLargestArea(int[] height) {
		
		Stack<Integer> stack = new Stack<>();
		int i =0;
		int max=0;
		while(i < height.length) {
			if(stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			}
			else {
				int p = stack.pop();
				int h = height[p];
				int w = stack.empty() ? i :i- stack.peek()-1;
				max = Math.max(max, h*w);
			}
		}
		
	
		while(!stack.empty()) {
			int p = stack.pop();
			int h = height[p];
			int w = stack.empty() ? i : i-stack.peek()-1;
			max = Math.max(max, h*w);
		}
		System.out.println(max);
	}


}
