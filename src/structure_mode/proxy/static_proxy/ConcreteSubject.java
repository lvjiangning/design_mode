package structure_mode.proxy.static_proxy;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/20 14:44
 */
public class ConcreteSubject implements Subject {
	@Override
	public void requset() {
		System.out.println("我是ConcreteSubject");
	}
}
