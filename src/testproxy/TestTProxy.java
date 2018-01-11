package testproxy;

import org.junit.Test;

public class TestTProxy  {
	
	@Test  
    public void testProxy() throws Throwable{  
        //实例化目标对象  
		Hello hello = new HelloImp();
          
        //实例化Invocation  
		LogInvocationHandler invocationHandler = new LogInvocationHandler(hello);  
          
        //根据目标生成代理对象  
		Hello proxy = (Hello)invocationHandler.getProxy();  
          
        //调用代理对象方法  
        proxy.sayHello("miss");  
    }  
}
