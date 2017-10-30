package com.company;

import java.io.IOException;



public class Thread_Zad1 extends Thread
{
    public Zad1 Zadanie1 = new Zad1();

    public void run()
    {
        try{
            Zadanie1.zad1(Main.Tablica);        //w parametrze tablica do której zad1 zapisuje i przepisuje do pliku txt
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}