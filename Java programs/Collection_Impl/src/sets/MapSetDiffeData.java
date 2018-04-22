package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSetDiffeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vehical[] = {"Car" , "Boat" , "Helicopter"};
		String driver[][] = {
								{"Cabc", "Cbcd" , "Cdef"}, 
								{"Babc", "Bbcd" , "Bdef"},
								{"Habc", "Hbcd" , "Hdef"}
							};
		
		Map<String, Set<String>> map = new HashMap<>();
		
		for(int i =0 ; i < vehical.length; i++)
		{
			Set<String> set = new HashSet<>();
			for(int j=0; j< driver.length; j++)
			{
				set.add(driver[i][j]);
			}
			map.put(vehical[i], set);
		}
		
		map.entrySet().forEach(e->{
			System.out.print(e.getKey() + " : ");
			System.out.println(e.getValue());
		});
		

	}

}
