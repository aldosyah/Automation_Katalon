import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


ResponseObject response1 = WS.sendRequest(findTestObject('Object Repository/API/CREATE'))
WS.comment(response1.getResponseBodyContent())


ResponseObject response2 = WS.sendRequest(findTestObject('Object Repository/API/CREATE'))
WS.comment(response2.getResponseBodyContent())