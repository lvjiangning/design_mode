package create_mode.builder;

/**
 * 目标产品
 *
 * @author： lvjiangning
 * @Date 2020/11/19 15:22
 */
public class ComputerTwo {
	private String cpu;//必须
	private String ram;//必须
	private int usbCount;//可选
	private String keyboard;//可选
	private String display;//可选

	public ComputerTwo(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

	public void setUsbCount(int usbCount) {
		this.usbCount = usbCount;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "Computer{" +
				"cpu='" + cpu + '\'' +
				", ram='" + ram + '\'' +
				", usbCount=" + usbCount +
				", keyboard='" + keyboard + '\'' +
				", display='" + display + '\'' +
				'}';
	}

}
