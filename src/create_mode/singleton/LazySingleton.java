package create_mode.singleton;

/**
 * 懒汉模式
 *
 * @author： lvjiangning
 * @Date 2020/11/18 10:47
 */
public class LazySingleton {
	private static LazySingleton instance;

	/**
	 * 避免被外部实例化
	 */
	private LazySingleton() {
	}

	public synchronized static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}

