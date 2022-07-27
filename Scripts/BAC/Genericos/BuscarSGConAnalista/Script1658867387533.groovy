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

WebUI.callTestCase(findTestCase('BAC/Genericos/Login'), [('user') : GlobalVariable.userAnalista, ('password') : GlobalVariable.passAnalista], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BAC - Sistema de compras pblicas/ddMenu_Buscar'))

WebUI.click(findTestObject('Page_BAC - Sistema de compras pblicas/li_BuscarSG'))

WebUI.setText(findTestObject('Page_BAC - Busqueda solicitud de gasto/inp_nroSG'), nroSG)

WebUI.click(findTestObject('Page_BAC - Busqueda solicitud de gasto/btn_BuscarSG'))

WebUI.click(findTestObject('Page_BAC - Busqueda solicitud de gasto/btn_Acciones'))

WebUI.click(findTestObject('Page_BAC - Busqueda solicitud de gasto/li_EditarSG'))

