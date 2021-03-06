package com.baeldung.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication(scanBasePackages = { "com.baeldung.git" })
public class CommitIdApplication {
	public static void main(String[] args) {
		SpringApplication.run(CommitIdApplication.class, args);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();

		// These properties can also be set in the pom.xml file
		c.setLocation(new ClassPathResource("git.properties"));
		c.setIgnoreResourceNotFound(false);
		c.setIgnoreUnresolvablePlaceholders(false);
		return c;
	}
}