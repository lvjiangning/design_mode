package create_mode.factory.factory_method;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/17 14:53
 */
public class Factory1 implements IFactory {

	@Override
	public Product product() {
		ConcreteProduct1 concreteProduct1 = new ConcreteProduct1();
		concreteProduct1.product();
		return concreteProduct1;
	}
}
