package com.company;

import java.io.IOException;


public class Main
{

    public static Zadanie Tablica[] = new Zadanie[1000];

    public static void main(String[] args)  throws IOException, InterruptedException
    {
        // tablica obiektów

        for(int i=0; i<Main.Tablica.length; i++)
        {
            Main.Tablica[i] = new Zadanie();
        }

        //wątki
        Thread_Zad1 T1 = new Thread_Zad1();
        T1.start();
        Thread_scheduler S1 = new Thread_scheduler();
        S1.start();
    }
}