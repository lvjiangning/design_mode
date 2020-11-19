package create_mode.builder;

/**
 * 联想电脑构建者类
 *
 * @author： lvjiangning
 * @Date 2020/11/19 15:39
 */
public class LenovoComputerBuilder extends ComputerBuilder {
	private ComputerTwo computer;
	public LenovoComputerBuilder(String cpu, String ram) {
		computer=new ComputerTwo(cpu,ram);
	}
	@Override
	public void setUsbCount() {
		computer.setUsbCount(4);
	}
	@Override
	public void setKeyboard() {
		computer.setKeyboard("联想键盘");
	}
	@Override
	public void setDisplay() {
		computer.setDisplay("联想显示器");
	}
	@Override
	public ComputerTwo getComputer() {
		return computer;
	}
}