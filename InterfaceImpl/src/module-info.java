/**
 * 
 */
/**
 * @author Ganesh Nagalingam
 *
 */
module com.iface.impl {
	requires com.iface;
	
	provides com.iface.IMethods with 
	com.iface.impl.InterfaceImpl;
}