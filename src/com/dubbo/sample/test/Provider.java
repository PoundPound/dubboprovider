/**    
 * @Title: Provider.java  
 * @Package com.dubbo.sample.test  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:19:24  
 * @version V1.0    
 */
package com.dubbo.sample.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**  
 * @ClassName: Provider  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:19:24  
 *    
 */
public class Provider
{
	public static void main(String[] args) throws IOException
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "sample-provider.xml" });
		context.start(); 
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}
