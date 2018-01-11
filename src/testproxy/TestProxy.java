package testproxy;



public class TestProxy {
	
	/*
	Hello hello = (Hello)Proxy.newProxyInstance(
			getClass().getClassLoader(), // 1. 类加载器
		    new Class<?>[] {Hello.class}, // 2. 代理需要实现的接口，可以有多个
		    new LogInvocationHandler(new HelloImp()));// 3. 方法调用的实际处理者
	*/
	public static void main(String[] args) {
		//System.out.println(hello.sayHello("I love you!"));
		HelloImp hello = new HelloImp();    
		StaticProxiedHello helloProxy = new StaticProxiedHello(hello);    
		helloProxy.sayHello("I love you!");
        
	}
	
	
		
}
