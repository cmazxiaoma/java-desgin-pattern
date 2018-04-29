package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicImageProxy implements InvocationHandler {
    private Object target;

    public DynamicImageProxy(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic image proxy");
        Object result = method.invoke(target, args);
        return result;
    }
}
