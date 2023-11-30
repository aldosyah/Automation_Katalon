import static common.CO.cari
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com')

WebUI.setText(cari('//input[@id="email"]'), '081275265014')

WebUI.setText(cari('//input[@type="password"]'), 'cvmuda200721')

WebUI.click(cari('//button[@name="login"]'))

WebUI.click(cari('//input[@placeholder="Cari di Facebook"]'))

WebUI.setText(cari('//input[@placeholder="Cari di Facebook"]'), 'Alisha Syazani')

WebUI.click(cari('(//div[@role="none"])[2]'))

WebUI.click(cari("(//span[text()='Tambah teman'])[1]"))


















