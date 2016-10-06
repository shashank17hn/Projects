package weak_hashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Data,Integer> map1 = new WeakHashMap<>();
		
		map1.put(new Data(1,"abc"), 100);
		map1.put(new Data(2,"bbc"), 200);
		map1.put(new Data(3,"dbc"), 300);
		map1.put(new Data(4,"ebc"), 400);            // all 4 are weak reference and after gc they will be gone
		
		Data d1 = new Data(5,"test");               // this is strong reference and after gc it wont be deleted
		map1.put(d1, 500);
		
		System.out.println(map1.size());
		
		System.gc();
		
		System.out.println(map1.size());

	}


}

class Data
{
	int id;
	String name;

	Data(int id , String name)
	{
		this.id= id;
		this.name= name;
	}
	
}
