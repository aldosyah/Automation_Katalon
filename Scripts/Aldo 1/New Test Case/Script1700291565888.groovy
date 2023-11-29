import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.keyword.excel.ExcelKeywords

import common.Manusia
import common.Taufan

String fileExcel =  'taufa.xlsx'

def workbook = ExcelKeywords.getWorkbook(fileExcel)
def sheet  = ExcelKeywords.getExcelSheet(workbook, fileExcel)

ExcelKeywords.setValueToCellByAddress(sheet, 'A2', '1')
ExcelKeywords.setValueToCellByAddress(sheet, '2B', 'Membuka Browser')
ExcelKeywords.setValueToCellByAddress(sheet, '2C', '')
ExcelKeywords.setValueToCellByAddress(sheet, '2D', '')
ExcelKeywords.setValueToCellByAddress(sheet, '2E', 'Passed')
ExcelKeywords.saveWorkbook(fileExcel, workbook)
asd
Taufan.bikinexcel()
Taufan.openBrowser()


jklasd

Manusia taufan = new Manusia('Muhamad Taufan')

Manusia Aldo = new Manusia('Aldo Syahputra')

WS.comment(Aldo.nama)

WS.comment(taufan.umur)

String hasilSapa = taufan.diSapa()


WS.comment(hasilSapa)

Taufan.Pekerjaan()
Taufan.Pekerjaan()
Taufan.Pekerjaan()
Taufan.Pekerjaan()
Taufan.Pekerjaan()
Taufan.Pekerjaan()
Taufan.Pekerjaan()
Taufan.Pekerjaan()