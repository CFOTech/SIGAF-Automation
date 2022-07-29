import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext

import internal.GlobalVariable

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		//GlobalVariable.currentTestCaseId = testCaseContext.getTestCaseId()
		GlobalVariable.anioActual = LocalDate.now().format(DateTimeFormatter.ofPattern('yyyy'))
		GlobalVariable.fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern('dd/MM/yyyy'))
	}

}