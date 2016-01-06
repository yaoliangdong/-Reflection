package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {

	/**
	 * java.lang.reflect.Field,类成员变量的封装类
	 * 打印所有成员变量信息
	 * */
	public static void printFields(Object obj){
		Class cla=obj.getClass();
		
		/*getFields()方法，获取类中的所有成员变量，包括继承于父类的成员变量
		 * getDeclaredFields()方法，只获取这个类中的成员变量
		 * */
		//Field[] fidlds=cla.getFields();
		Field[] fidlds=cla.getDeclaredFields();
		
		for (Field field : fidlds) {
			
			//获取成员变量的类类型
			Class type=field.getType();
			//获取成员变量类型名
			String typeName=type.getName();
			//获取成员变量名
			String name=field.getName();
			System.out.println(typeName+" "+name);
		}
	}
	
	/**
	 * java.lang.reflect.Method,类成员方法的封装类
	 * 打印所有方法信息
	 * */
	public static void printMethods(Object obj){
		Class cla=obj.getClass();
		
		/*getMethods()方法，获取类中的所有成员方法，包括继承于父类的成员方法
		 * getDeclaredMethods()方法，只获取这个类中的成员方法
		 * getName()方法，获取包名+具体的类名
		 * getSimpleName()方法，获取类名
		 * */
		
		//Method[] methods=cla.getMethods();
		Method[] methods=cla.getDeclaredMethods();
		
		for (Method method : methods) {
			
			//获取成员方法的返回值的类类型
			Class returnType=method.getReturnType();
			//获取成员方法方法名
			String methodName=method.getName();
			
			System.out.print(returnType+" "+methodName+" (");
			
			//获取成员方法参数类类型集合
			Class[] parameters=method.getParameterTypes();
			
			for (Class class1 : parameters) {
				
				//获取参数类型名
				String parameterType=class1.getName();
				System.out.print(parameterType+" ");
			}
			
			System.out.print(")");
			System.out.println("");
			
		}
		
	}
	
	/**
	 * java.lang.reflect.Constructor,类构造方法的封装类
	 * 打印所有构造方法信息
	 * */
	public static void printconstructors(Object obj){
		Class cla=obj.getClass();
		
		//Constructor[] cons=cla.getConstructors();
		Constructor[] cons=cla.getDeclaredConstructors();
		
		for (Constructor constructor : cons) {
			
			//获取构造方法名
			String conName=constructor.getName();
			System.out.print(conName+" (");
			//获取构造方法参数的类类型
			Class[] parameters=constructor.getParameterTypes();
			for (Class class1 : parameters) {
				//获取参数名
				String parameterName=class1.getName();
				System.out.print(parameterName+" ");
			}
			System.out.println(")");
			
		}
		
		
	}
}






