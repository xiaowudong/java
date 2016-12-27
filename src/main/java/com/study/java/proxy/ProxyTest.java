package com.study.java.proxy;

import java.lang.reflect.Proxy;
/**
 * 
 * @author xiaowudong
 *
 * @time 2016年12月27日 下午10:29:54
 */
public class ProxyTest {
	public static void main(String[] args) throws Exception, SecurityException {
		System.out.println(System.getProperty("user.dir"));
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");  
        CustomInvocationHandler handler = new CustomInvocationHandler(new HelloWorldImpl());  
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(  
                ProxyTest.class.getClassLoader(),  
                new Class[]{HelloWorld.class},  
                handler);  
        proxy.sayHello("xiaowudong"); 

	}

}
