package create_mode.singleton;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/18 10:50
 */
public class test {
	/**
	 * 懒汉测试
	 *
	 * @param args
	 */
	/*public static void main(String[] args) {
		// LazySingleton instance = LazySingleton.getInstance();
		// System.out.println(instance);
		new Thread(new Runnable() {
			@Override
			public void run() {
				LazySingleton instance =	LazySingleton.getInstance();
				System.out.println(instance);
			}
		}).start();


		new Thread(new Runnable() {
			@Override
			public void run() {
				LazySingleton instance =	LazySingleton.getInstance();
				System.out.println(instance);
			}
		}).start();
	}*/

	//饿汉测试
	/*public static void main(String[] args) {
         new Thread(new Runnable() {
			 @Override
			 public void run() {
				 HungrySinglton instance = HungrySinglton.getInstance();
				 System.out.println(instance);
			 }
		 }).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				HungrySinglton instance = HungrySinglton.getInstance();
				System.out.println(instance);
			}
		}).start();

	}*/
	public static void main(String[] args) {
		EnumSinglton.INSTANCE.doSomething();
	}

}
