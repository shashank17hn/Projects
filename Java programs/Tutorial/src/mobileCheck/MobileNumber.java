package mobileCheck;
import java.util.*;


class NumberCheck{
	
	public boolean checkIt(String number)
	{
		try{
			Integer.parseInt(number);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;
	}
}


public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCheck NC = new NumberCheck();
		System.out.println("Enter mobile no:");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		if(NC.checkIt(number) ==true && (number.length() ==10))
		{	
			System.out.println("number is correct");
		}
		
		else
		{
			System.out.println("number is not correct");
		}

	}

}
