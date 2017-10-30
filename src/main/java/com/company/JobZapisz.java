package com.company;
import org.quartz.*;

import java.io.IOException;

@PersistJobDataAfterExecution
public class JobZapisz  implements org.quartz.Job
{
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException
    {
        try
        {
            System.out.print("zapisano do pliku \n");
            Zad1.zapis_do_pliku(Main.Tablica);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
