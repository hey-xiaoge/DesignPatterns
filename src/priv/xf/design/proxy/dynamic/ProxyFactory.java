package priv.xf.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理教师（动态代理、JDK代理）
public class ProxyFactory {

    private Object target; //目标对象（被代理对象）

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         * @param loader: 指定当前膜表对象使用的类加载器，获取加载器的方法固定
         * @param interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
         * @param h: 事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
         */
       return Proxy.newProxyInstance(
               target.getClass().getClassLoader(),
               target.getClass().getInterfaces(),
               new InvocationHandler() {
           @Override
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               System.out.println("动态代理开始（JDK代理）");
               //反射极致调用目标对象的方法
               Object returnVal = method.invoke(target, args);
               System.out.println("动态代理结束（JDK代理）");
               return returnVal;
           }
       });
    }
}
