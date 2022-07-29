import java.time.LocalDate as LocalDate
import org.sikuli.script.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable

Screen screen = new Screen()

screen.wait(new Pattern(pathImagen('inpEjercicio.png')).targetOffset(46, -2), 10)

screen.type(new Pattern(pathImagen('inpEjercicio.png')).targetOffset(46, -2), GlobalVariable.anioActual)

screen.type(new Pattern(pathImagen('inpTipoDeAJuste.png')).targetOffset(47, 0), 'LEY')

screen.type(new Pattern(pathImagen('inpActuacionOrigen.png')).targetOffset(50, 0), 'LEY')

screen.type(new Pattern(pathImagen('inpTipoActuacion.png')).targetOffset(47, -1), 'LEY')

screen.type(new Pattern(pathImagen('inpNormaAprobatoria.png')).targetOffset(50, -1), '28')

screen.type(new Pattern(pathImagen('inpMotivo.png')).targetOffset(22, -1), 'G')

screen.type(new Pattern(pathImagen('inptNroActOrigen.png')).similar(0.90).targetOffset(15, -22), '123')

screen.type(new Pattern(pathImagen('inpOfiActOrigen.png')).similar(0.90).targetOffset(-52, -24), '123')

screen.type(new Pattern(pathImagen("inpAnioActOrigen.png")).similar(0.80).targetOffset(-35,-40),'2022')

screen.type(new Pattern(pathImagen('inpNroTipoAct.png')).similar(0.89).targetOffset(23, -15), '123')

screen.type(new Pattern(pathImagen('inpOfiTipoAct.png')).similar(0.90).targetOffset(-57, -18), '123')

screen.type(new Pattern(pathImagen('inpAnioTipoAct.png')).similar(0.85).targetOffset(-46, -17), '2022')

screen.type(new Pattern(pathImagen('inpNroNormaAprob.png')).similar(0.89).targetOffset(21, -14), '123')

screen.type(new Pattern(pathImagen('inpOfiNormaAprob.png')).similar(0.86).targetOffset(-56, -11), '123')

screen.type(new Pattern(pathImagen('inpAnioNormaAprob.png')).similar(0.90).targetOffset(-32, -7), '2022')

screen.type(new Pattern(pathImagen('inpFechaActOrigen.png')).similar(0.81).targetOffset(30, -24), '28/07/2022')

screen.type(new Pattern(pathImagen('inpFechaTipoAct.png')).similar(0.85).targetOffset(29, -16), '28/07/2022')

screen.type(new Pattern(pathImagen('inpFechaNormaAprob.png')).similar(0.81).targetOffset(28, -10), '28/07/2022') 


//screen.click(pathImagen('btnGuardar.png'))


//METODO AUXILIAR

def pathImagen(String nombreimagen) {
    def path = System.getProperty('user.dir') + '\\Image Repository\\CompletarCamposAltaMP\\'

    nombreimagen = (path + nombreimagen)

    KeywordUtil.logInfo('ruta imagen: ' + nombreimagen)

    return nombreimagen
}