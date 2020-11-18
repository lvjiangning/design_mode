package create_mode.singleton;

/**
 * 枚举单例
 *
 * @author： lvjiangning
 * @Date 2020/11/18 14:29
 */
public enum EnumSinglton {
	INSTANCE;

	public void doSomething() {
		System.out.println("单例枚举");
	}
}
