package tool
import java.awt.*
import java.awt.datatransfer.*
import java.awt.event.InputEvent
import java.awt.event.KeyEvent
import com.kms.katalon.core.annotation.Keyword


public class robot {
	Robot robot = new Robot()

	/**
	 * Click izquierdo por offset(x,y) 
	 * @param x - coordenada en la posicion x
	 * @param y - coordenada en la posicion y
	 */
	@Keyword
	def click(int x, int y) {
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	/**
	 * Escribe un texto por offset(x,y)
	 * @param x - coordenada en la posicion x
	 * @param y - coordenada en la posicion y
	 * @param text - string a escribir
	 */
	@Keyword
	def type(int x, int y, String text) {
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	/**
	 * Click izquierdo por offset(x,y)
	 * @param x - coordenada en la posicion x
	 * @param y - coordenada en la posicion y
	 */
	@Keyword
	def doubleClick(int x, int y) {
		robot.mouseMove(x, y);
		// primer click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		// segundo click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
