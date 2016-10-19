package unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		Chap1 junit = new Chap1();
		String result = junit.concat("Hello","World");
	    assertEquals("HelloWorld" , result);
	}

} 
