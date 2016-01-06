package com.test.main;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodInvoke2 {


	/**
	 * 集合中的泛型
	 * */
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("abc");
		
		Class c1=list.getClass();
		Class c2=list1.getClass();
		
		//结果返回true说明编译后的集合是去泛型化的
		//java中集合的泛型，是防止错误输入的，只在编译阶段有效
		System.out.println(c1==c2);
		
		
		try {
			Method m=c1.getMethod("add",Object.class);
			//绕过编译阶段的输入
			m.invoke(list1, 100);
			System.out.println(list1);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		
		
	}
}
