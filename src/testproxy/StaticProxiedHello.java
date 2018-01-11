package testproxy;

public class StaticProxiedHello implements Hello {
	
	private Hello hello = new HelloImp();
	
	/**  
     * ¸²¸ÇÄ¬ÈÏ¹¹ÔìÆ÷  
     *   
     * @param 
     */    
    public StaticProxiedHello(HelloImp hello) {    
        this.hello = hello;    
    }  
	
	@Override
	public String sayHello(String str) {
		
		System.out.println("StaticProxiedHello said: " + str);
		return hello.sayHello(str);
	}

}
