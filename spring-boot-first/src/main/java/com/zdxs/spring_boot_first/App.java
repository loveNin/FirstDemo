package com.zdxs.spring_boot_first;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @SpringBootApplication 指定这是一个spring boot 的应用程序
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements EmbeddedServletContainerCustomizer{
    public static void main( String[] args ){
    	// 启动应用程序
    	SpringApplication.run(App.class, args);
	}

	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);
	}

	/*@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		 * 1.需要先定义 Converter 转换消息的对象
		 * 2.添加fastJson的配置信息，比如是否要格式化返回的json数据 
		 * 3.在 Converter 中添加配置信息
		 * 4.将 Converter 添加到 converters 当中
		 
		
		// 1
		FastJsonHttpMessageConverter fastConcerter = new FastJsonHttpMessageConverter();
		// 2
		FastJsonConfig fastJson = new FastJsonConfig();
		fastJson.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 3 
		fastConcerter.setFastJsonConfig(fastJson);
		// 4
		converters.add(fastConcerter);
	}*/
}