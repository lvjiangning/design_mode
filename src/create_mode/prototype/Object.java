package create_mode.prototype;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/18 15:08
 */
public class Object implements Cloneable, Serializable {

	public Map map;

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	@Override
	protected java.lang.Object clone() throws CloneNotSupportedException {
		Object objectB = (Object) super.clone();
		return objectB;
	}
}
