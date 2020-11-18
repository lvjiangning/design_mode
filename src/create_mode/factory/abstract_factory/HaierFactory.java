package create_mode.factory.abstract_factory;

/**
 * 海尔工厂
 *
 * @author： lvjiangning
 * @Date 2020/11/18 10:27
 */
public class HaierFactory implements AbstractFactory {


	@Override
	public ProductFreezer freezer() {
		return new HaierFreezer();
	}

	@Override
	public ProductWasher washer() {
		return new HaierWasher();

	}
}
