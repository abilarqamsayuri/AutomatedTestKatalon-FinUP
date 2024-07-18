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

WebUI.setText(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8'), 
    'admin')

WebUI.takeFullPageScreenshot()

WebUI.setEncryptedText(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8_1'), 
    'RAIVpflpDOg=')

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management'))

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Tanpa Kontrak'))

WebUI.takeFullPageScreenshot()

WebUI.enhancedClick(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/td_Test'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No Surat_p-input-text-cstm ng-untouch_c6ece5'), 
    '02')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No Surat_vendor2'), 
    '02')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Total Harga_integeronly'), 
    '1,000,000')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Total Harga_integeronly'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Desk Kontrak_deskkontrak'), 
    'Tester')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.takeFullPageScreenshot()

WebUI.doubleClick(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/td_MALANG'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/button_'))

WebUI.takeFullPageScreenshot()

WebUI.doubleClick(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/td_AINA SAFITRI'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Non Kontrak/Test Edit Daftar Non Kontrak/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Simpan'))

WebUI.takeFullPageScreenshot()

