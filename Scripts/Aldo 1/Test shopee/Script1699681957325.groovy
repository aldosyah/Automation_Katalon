import static common.CO.cari

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(cari("//a[@id='btn-make-appointment']"))

WebUI.setText(cari("//input[@id='txt-username']"), 'John Doe')

WebUI.setText(cari("//input[@name='password']"), 'ThisIsNotAPassword')

WebUI.click(cari("//button[@id='btn-login']"))








