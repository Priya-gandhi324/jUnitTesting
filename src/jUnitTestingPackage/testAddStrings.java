//PRIYA GANDHI
//E19CSE291

package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstr = new jUnitFunction();
		String result = junitstr.addStrings("Open ", "Bennett University");
		
		assertEquals("Open Bennett University", result);
	}

}
