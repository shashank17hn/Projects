package extra;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("the sky is blue");
		System.out.println(sb);
		sb.reverse();;
		System.out.println(sb);
		
		String[] arr = {"the", "sky" ,"is" ,"blue"};
		for(String x:arr)
		{
			System.out.println(x);
		}

	}

}
