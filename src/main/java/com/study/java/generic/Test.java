package com.study.java.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws Exception, IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {  
		new Test().test1();
	}
	public void test() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Integer in=null;
		ArrayList<Integer> arrayList3=new ArrayList<Integer>();  
        arrayList3.add(1);//这样调用add方法只能存储整形，因为泛型类型的实例为Integer  
        arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "asd");  
        for (int i=0;i<arrayList3.size();i++) {
        	in=arrayList3.get(i);
            System.out.println(in);  
        }
        ArrayList<Object> arrayList1=new ArrayList<Object>();
        arrayList1.add("34");
	}
	public void test1() throws Exception, SecurityException{
        DateInter dateInter=new DateInter();  
        dateInter.setValue(new Date()); 
        Method[] methods=DateInter.class.getMethods();
        for(Method i : methods){
        	System.out.println(i);
        }
        Method method=DateInter.class.getMethod("setValue",Object.class);
        method.invoke(dateInter,new Date());
        System.out.println(method);
        
//        dateInter.setValue(new Object());//编译错误  
	}
}
