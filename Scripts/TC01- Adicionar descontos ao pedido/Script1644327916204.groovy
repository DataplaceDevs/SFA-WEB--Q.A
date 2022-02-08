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

WebUI.navigateToUrl('http://172.16.1.21:7802/pt/account/login?returnUrl=%2Fpedidos')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Senha_senha'), 'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_1631'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/button_R54,00_minibutton btn default-btn bt_b87cf5'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R30,00'), 'R$ 30,00')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'), quantidade)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_fb9397a8-264c-4fa4-b5d5-0ab_150c4b'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_fb9397a8-264c-4fa4-b5d5-0ab_150c4b'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_fb9397a8-264c-4fa4-b5d5-0ab_150c4b'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_fb9397a8-264c-4fa4-b5d5-0ab_150c4b'), 
    descontos)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'))

sleep(500)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R27,00'), total)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Confirmar'))

