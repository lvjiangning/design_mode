package create_mode.factory.abstract_factory;

/**
 * 抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，
 * 									且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * 缺点:如果新增一个产品，则所有的产品族工厂都需要进行更新
 *
 * @author： lvjiangning
 * @Date 2020/11/18 10:35
 */
public class Test {
	public static void main(String[] args) {
		HaierFactory haierFactory = new HaierFactory();
		haierFactory.freezer().product();
		haierFactory.washer().product();
	}
}
