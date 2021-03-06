package com.graduation.comm.config;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置上传文件最大限制
 * @author JiangL
*/

@Configuration
public class MultipartConfig {
	
	@Bean  
	public MultipartConfigElement multipartConfigElement() {  
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("50MB");
		factory.setMaxRequestSize("50MB");  
		return factory.createMultipartConfig();  
	} 

}
