package sum234;

import java.util.HashMap;
import java.util.Map;

public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {2, 7, 11, 15};
		int target = 18;
		int counter =0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i =0; i<numbers.length ; i++) {
			counter++;
			if(map.containsKey(numbers[i])) {
				System.out.println(numbers[i] + "," + map.get(numbers[i]));
				System.out.println(" comp: " + counter);
			}else {
				map.put(target-numbers[i], numbers[i]);
			}
		}
		
	}

}
