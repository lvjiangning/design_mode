package structure_mode.proxy.static_proxy;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/20 14:47
 */
public class Test {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		Proxy proxy = new Proxy(concreteSubject);
		proxy.requset();
	}
}
