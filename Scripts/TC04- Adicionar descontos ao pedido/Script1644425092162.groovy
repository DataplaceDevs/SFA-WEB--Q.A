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

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_1644'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/i_R27,00_fas fa-edit text-primary m-auto'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R30,00'), 'R$ 30,00')


WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'), quantidade)

sleep(1000)
WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_0c15844e-4f91-4a1f-8d93-e67_3c7c96'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_0c15844e-4f91-4a1f-8d93-e67_3c7c96'))
System.out.println("agoraaaaa")
WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_0c15844e-4f91-4a1f-8d93-e67_3c7c96'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_0c15844e-4f91-4a1f-8d93-e67_3c7c96'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_0c15844e-4f91-4a1f-8d93-e67_3c7c96'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_0c15844e-4f91-4a1f-8d93-e67_3c7c96'), 
    desconto)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'))


WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'), preco)

System.out.println("passou por aqui")
if(WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R27,00'),  preco.multiply(quantidade))) {
	System.out.println("valor valido")
	WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Confirmar'))
	
	
}else {
	System.out.println("valor invalido")
}
WebUI.closeBrowser()

