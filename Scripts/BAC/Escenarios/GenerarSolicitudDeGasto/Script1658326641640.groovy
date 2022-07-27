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

WebUI.callTestCase(findTestCase('BAC/Genericos/Login'), [('user') : GlobalVariable.userSolicitante, ('password') : GlobalVariable.passSolicitante], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BAC/Genericos/CambiarUnidadEjecutora'), [('nombreUE') : '401 - MINISTERIO DE SALUD'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BAC - Sistema de compras pblicas/span_Solicitudes de gasto'))

not_run: WebUI.click(findTestObject('Page_BAC - Sistema de compras pblicas/btn_Crear Solicitud de gasto'))

not_run: WebUI.click(findTestObject('Page_BAC - Sistema de compras pblicas/popup_Advertencia'), FailureHandling.OPTIONAL)

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/CompletarDatosBasicos'), [('nombreSG') : 'QA Test', ('objetoSG') : 'Prueba automatizada'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: def nroSG = WebUI.getText(findTestObject('Page_BAC - Sistema de compras pblicas/span_nroSG'))

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/CompletarInfoBasica'), [('unidadSolicitante') : 'QA'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/CompletarItems'), [('codigoItem') : '07.01.009.0017.1', ('acondicionamiento') : 'test'
        , ('cantidad') : '1', ('empaquetamiento') : 'Caja x 12 U', ('cantEmpaquetamiento') : '1', ('precioUnitario') : '25'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/CompletarItems'), [('codigoItem') : '07.01.006.0002.6', ('acondicionamiento') : 'test'
        , ('cantidad') : '1', ('empaquetamiento') : 'Envx500g', ('cantEmpaquetamiento') : '1', ('precioUnitario') : '15'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/CompletarDetallesEntrega'), [('cantAEntregar') : '1', ('codigoItem') : '07.01.009.0017.1'
        , ('plazoEntrega') : '15'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/CompletarDetallesEntrega'), [('cantAEntregar') : '1', ('codigoItem') : '07.01.006.0002.6'
        , ('plazoEntrega') : '15'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_BAC - Sistema de compras pblicas/btn_Guardar y Volver'))

not_run: WebUI.callTestCase(findTestCase('BAC/Genericos/EnviarAlAnalista'), [:], FailureHandling.STOP_ON_FAILURE)