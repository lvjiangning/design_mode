package structure_mode.proxy.dynamic_proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 写点注释吧
 *
 * @author： lvjiangning
 * @Date 2021/1/16 21:26
 */
public class MeiPo  implements MethodInterceptor {


    /**
     * 创建代理实例
     * @return
     */
    public   Object instance(ZhangSan person){
        try {
            Enhancer enhancer=new Enhancer();
            /**
             * 要将哪个类作为此代理类的父类
             */
            enhancer.setSuperclass(person.getClass());
            enhancer.setCallback(this);
            return enhancer.create();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是cglib媒婆，你有什么需要");
        //调用被代理对象的具体方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("美女大大的有");
        return null;
    }
}
