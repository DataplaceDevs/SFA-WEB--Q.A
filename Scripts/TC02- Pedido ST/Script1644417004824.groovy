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

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/i_R15,90_fas fa-edit text-primary m-auto'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R15,00'), 'R$ 15,00')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'), '1')

sleep(100)

WebUI.sendKeys(findTestObject('Object Repository/Page_Dataplace SFA/input_Quantidade_quantidade'), Keys.chord(Keys.TAB))

//WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/input_Descontos_485a4171-3e90-4043-ae52-e67_f5dd22'),
	//'10,00')

//WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/input_R_precoLiquido'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/div_R13,50'), 'R$ 15,00')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/i_Cancelar_fas fa-check text-success'))

WebUI.closeBrowser()
