package create_mode.factory.factory_method;

/**
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
