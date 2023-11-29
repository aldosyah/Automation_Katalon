import static common.CO.cari
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shopee.co.id/')

WebUI.click(cari('//*[text()="Log In"]'))

WebUI.setText(cari('//input[@placeholder="No. Handphone/Username/Email"]'), 'aldosyahputra0211@gmail.com')

WebUI.setText(cari('//input[@type="password"]'), '*******')

WebUI.click(cari('//button[text()="Log in"]'))

WebUI.setText(cari('//input[@class="shopee-searchbar-input__input"]'), 'MOSSDOOM Tas Wanita Tas Selempang Tas Totebag Wanita Model Terbaru')

WebUI.click(cari('//button[@type="button"]'))

WebUI.click(cari('//div[@class="WwF6Lx UyR08F"]'))

WebUI.click(cari('//button[@aria-label="Apricot"]'))

WebUI.click(cari('//button[text()="beli sekarang"]'))

WebUI.click(cari('//span[text()="checkout"]'))

WebUI.click(cari('//button[text()="COD"]'))

WebUI.click(cari('//button[text()="Buat Pesanan"]'))




