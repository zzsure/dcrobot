package com.az.dcrobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zzsure
 * @date 2022/05/27
 */
@SpringBootApplication
@EnableScheduling
public class DcrobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcrobotApplication.class, args);
	}

}
