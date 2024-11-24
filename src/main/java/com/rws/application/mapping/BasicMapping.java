package com.rws.application.mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicMapping {

	@RequestMapping(value = "/message", produces = "application/json")
	public String getMessage() {
		return "Hello welcome";
	}

}
