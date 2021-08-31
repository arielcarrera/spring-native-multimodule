package com.github.arielcarrera.spring_native.multimodule;

import java.util.List;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

public abstract class AbstractBasicAuthConfigurerAdapter extends WebSecurityConfigurerAdapter {

	private SampleConfig sampleConfig;

	public AbstractBasicAuthConfigurerAdapter(SampleConfig sConfig) {
		super();
		this.sampleConfig = sConfig;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http.csrf().disable();
		http.requestCache().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		List<String> paths = sampleConfig.getPaths();
		http.authorizeRequests().mvcMatchers(paths.toArray(new String[paths.size()])).authenticated().anyRequest()
				.denyAll().and().httpBasic();
//		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}

}