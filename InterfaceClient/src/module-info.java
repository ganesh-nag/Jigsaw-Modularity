/**
 * 
 */
/**
 * @author Ganesh Nagalingam
 *
 */
module com.client {
	requires com.iface;
	requires com.iface.impl;
	
	uses com.iface.IMethods;
}