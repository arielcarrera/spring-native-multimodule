package com.github.arielcarrera.spring_native.multimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.AotProxyHint;
import org.springframework.nativex.hint.ProxyBits;

@AotProxyHint(targetClass = ItemsController.class, proxyFeatures = ProxyBits.IS_STATIC)
@SpringBootApplication(proxyBeanMethods = false)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
