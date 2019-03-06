package com.spring.quartz.test.config;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {

	@Bean
	public Scheduler scheduler() {
		Scheduler scheduler;
		try {
			scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.start();
			return scheduler;
		} catch (SchedulerException e) {
			e.printStackTrace();
			return null;
		}

	}

}
