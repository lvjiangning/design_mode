package create_mode.factory.simple_factory_pattern;

/**
 * 简单工厂方法
 *
 * @author： lvjiangning
 * @Date 2020/11/17 14:08
 */
public class Test {
	public static void main(String[] args) {
		Product product = SimpleFactory.fatoryMethod(1);
		product.product();

	}
}
