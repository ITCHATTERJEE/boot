package org.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestController")

public class TestController {

	@RequestMapping("/Testpage")

	public String home() {
		return "Test Hello World!";
	}
}
