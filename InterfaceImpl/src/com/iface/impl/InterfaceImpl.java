package com.iface.impl;

import com.iface.IMethods;

/**
 * @author Ganesh Nagalingam
 *
 */
public class InterfaceImpl implements IMethods {

	@Override
	public void method1(int a) {
		System.out.println("Answer by abstract method = " + a);
		
	}

}
