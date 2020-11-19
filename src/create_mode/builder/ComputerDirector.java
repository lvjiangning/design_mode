package create_mode.builder;

/**
 * 指导者类（Director）
 *
 * @author： lvjiangning
 * @Date 2020/11/19 15:40
 */
public class ComputerDirector {
	public void makeComputer(ComputerBuilder builder) {
		builder.setUsbCount();
		builder.setDisplay();
		builder.setKeyboard();
	}
}
