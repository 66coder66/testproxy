package testproxy;



public class TestProxy {
	
	/*
	Hello hello = (Hello)Proxy.newProxyInstance(
			getClass().getClassLoader(), // 1. �������
		    new Class<?>[] {Hello.class}, // 2. ������Ҫʵ�ֵĽӿڣ������ж��
		    new LogInvocationHandler(new HelloImp()));// 3. �������õ�ʵ�ʴ�����
	*/
	public static void main(String[] args) {
		//System.out.println(hello.sayHello("I love you!"));
		HelloImp hello = new HelloImp();    
		StaticProxiedHello helloProxy = new StaticProxiedHello(hello);    
		helloProxy.sayHello("I love you!");
        
	}
	
	
		
}
