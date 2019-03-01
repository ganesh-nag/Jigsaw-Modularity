package com.client;

import java.util.ServiceLoader;

import com.iface.IMethods;


/**
 * @author Ganesh Nagalingam
 *
 */
public class IClient {
	
	public static IMethods getService() {
		
		ServiceLoader<IMethods> serviceLoader = ServiceLoader.load(IMethods.class);
		
			for(IMethods service:serviceLoader) {
				return service;
			}
		throw new Error("Service provider Implementation not found....");
	}

	public static void main(String[] args) {

		IMethods face = IClient.getService();
		
		face.method1(100);
		face.add(40, 40);
		IMethods.mul(10, 40);
		

	}

}
