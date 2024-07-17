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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.7.1.169/')

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8_1'), 
    'RAIVpflpDOg=')

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management'))

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Kontrak Harga Satuan'))

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/td_Test'))

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit'))

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/td_Test_1'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/td_Testing'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Nama_p-input-text-cstm ng-untouched n_c18f1c'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/input_jumlah_integeronly'), 
    '100,000')

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Keterangan_judulKontrak'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Simpan dan Keluar'))

WebUI.click(findTestObject('Object Repository/Test Edit Daftar Termin (Form Kontrak Harga Satuan)/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Simpan'))

WebUI.closeBrowser()

