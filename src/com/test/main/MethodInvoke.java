package com.test.main;

import java.lang.reflect.Method;

public class MethodInvoke {

	
	public static void main(String[] args) {
		A a1=new A();
		Class cla=a1.getClass();
		
		try {
			//
			//Method method=cla.getMethod("print",new Class[]{int.class,int.class});
			Method method1=cla.getMethod("print",int.class,int.class);
			
			//方法的反射操作
			//a1.print(10,20);方法的反射操作是由method对象进行方法调用，和a1.print调用效果相同
			Object obj=method1.invoke(a1, 10,20);
			
			System.out.println("======================");
			//Method methosd2=cla.getMethod("print",new Class[]{String.class,String.class});
			Method method2=cla.getMethod("print",String.class,String.class);
			Object obj2=method2.invoke(a1, "abc","ABC");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class A{
	
	public void print(int a,int b){
		System.out.println(a+b);
	}
	
	public void print(String a,String b){
		System.out.println(a+b);
	}
}
