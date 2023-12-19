import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

ResponseObject respon1 = WS.sendRequest(findTestObject('Object Repository/API/POST sw'))
WS.comment(respon1.getResponseBodyContent())

ResponseObject respon2 = WS.sendRequest(findTestObject('Object Repository/API/CREATE'))
WS.comment(respon2.getResponseBodyContent())

ResponseObject respon3 = WS.sendRequest(findTestObject('Object Repository/API/LIST USERS'))
WS.comment(respon3.getResponseBodyContent())