package unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chap1test {

	@Test
	public void Test() {
		Chap1 junit = new Chap1();
		int result = junit.add(100, 200);
		assertEquals(300, result);
		
	}

}
