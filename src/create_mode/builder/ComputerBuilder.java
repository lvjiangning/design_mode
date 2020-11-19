package create_mode.builder;

/**
 * 抽象构建者类
 *
 * @author： lvjiangning
 * @Date 2020/11/19 15:24
 */
public abstract class ComputerBuilder {
	public abstract void setUsbCount();

	public abstract void setKeyboard();

	public abstract void setDisplay();

	public abstract ComputerTwo getComputer();
}
