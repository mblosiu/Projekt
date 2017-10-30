package com.company;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.CronScheduleBuilder.*;


public class Thread_scheduler extends Thread
{

    public void run()
    {
        try {
            // Grab the Scheduler instance from the Factory
            SchedulerFactory sf = new StdSchedulerFactory();
            Scheduler scheduler = sf.getScheduler();



            // define the job and tie it to our HelloJob class // definiujemy joba do wykonania
            JobDetail jobSave = newJob(JobZapisz.class)
                    .withIdentity("myJob", "group1") // name "myJob", group "group1"
                    .usingJobData("jobSays", "Hello World!")
                    .build();

            // define the job and tie it to our HelloJob class // definiujemy joba do wykonania
            JobDetail jobTime = newJob(JobCzasZajec.class)
                    .withIdentity("myJob", "group2") // name "myJob", group "group1"
                    .build();




            // Trigger the job to run now, and then repeat every 40 seconds // definiujemy triggera , który odpala joba
            Trigger triggerZapisz = newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    .withSchedule(cronSchedule("0/30 0 8-18 * * ?"))
                    .build();

            // Trigger the job to run now, and then repeat every 40 seconds // definiujemy triggera , który odpala joba
            Trigger triggerCzasZajec = newTrigger()
                    .withIdentity("trigger2", "group2")
                    .startNow()
                    //.withSchedule(cronSchedule("0 15,45/1 8-18 * * ? *"))   //wtf? nie działają miesiące!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    .withSchedule(cronSchedule("0 0/1 8-18 * * ? "))
                    .build();



            // Tell quartz to schedule the job using our trigger // odpalamy joba triggerem, gg wp :D
            //scheduler.scheduleJob(jobSave, triggerZapisz);
            scheduler.scheduleJob(jobTime, triggerCzasZajec);
            scheduler.scheduleJob(jobSave, triggerZapisz);

            // and start it off
            scheduler.start();
            try {
                Thread.sleep(600000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            scheduler.shutdown(true);

        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}
