package com.github.arielcarrera.spring_native.multimodule;

import java.util.Collection;
import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

	@GetMapping(path = "/items", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<String> findItems() {
		return Collections.singletonList("Item 1");
	}

	@PostMapping(path = "/items/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String addItem(@PathVariable(required = true) String name, String body) {
		return "Added: " + name;
	}

}