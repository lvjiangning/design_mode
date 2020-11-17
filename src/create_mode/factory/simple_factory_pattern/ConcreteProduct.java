package create_mode.factory.simple_factory_pattern;

/**
 * 具体产品
 *
 * @author： lvjiangning
 * @Date 2020/11/17 11:43
 */
public class ConcreteProduct implements Product {

	@Override
	public void product() {
		System.out.println("具体产品。。。");
	}
}
