import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import string.permutation.StringPermutaion;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;


class JavaInterviewTest {

	private StringPermutaion per;
	
	@BeforeEach
	void setUp() throws Exception {
		per = new StringPermutaion(); 
	}

	@Test
	void stringPermutationTest() {
		
		assertEquals(per.permutation("123").size(), 6);
		//assertEquals(per.permutation("123"), containsInAnyOrder("123", "234"));
	//	assertThat(per.permutation("123"), containsInAnyOrder("123", "234"));
		assertNotNull(per.permutation("123"));
		
		
		
	}

}
