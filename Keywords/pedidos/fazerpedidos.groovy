package pedidos

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class fazerpedidos {
    @Keyword
	public void getPedido() {
		int a = 1;
		for(int i=0; i<2;i++) {
			if(a == 2) {
				WebUI.navigateToUrl('http://172.16.1.21:7802/pt/account/login?returnUrl=%2Fpedidos')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Senha_senha'), 'jw4WcLaXFlY11XvFqQzQmQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/input_Senha_senha'), 'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Cadastrar pedido'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Cliente_clienteId'), 'premium')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Premium RS - Premium RS - 37908809000126'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido'), 'Vendas_ST')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido'), 'Vendas_St')

WebUI.sendKeys(findTestObject('Object Repository/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/a_Editar detalhes do pedido_bg-success floa_925a26'), 
    '')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Dataplace SFA/a_Editar detalhes do pedido_bg-success floa_925a26'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/a_Editar detalhes do pedido_bg-success floa_925a26'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Produto_typeahead-produto'), '8029ST')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_COIFA CAIXA DIREAO a - 8029ST'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Produto_typeahead-produto'), '8029ST')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Confirmar'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/div_Gerar Pedido'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/button_Confirmar'))
			}else {
				System.out.println("A condição é falsa")
			}
		}
	}
}