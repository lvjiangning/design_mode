package structure_mode.proxy.dynamic_proxy.cglib;

/**
 * 动态代理
 *
 * @author： lvjiangning
 * @Date 2021/1/16 12:06
 */
public class Test {
    public static void main(String[] args) {

        ZhangSan instance =(ZhangSan) new MeiPo().instance(new ZhangSan());
        instance.findLove();
    }
}
