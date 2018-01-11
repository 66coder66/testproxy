package testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LogInvocationHandler implements InvocationHandler {
	
	private Hello hello;
	
    public LogInvocationHandler(Hello hello) {
    	super();
        this.hello = hello;
    }
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		if("sayHello".equals(method.getName())) {
            System.out.println("invoke said: " + Arrays.toString(args));
        }
        return method.invoke(hello, args);
	}
	 /** 
     * 获取目标对象的代理对象 
     * @return 代理对象 
     */  
    public Object getProxy(){  
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),   
                this.hello.getClass().getInterfaces(),this);  
    } 

}
