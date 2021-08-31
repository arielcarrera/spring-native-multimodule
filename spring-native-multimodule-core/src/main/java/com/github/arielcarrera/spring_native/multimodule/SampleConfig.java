package com.github.arielcarrera.spring_native.multimodule;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Validated
@Data
@Component
@ConfigurationProperties(prefix = "sample")
public class SampleConfig {

	private List<String> paths;
}