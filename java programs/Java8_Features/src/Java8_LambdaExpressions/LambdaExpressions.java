package Java8_LambdaExpressions;


interface A
{
  void show();	
}

/*class XYZ implements A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This class is just creaed to use the unimplemented method of interface");
	}
	
	
}*/

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		A obj = new XYZ();
		obj.show();         // 1 way which is useless because an extra class is defined.
		
		A obj1 = new A(){

			@Override
			public void show() {  // 2 way is better then 1 but still in file section one more class is created with LambdaExpressions$1 since this is anonymous class  
			
             System.out.println("This is anonymous class to implement interface methods");
				
			}
			
		};
		
		
		// 3 way is best lambda expression it doesnt create extra class  and been implemented the unimplemented expressions
		A obj2 = ()-> System.out.printf("Hello from Lamba Expression");*/
		
		A obj3 = () -> {
			
			System.out.println("Hello from Lamba Expression line 1 ");
			System.out.println("Hello from Lamba Expression line 2");
			
		};
		
		obj3.show();
		
	}

}
