package tool
import org.sikuli.script.FindFailed
import org.sikuli.script.Pattern
import org.sikuli.script.Region
import org.sikuli.script.Screen
import org.sikuli.script.*
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil


public class sikuli {
	static String path = System.getProperty("user.dir") + "\\Image Repository\\"

	Screen screen = new Screen()
	Region region = new Region()

	def String pathImagen(String nombreimagen) {
		nombreimagen = path + nombreimagen + ".png"
		KeywordUtil.logInfo("ruta imagen: " + nombreimagen)
		return nombreimagen
	}

	/**
	 * Click izquierdo sobre el objeto presente en la imagen
	 * @param imagen - nombre de la imagen
	 */
	@Keyword
	def click(String imagen) {
		def match = screen.exists(new Pattern(pathImagen(imagen)).similar(0.9),15)
		if (match) {
			screen.click(pathImagen(imagen))
		}
	}

	/**
	 * Doble click izquierdo sobre el objeto presente en la imagen
	 * @param imagen - nombre de la imagen
	 */
	@Keyword
	def doubleClick(String imagen) {
		def match = screen.exists(new Pattern(pathImagen(imagen)).similar(0.9),15)
		if (match) {
			screen.doubleClick(pathImagen(imagen))
		}
	}

	/**
	 * Escribe un texto
	 * @param nombreimagen
	 * @param txt
	 * @throws FindFailed
	 */
	@Keyword
	def type(String imagen,String txt) throws FindFailed {
		def match = screen.exists(new Pattern(pathImagen(imagen)).similar(0.9),15)
		if (match) {
			screen.click(pathImagen(imagen))
			screen.type(txt)
		}
	}
	/**
	 * Click izquierdo por posicion
	 * @param imagen - nombre de la imagen
	 */
	@Keyword
	def clickLocation(int x, int y) {
		def location = new Location(x,y)
		screen.click(location)
	}	
	
}
