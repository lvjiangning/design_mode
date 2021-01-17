package create_mode.builder;

/**
 * 抽象构建者类
 * 抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
 * @author： lvjiangning
 * @Date 2020/11/19 15:24
 */
public abstract class ComputerBuilder {
	public abstract void setUsbCount();

	public abstract void setKeyboard();

	public abstract void setDisplay();

	public abstract ComputerTwo getComputer();
}
