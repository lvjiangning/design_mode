package create_mode.builder;

/**
 * 建造者设计模式
 *建造者（Builder）模式的定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
 * 它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。
 *
 * 该模式的主要优点如下：
 * 封装性好，构建和表示分离。
 * 扩展性好，各个具体的建造者相互独立，有利于系统的解耦。
 * 客户端不必知道产品内部组成的细节，建造者可以对创建过程逐步细化，而不对其它模块产生任何影响，便于控制细节风险。
 *
 * 其缺点如下：
 * 产品的组成部分必须相同，这限制了其使用范围。
 * 如果产品的内部变化复杂，如果产品内部发生变化，则建造者也要同步修改，后期维护成本较大。
 * @author： lvjiangning
 * @Date 2020/11/19 15:15
 */
public class Test {
	public static void main(String[] args) {
		//变种的建造模式
		Computer build = new Computer.Builder("英特尔", "三星").setDisplay("三星").setKeyboard("自己品牌").build();

		//经典的建造模式
		/**
		 * 指挥者 ：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
		 */
		ComputerDirector director = new ComputerDirector();//1
		/**
		 * 具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
		 */
		ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");//2
		/**
		 * 指挥者勾选对象细节
		 */
		director.makeComputer(builder);//3
		/**
		 * 得到具体的创建对象
		 */
		ComputerTwo macComputer = builder.getComputer();//4
		System.out.println("mac computer:" + macComputer.toString());

//		ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("I7处理器", "海力士222");
//		director.makeComputer(lenovoBuilder);
//		ComputerTwo lenovoComputer = lenovoBuilder.getComputer();
//		System.out.println("lenovo computer:" + lenovoComputer.toString());

	}
}
