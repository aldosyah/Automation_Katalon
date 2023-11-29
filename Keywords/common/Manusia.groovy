package common

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static common.CO.cari

public class Manusia {
	String umur
	String alamat
	String noTelp
	String nama
	
	Manusia (String nama) {
		this.nama = nama
	}
	
	String diSapa() {
		WS.comment("sapa balik")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		
		WebUI.click(cari("//a[@id='btn-make-appointment']"))
		
		WebUI.setText(cari("//input[@id='txt-username']"), 'John Doe')
		
		WebUI.setText(cari("//input[@name='password']"), 'ThisIsNotAPassword')
		
		WebUI.click(cari("//button[@id='btn-login']"))
		return "ngapain di sapa"
	}
	
}
