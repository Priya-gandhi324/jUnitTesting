//PRIYA GANDHI
//E19CSE291

package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddnumbers {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result1 = junit.addNumbers(162, 204);
		
		assertEquals(366, result1);
	}

}
