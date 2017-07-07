package com.zdxs.spring_boot_first;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/** 
 * <p>Title:</p>
 * <p>Description:</p>
 * <p>Company: 深圳市中达兴盛科技有限公司 </p>
 * @version 1.00 
 * @since 2017-7-6 上午10:04:10
 * @author taojunru
 *  
 * Modified History: 
 *  
 */
public class Demo {
	private int id;
	private String name;
	
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date dateTime;
	
	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
