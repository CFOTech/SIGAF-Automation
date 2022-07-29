import org.sikuli.script.*
import com.kms.katalon.core.util.KeywordUtil

Process p = Runtime.getRuntime().exec('cmd /c start iexplore "jnlp://oraformsab02.hacienda-gcba.gov.ar:9001/forms/frmservlet?config=SIGQACFO"')

Screen screen = new Screen()

screen.wait(new Pattern(pathImagen('inpUsuario.png')).similar(0.90).targetOffset(-10, -2), 25)

screen.type(new Pattern(pathImagen('inpUsuario.png')).similar(0.90).targetOffset(-10, -2), 'grafigna')

screen.type(new Pattern(pathImagen('inpPassword.png')).similar(0.90).targetOffset(-13, -4), 'sigaf2022')

screen.click(new Pattern(pathImagen('ddlPerfil.png')).similar(0.90).targetOffset(152, 0))

screen.click(pathImagen('optionOrganoRector.png'))

screen.click(pathImagen('btnAceptar.png')) 

//METODO AUXILIAR
def pathImagen(String nombreimagen) {
	def path = System.getProperty('user.dir') + '\\Image Repository\\Login\\'

	nombreimagen = (path + nombreimagen)

	KeywordUtil.logInfo('ruta imagen: ' + nombreimagen)

	return nombreimagen
}


