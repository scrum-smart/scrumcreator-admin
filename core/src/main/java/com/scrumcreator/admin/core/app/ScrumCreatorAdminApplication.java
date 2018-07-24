package com.scrumcreator.admin.core.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan({"com.scrumcreator.admin.core.data","com.scrumcreator.admin.core.web"})

public class ScrumCreatorAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumCreatorAdminApplication.class, args);
	}
	
}
