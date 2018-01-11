package testproxy;

import org.junit.Test;

public class TestTProxy  {
	
	@Test  
    public void testProxy() throws Throwable{  
        //ʵ����Ŀ�����  
		Hello hello = new HelloImp();
          
        //ʵ����Invocation  
		LogInvocationHandler invocationHandler = new LogInvocationHandler(hello);  
          
        //����Ŀ�����ɴ������  
		Hello proxy = (Hello)invocationHandler.getProxy();  
          
        //���ô�����󷽷�  
        proxy.sayHello("miss");  
    }  
}
