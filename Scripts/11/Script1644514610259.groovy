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

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/form_LoginNome de usurio ou endereo de emai_327498'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Senha_senha'), 'i+K1X3doZYBu6F0i+9QHbg==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/div_LoginNome de usurio ou endereo de email_d83c56'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Senha_senha'), 'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_1690'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/i_R15,90_fas fa-edit text-primary m-auto'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R15,00'), 'R$ 30,00')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'), quantidade)

System.out.println(quantidade)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_f13006f7-bd1a-4c10-947c-34b_e96160'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_f13006f7-bd1a-4c10-947c-34b_e96160'), 
    desconto)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Descontos'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'), precoLiq)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R13,50'), subTotal)


if (subTotal != 'R$ 27,00'){
	System.out.println("Oops! Deu um resultado não esperado: ");
  }
  else {
	   System.out.println("OK! Passou do teste.");
}

//String quantidade = WebUI.getText(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'), FailureHandling.STOP_ON_FAILURE)
/*double desconto = getText(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_f13006f7-bd1a-4c10-947c-34b_e96160'))

System.out.println('Desconto: ', desconto)

double precoLiq = getText(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'))

System.out.println('Preço liquido: ', precoLiq)

double subTotal = WebUI.getText(findTestObject('Object Repository/Page_Dataplace SFA/div_R13,50'), 'R$ 13,50')

double verificaSubTotal = precoLiq * quantidade*/
//teste = WebUI.getText(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'))
System.out.println('passou por aqui')

/*if (verificaSubTotal == subTotal) {
    System.out.println('O cálculo do subtotal está correto!')
}*/
WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Confirmar'))

WebUI.closeBrowser()

