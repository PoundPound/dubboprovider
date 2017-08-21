/**    
 * @Title: User.java  
 * @Package com.dubbo.sample.provider.impl  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:21:16  
 * @version V1.0    
 */
package com.dubbo.sample.provider.impl;

import java.io.Serializable;

/**  
 * @ClassName: User  
 * @Description: TODO 
 * @author lewis lianfenxiang@163.com
 * @date 2017年8月21日 下午9:21:16  
 *    
 */
public class User implements Serializable
{

	/**  
	 * @Fields serialVersionUID : TODO
	 */  
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	private String sex;
	/**  
	 * <p>Title: </p>  
	 * <p>Description: </p>  
	 * @param age
	 * @param name
	 * @param sex  
	 */
	public User(int age, String name, String sex)
	{
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	/**  
	 * <p>Title: </p>  
	 * <p>Description: </p>    
	 */
	public User()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex()
	{
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
}
