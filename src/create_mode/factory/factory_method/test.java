package create_mode.factory.factory_method;

/**
 * 工厂方法
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
