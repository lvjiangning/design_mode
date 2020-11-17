package create_mode.factory.simple_factory_pattern;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/17 11:45
 */
public class SimpleFactory {

	public static Product fatoryMethod(int type) {
		if (type == 1) {
			return new ConcreteProduct();
		}
		return new ConcreteProductTwo();

	}

}
