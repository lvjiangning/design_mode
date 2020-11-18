package create_mode.singleton;

/**
 * 静态内部类
 *
 * @author： lvjiangning
 * @Date 2020/11/18 14:20
 */
public class StaticInner {

	private StaticInner() {
	}

	;

	private static class staticInnerSinglton {
		private static final StaticInner instance = new StaticInner();
	}

	public static final StaticInner getInstance() {
		return staticInnerSinglton.instance;
	}

}
