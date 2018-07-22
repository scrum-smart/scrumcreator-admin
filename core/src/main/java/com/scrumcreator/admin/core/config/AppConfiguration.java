package com.scrumcreator.admin.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * Created by vmoskalenko on 13.01.2017.
 */
@Configuration
@ComponentScan(basePackages = {
        "com.scrumcreator.admin.core.data",
        "com.scrumcreator.admin.core.security"
})
@PropertySource("classpath:application.properties")
public class AppConfiguration {
}
