package create_mode.prototype;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 我是对象Object。。
 * <p>
 * 　　就输出一次，这里可以证明对象拷贝的时候构造函数是不会执行的，原因在于拷贝是直接在堆中进行，这其实也可以理解，new的时候，
 * JVM要走一趟类加载流程，这个流程非常麻烦，
 * 在类加载流程中会调用构造函数，最后生成的对象会放到堆中，而拷贝就是直接拷贝堆中的现成的二进制对象，然后重新一个分配内存块。
 *
 * @author： lvjiangning
 * @Date 2020/11/18 15:11
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Object object = new Object();
		Map<String, Object> map = new HashMap<>();
		map.put("11", object);
		object.setMap(map);
		System.out.println(object.getMap());
		//浅拷贝
		// object.clone();
		// System.out.println(object.map);

		//深拷贝
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(object);

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		Object object1 = (Object) objectInputStream.readObject();
		System.out.println(object1.getMap());
	}
}
