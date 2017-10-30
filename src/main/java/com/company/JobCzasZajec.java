package com.company;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;

import java.util.Date;


@PersistJobDataAfterExecution
public class JobCzasZajec  implements org.quartz.Job
{
    public void execute(JobExecutionContext context) throws JobExecutionException
    {
       Date Data = new Date();

        int czas_startowy_w_minutach_8_15 = 8 * 60 + 15;
        int czas_koncowy_w_minutach_9_45 = 9 * 60 + 45;

        int czas_startowy_w_minutach_9_45 = 9 * 60 + 45;
        int czas_koncowy_w_minutach_10 = 10 * 60 + 0;

        int czas_startowy_w_minutach_10 = 10 * 60 + 0;
        int czas_koncowy_w_minutach_11_30 = 11 * 60 + 30;

        int czas_startowy_w_minutach_11_30 = 11 * 60 + 30;
        int czas_koncowy_w_minutach_11_45 = 11 * 60 + 45;

        int czas_startowy_w_minutach_11_45 = 11 * 60 + 45;
        int czas_koncowy_w_minutach_13_15 = 13 * 60 + 15;

        int czas_startowy_w_minutach_13_15 = 13 * 60 + 15;
        int czas_koncowy_w_minutach_13_45 = 13 * 60 + 45;

        int czas_startowy_w_minutach_13_45 = 13 * 60 + 45;
        int czas_koncowy_w_minutach_15_15= 15 * 60 + 15;

        int czas_startowy_w_minutach_15_15 = 15 * 60 + 15;
        int czas_koncowy_w_minutach_15_30 = 15 * 60 + 30;

        int czas_startowy_w_minutach_15_30 = 15 * 60 + 30;
        int czas_koncowy_w_minutach_17 = 17 * 60 + 0;

        int czas_startowy_w_minutach_17 = 17 * 60 + 0;
        int czas_koncowy_w_minutach_17_15 = 17 * 60 + 15;

        int czas_startowy_w_minutach_17_15 = 17 * 60 + 15;
        int czas_koncowy_w_minutach_18_45 = 18 * 60 + 45;

        int obecna_godzina_w_minutach=Data.getHours()*60 + Data.getMinutes();

        if(obecna_godzina_w_minutach<czas_startowy_w_minutach_8_15)              // do 8:15
        {
            int czasPozostaly = czas_startowy_w_minutach_8_15 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly + " minut do końca przerwy \n");
        }

       if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_8_15 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_9_45)   //od 8:15 do 9:45
       {
           int czasPozostaly = czas_koncowy_w_minutach_9_45 - obecna_godzina_w_minutach;
           System.out.print(czasPozostaly+" minut do końca zajeć \n");
       }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_9_45 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_10)   //od 9:45 do 10:00
        {
            int czasPozostaly = czas_koncowy_w_minutach_10 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly + " minut do końca przerwy \n");
        }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_10 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_11_30)   //od 10 do 11:30//
        {
            int czasPozostaly = czas_koncowy_w_minutach_11_30 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly+" minut do końca zajeć \n");
        }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_11_30 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_11_45)   //od 11:30 do 11:45//
        {
            int czasPozostaly = czas_koncowy_w_minutach_11_45 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly + " minut do końca przerwy \n");
        }


        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_11_45 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_13_15)   //od 11:45 do 13:15
        {
            int czasPozostaly = czas_koncowy_w_minutach_13_15 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly+" minut do końca zajeć \n");
        }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_13_15 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_13_45)   //od13:15 do13:45
        {
            int czasPozostaly = czas_koncowy_w_minutach_13_45 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly + " minut do końca przerwy \n");
        }


        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_13_45 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_15_15)   //od 13:45 do 15:15
        {
            int czasPozostaly = czas_koncowy_w_minutach_15_15 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly+" minut do końca zajeć \n");
        }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_15_15 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_15_30)   //od 15:15 do 15:30
        {
            int czasPozostaly = czas_koncowy_w_minutach_15_30 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly + " minut do końca przerwy \n");
        }


        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_15_30 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_17)   //od 15:30 do 17:00
        {
            int czasPozostaly = czas_koncowy_w_minutach_17 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly+" minut do końca zajeć \n");
        }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_17 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_17_15)  //od 17:00 do 17:15
        {
            int czasPozostaly = czas_koncowy_w_minutach_17_15 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly + " minut do końca przerwy \n");
        }

        if (obecna_godzina_w_minutach>=czas_startowy_w_minutach_17_15 && obecna_godzina_w_minutach<czas_koncowy_w_minutach_18_45)   //od 17:15 do 18:45
        {
            int czasPozostaly = czas_koncowy_w_minutach_18_45 - obecna_godzina_w_minutach;
            System.out.print(czasPozostaly+" minut do końca zajeć \n");
        }
    }
}