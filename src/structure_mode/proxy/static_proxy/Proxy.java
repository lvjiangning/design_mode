package structure_mode.proxy.static_proxy;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/20 14:46
 */
public class Proxy implements Subject {

	private Subject object; //被持有的对象

	public Proxy(Subject object) {
		this.object = object;
	}

	@Override
	public void requset() {
		System.out.println("我是增强代理类。。。");
		object.requset();
	}
}
