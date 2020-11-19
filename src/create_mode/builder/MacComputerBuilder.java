package create_mode.builder;

/**
 * 苹果电脑构建者类
 *
 * @author： lvjiangning
 * @Date 2020/11/19 15:36
 */
public class MacComputerBuilder extends ComputerBuilder {
	private ComputerTwo computer;

	public MacComputerBuilder(String cpu, String ram) {
		computer = new ComputerTwo(cpu, ram);
	}

	@Override
	public void setUsbCount() {
		computer.setUsbCount(2);
	}

	@Override
	public void setKeyboard() {
		computer.setKeyboard("苹果键盘");
	}

	@Override
	public void setDisplay() {
		computer.setDisplay("苹果显示器");
	}

	@Override
	public ComputerTwo getComputer() {
		return computer;
	}
}