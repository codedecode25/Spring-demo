package com.code.decode.springDemo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${server.port}")
	private String customVal;

	
	@GetMapping("/codeDecode")
	public void codeDecodeControllerDemo() {
		System.out.println("customVal   " + customVal);
		
		System.out.println("customVal   " + customVal);
		System.out.println("customVal   " + customVal);
		
	}
	
	

}
