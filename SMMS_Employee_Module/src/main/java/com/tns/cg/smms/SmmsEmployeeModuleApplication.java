
/*
 * This is the class that provides a convenient way to bootstrap a spring application. It can be started from the main method. 
 */

package com.tns.cg.smms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/*
 * @SpringBootApplication: This annotation is used to
 * enable @EnableAutoConfiguration,@ComponentScan,@Configuration annotations.
 */

public class SmmsEmployeeModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmmsEmployeeModuleApplication.class, args);
	}

}
