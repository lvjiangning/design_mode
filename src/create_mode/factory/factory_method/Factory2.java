package create_mode.factory.factory_method;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/17 14:53
 */
public class Factory2 implements IFactory {
	@Override
	public Product product() {
		ConcreteProduct2 concreteProduct2 = new ConcreteProduct2();
		concreteProduct2.product();
		return concreteProduct2;
	}
}
