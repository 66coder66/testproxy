package cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BookCglib implements MethodInterceptor {
	
	private BookImpl target;//ҵ������󣬹��������н���������ҵ�񷽷�����
	
	//�൱��JDK��̬�����еİ�
    public Object getInstance(BookImpl target) {  
        this.target = target;  //��ҵ�����ֵ
        Enhancer enhancer = new Enhancer(); //������ǿ��������������̬������
        enhancer.setSuperclass(this.target.getClass());  //Ϊ��ǿ��ָ��Ҫ�����ҵ���ࣨ����Ϊ�������ɵĴ�����ָ�����ࣩ
        //���ûص������ڴ����������з����ĵ��ã��������CallBack����Callback����Ҫʵ��intercept()����������
        enhancer.setCallback(this); 
        // ������̬��������󲢷���  
        return enhancer.create(); 
    }
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("Ԥ��������������");
		arg3.invokeSuper(arg0, arg2); //����ҵ���ࣨ�����У��ķ���
	    System.out.println("���ú����������������");
		return null;
	}

}
