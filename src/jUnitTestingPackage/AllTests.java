//PRIYA GANDHI
//E19CSE291

package jUnitTestingPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAddnumbers.class, testAddStrings.class })
public class AllTests {

}
