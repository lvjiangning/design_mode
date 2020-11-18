package create_mode.factory.abstract_factory;

/**
 * 抽象工厂
 */
public interface AbstractFactory {

	/**
	 * 冰箱
	 *
	 * @return
	 */
	ProductFreezer freezer();

	/**
	 * 洗衣机
	 *
	 * @return
	 */
	ProductWasher washer();
}
