/**    
 * @Title: SampleServiceImpl.java  
 * @Package com.dubbo.sample.provider.impl  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:22:37  
 * @version V1.0    
 */
package com.dubbo.sample.provider.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.sample.provider.SampleService;

/**  
 * @ClassName: SampleServiceImpl  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:22:37  
 *    
 */
public class SampleServiceImpl implements SampleService
{

	/*  
	 * <p>Title: sayHello</p>  
	 * <p>Description: </p>  
	 * @param name
	 * @return  
	 * @see com.dubbo.sample.provider.SampleService#sayHello(java.lang.String)  
	 */
	@Override
	public String sayHello(String name)
	{
		return "Hello " + name;
	}

	/*  
	 * <p>Title: getUsers</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.dubbo.sample.provider.SampleService#getUsers()  
	 */
	@Override
	public List getUsers()
	{
		List list = new ArrayList();
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("m");

		User u2 = new User();
		u2.setName("tom");
		u2.setAge(21);
		u2.setSex("m");

		User u3 = new User();
		u3.setName("rose");
		u3.setAge(19);
		u3.setSex("w");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

}
