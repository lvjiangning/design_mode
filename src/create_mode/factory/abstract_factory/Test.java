package create_mode.factory.abstract_factory;

/**
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
