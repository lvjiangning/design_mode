package create_mode.factory.abstract_factory;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2020/11/18 10:30
 */
public class HaierWasher implements ProductWasher {
	@Override
	public void product() {
		System.out.println("生产海尔牌洗衣机。。。。");
	}
}
