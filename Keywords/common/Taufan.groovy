package common

import static common.CO.cari

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.keyword.excel.ExcelKeywords

public class Taufan {
	public static String nama = 'Muhamad Taufan'
	public static String fileExcel =  'taufa.xlsx'
	public static def sheet
	public static def workbook
	
	public static void bikinexcel() {
//		WebUI.click(cari("//a[@id='btn-make-appointment']"))
		ExcelKeywords.createExcelFile(fileExcel)
		workbook = ExcelKeywords.getWorkbook(fileExcel)
		sheet  = ExcelKeywords.getExcelSheet(workbook, fileExcel)
	}
	
	
	public static void openBrowser() {
		WebUI.verifyElementNotVisible(null)
		ExcelKeywords.setValueToCellByAddress(sheet, 'A2', '1')
		ExcelKeywords.setValueToCellByAddress(sheet, 'B2', 'Membuka Browser')
		ExcelKeywords.setValueToCellByAddress(sheet, 'C2', '')
		ExcelKeywords.setValueToCellByAddress(sheet, 'D2', '')
		ExcelKeywords.setValueToCellByAddress(sheet, 'E2', 'Passed')
		ExcelKeywords.saveWorkbook(fileExcel, workbook)
	}
	
	
	public static void Pekerjaan() {
		WS.comment('saya kerja di jakarta')
		WS.comment('saya kerja di bri')
		WS.comment('saya kerja sebaga qa')
		WS.comment('Nama saya adalah ' + nama)
		WS.comment('haha')
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		
		WebUI.click(cari("//a[@id='btn-make-appointment']"))
		
		WebUI.setText(cari("//input[@id='txt-username']"), 'John Doe')
		
		WebUI.setText(cari("//input[@name='password']"), 'ThisIsNotAPassword')
		
		WebUI.click(cari("//button[@id='btn-login']"))
	}
}
