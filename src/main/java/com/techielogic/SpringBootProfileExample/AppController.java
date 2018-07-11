package com.techielogic.SpringBootProfileExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praveen
 *
 */

@RestController
public class AppController {

	@Value("${welcome.message}")
	private String message;
	
	@RequestMapping("/welcome")
	public String retrieveWelcomeMessage() {
		// Complex Method
		return message;
	}
	
}
