package sets;

import java.util.HashSet;
import java.util.Set;

public class Set_Impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		
		System.out.println("using lambda expressions");
		set.forEach(x->{
			System.out.println(x);
		});
		
		System.out.println("using stream api");
		set.stream().forEach(x->System.out.println(x));
		
		
		System.out.println(set.stream().filter(x -> x == 5).findAny().isPresent());

	}

}
