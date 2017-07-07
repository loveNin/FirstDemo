/**
 * 
 */
package com.zdxs.spring_boot_first;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * <p>Title:</p>
 * <p>Description:</p>
 * <p>Company: 深圳市中达兴盛科技有限公司 </p>
 * @version 1.00 
 * @since 2017-7-6 上午9:42:49
 * @author taojunru
 *  
 * Modified History: 
 *  
 */

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	/**
	 * spring boot默认的使用json解析框架是jackson
	 * @return
	 */
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("吾问无为谓展豪");
		demo.setDateTime(new Date());
		
		return demo;
	}
}
