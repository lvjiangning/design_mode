package create_mode.builder;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/19 15:15
 */
public class Test {
	public static void main(String[] args) {
		//变种的建造模式
		Computer build = new Computer.Builder("英特尔", "三星").setDisplay("三星").setKeyboard("自己品牌").build();

		//经典的建造模式
		ComputerDirector director = new ComputerDirector();//1
		ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");//2
		director.makeComputer(builder);//3
		ComputerTwo macComputer = builder.getComputer();//4
		System.out.println("mac computer:" + macComputer.toString());

		ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("I7处理器", "海力士222");
		director.makeComputer(lenovoBuilder);
		ComputerTwo lenovoComputer = lenovoBuilder.getComputer();
		System.out.println("lenovo computer:" + lenovoComputer.toString());

	}
}
