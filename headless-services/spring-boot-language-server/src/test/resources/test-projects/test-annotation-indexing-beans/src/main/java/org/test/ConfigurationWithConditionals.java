package org.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConfigurationWithConditionals {
	
	@Bean
	@ConditionalOnJava(JavaVersion.EIGHT)
	public BeanClass conditionalBean() {
		return new BeanClass();
	}
	
	@ConditionalOnJava(JavaVersion.EIGHT)
	@Bean
	public BeanClass conditionalBeanDifferentSequence() {
		return new BeanClass();
	}

	@Bean
	@ConditionalOnJava(JavaVersion.EIGHT)
	@Profile("cloud")
	public BeanClass conditionalBeanWithJavaAndCloud() {
		return new BeanClass();
	}
}
