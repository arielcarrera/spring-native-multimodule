package com.github.arielcarrera.spring_native.multimodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration(proxyBeanMethods = false)
@EnableWebSecurity
@Order(3)
public class BasicAuthConfigurerAdapter extends AbstractBasicAuthConfigurerAdapter {

	@Autowired
	public BasicAuthConfigurerAdapter(SampleConfig sConfig) {
		super(sConfig);
	}
}