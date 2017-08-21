/**    
 * @Title: SampleService.java  
 * @Package com.dubbo.sample.provider  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:20:44  
 * @version V1.0    
 */
package com.dubbo.sample.provider;

import java.util.List;

/**  
 * @ClassName: SampleService  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:20:44  
 *    
 */
public interface SampleService
{
	String sayHello(String name);

	public List getUsers();
}
