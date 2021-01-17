package structure_mode.proxy.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2021/1/16 21:26
 */
public class MeiPo  implements InvocationHandler {
    /**
     * jdk代理类需要持有被代理类的对象
     * cglib不需要
     */
    private Person target;

    /**
     * 创建代理实例
     * @return
     */
    public   Object instance(Person person){

        try {
            this.target=person;
            Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
            return o;
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是jdk媒婆，你有什么需要");
        //调用被代理对象的具体方法
        method.invoke(this.target,args);
        System.out.println("美女大大的有");
        return null;
    }
}
