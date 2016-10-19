package Lesson_input;

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String mystring = "hello " + " world";
int a = mystring.length();
System.out.println(a);
String upercase = mystring.toUpperCase();
System.out.println(upercase);
System.out.println(mystring.replace('e', 'o'));
System.out.println(mystring.indexOf('o'));

Test jack = new Test();
jack.setAge(20);
jack.setName("jack");
jack.setId(1);
System.out.println(jack.id +" is" + jack.age +  "good" +jack.name);


Test jack2 = new Test();
jack2.age =400;
jack2.name = "jack123";
jack2.id=2;
System.out.println(jack2.id +" is" + jack2.age +  "good" +jack2.name);

	}

}
