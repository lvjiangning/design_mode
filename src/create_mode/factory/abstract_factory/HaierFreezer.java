package create_mode.factory.abstract_factory;

/**
 * 海尔冰箱
 *
 * @author： lvjiangning
 * @Date 2020/11/18 10:29
 */
public class HaierFreezer implements ProductFreezer {

	@Override
	public void product() {
		System.out.println("生产海尔牌冰箱。。。");
	}
}
