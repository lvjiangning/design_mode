package create_mode.singleton;

/**
 * 双重锁
 *
 * @author： lvjiangning
 * @Date 2020/11/18 11:38
 */
public class DoubleCheck {
	private static DoubleCheck instance;

	private DoubleCheck() {
	}

	public static DoubleCheck getInstance() {
		if (instance == null) {
			synchronized (DoubleCheck.class) {
				if (instance == null) {
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}
}
