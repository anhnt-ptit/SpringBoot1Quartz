package com.spring.quartz.test.job;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestJob implements Job {

	private static Logger logger = LoggerFactory.getLogger(TestJob.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("Starting execute job test with key is {}", context.getJobDetail().getKey());
		JobDataMap jobDataMap = context.getMergedJobDataMap();
		// TODO
		logger.info("Ending execute job test with key is {}", context.getJobDetail().getKey());
	}

}
