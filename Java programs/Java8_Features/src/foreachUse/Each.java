package foreachUse;

import java.util.ArrayList;

public class Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int loop[] = {1,2,3,4};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(i->System.out.println(i));
		
		

	}

}
