package com.iface;

/**
 * @author Ganesh Nagalingam
 *
 */
public interface IMethods {
	
	
	//Java 7 has
	public static final String name = "Test Different versions of Java SE 7,8,9,10,11";
	public abstract void method1(int a);
	
	//Java 8 adds
	public default void add(int b, int c) {
		System.out.println("Answer by Default method  = " + (b+c));	
		
		//private method inside default method
		sub(b,c);
		//private static method inside non-static method
		div(b,c);
		
	}
	
	public static void mul(int x, int y) {
		
		System.out.println("Answer by Static method = " + (x*y));
		
		//static method inside other static method
		div(x,y);
	}
	
	//Java 9 adds
	private void sub(int p, int q) {
		System.out.println("Answer by Private method = " + (p-q));
	}
	
	private static void div(int m, int n) {
		System.out.println("Answer by Private Static methiod = " + (m/n));
	}
}
