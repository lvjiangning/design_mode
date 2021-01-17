package create_mode.factory.factory_method;

/**
 * 工厂方法模式由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成。本节来分析其基本结构和实现方法。
 * 一个产品就需要创建2个类，1一个工厂类，一个具体产品类，比较麻烦，创建的产品多了，会类爆炸
 *
 * @author： lvjiangning
 * @Date 2020/11/17 14:56
 */
public class test {
	public static void main(String[] args) {
		IFactory factory = new Factory2();
		factory.product();

	}
}
