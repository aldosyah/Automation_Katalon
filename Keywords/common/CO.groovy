package common

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject


public class CO {
	public static TestObject cari (String locator) {
		TestObject target  = new TestObject().addProperty('xpath', ConditionType.EQUALS, locator)
		return target
	}//import static common.CustomObject.cari
}
