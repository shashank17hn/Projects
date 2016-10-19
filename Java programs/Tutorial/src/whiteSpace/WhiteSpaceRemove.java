package whiteSpace;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		
		String  s = "Hello world      how are you";
		char[] temp;
		temp = s.toCharArray();
		String s2 = s.replaceAll("\\s", "");      // method 1
		System.out.println(s);
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer();
		String s3="";
		
		for(int i=0; i< temp.length;i++)
		{
			if((temp[i] != ' ') && (temp[i]!= '\t' ))
			{
				sb.append(temp[i]);
				
			}
		}
		System.out.println(sb);
		
		

	}

}
