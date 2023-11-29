import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.facebook.com/')

WebUI.setText(findTestObject('spy 1/Page_Facebook  log in or sign up/input username'), '081275265014')

WebUI.setText(findTestObject('spy 1/Page_Facebook  log in or sign up/input password'), 'cvmuda200721')

WebUI.click(findTestObject('spy 1/Page_Facebook  log in or sign up/button_Log in'))

WebUI.setText(findTestObject('spy 1/Page_Facebook/input pencarian'), 'Alisha Syazani')

WebUI.sendKeys(findTestObject('spy 1/Page_Facebook/input pencarian'), Keys.chord())

WebUI.click(findTestObject('spy 1/Page_Facebook/Page_Facebook/div_ridwan_x6s0dn4 xwnonoy x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x78zum5 xc9qbxq xl56j7k x14qfxbe'))

WebUI.click(findTestObject('spy 1/Page_Facebook/Page_Facebook/Tambahkan teman'))

WebUI.click(findTestObject('spy 1/Page_Facebook/beranda'))

WebUI.closeBrowser()

