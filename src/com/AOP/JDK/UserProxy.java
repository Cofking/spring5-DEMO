package com.AOP.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
//  JDK  接口 代理
public class UserProxy {

// CGlib 需要jar包
// 创建一个类实现 MethodInterceptor ，或许被代理对象 然后设置基类，设置回调接口，然后创建动态代理
    /*
    *
   public class CglibProxy implements MethodInterceptor{
    private Object target;//被代理目标

    public Object getProxy(Object target){
        this.target=target;
        Enhancer enhancer = new Enhancer();
//1.设置基类
        enhancer.setSuperclass(target.getClass());
//2.设置回调接口
        enhancer.setCallback(this);//MethodInterceptor实现类
//3.创建动态代理
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("准备前");
        Object invoke = method.invoke(target, objects);
        System.out.println("准备后");
        return invoke;
    }
}
    * */
    public static void main(String[] args) {


        /**
         * newProxyInstance() 创建代理对象
         * ClassLoader loader,                       本代理类的类加载器
         * @NotNull Class<?>[] interfaces,            增强方法在的类 这个类的实现接口  支持多个接口
         * @NotNull reflect.InvocationHandler h        实现接口InvocationHandler 创建的代理对象 写增强的方法
         */

        /*Proxy.newProxyInstance(UserProxy.class.getClassLoader(), Interfaces, new InvocationHandler() {

         匿名内部类方式
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });*/
        Class[] Interfaces = {User.class};
        //获得被代理对象实现对象
        User user = new UserImpl();
        User user1 = (User) Proxy.newProxyInstance(UserProxy.class.getClassLoader(), Interfaces, new ProxyUser(user));
        user1.add(1, 2);
        System.out.println("-----------------------------");
        user1.update(3);
    }

}


//创建类方式
class ProxyUser implements InvocationHandler {
    //获取被代理对象实现对象
    private Object obj;

    public ProxyUser(Object obj) {
        this.obj = obj;
    }
    public ProxyUser(){

    }

    /**
     * @param proxy  在其上调用方法的代理实例
     * @param method 被增强的方法执行 实际调用被代理对象哪个方法 就是哪个方法 例如本案例 调用被代理对象 add方法 就是add
     * @param args   传递进的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("被增强的方法" + method);
        System.out.println("被增强的方法名字" + method.getName());
        System.out.println("传递的参数" + Arrays.toString(args));
        //执行被增强中的方法
        Object invoke = method.invoke(obj, args);


        return invoke;
    }
}
