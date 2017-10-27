package com.company;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {
    public SimpleJob() {
    }

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Executuja mnie");
    }
}
