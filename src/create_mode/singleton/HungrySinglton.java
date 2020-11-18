package create_mode.singleton;

/**
 * 饿汉式
 *
 * @author： lvjiangning
 * @Date 2020/11/18 11:31
 */
public class HungrySinglton {
	private static final HungrySinglton instance = new HungrySinglton();

	private HungrySinglton() {
	}

	;

	public static HungrySinglton getInstance() {
		return instance;
	}


}
