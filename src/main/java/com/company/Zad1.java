package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad1
{
    public static void sprawdz(int nr_zadania, String sql, Zadanie Tablica[]) //throws IOException
    {
        int intIndeks_SELECT = sql.indexOf("SELECT");
        int intIndeks_FROM = sql.indexOf("FROM");
        int intIndeks_WHERE = sql.indexOf("WHERE");
        int intIndeks_ORDER_BY = sql.indexOf("ORDER BY");

        if (intIndeks_SELECT != -1 && intIndeks_FROM != -1)
        {
            if(intIndeks_SELECT < intIndeks_FROM)
            {
                if(intIndeks_WHERE != -1)
                {
                    if(intIndeks_FROM < intIndeks_WHERE)
                    {
                        if(intIndeks_ORDER_BY != -1)
                        {
                            if(intIndeks_WHERE<intIndeks_ORDER_BY)
                            {
                                zapis(nr_zadania, sql, Tablica);
                            }
                        }
                        else
                        {
                            zapis(nr_zadania, sql, Tablica);
                        }
                    }
                    else
                    {
                        System.out.println("błąd sql");
                    }
                }
                else
                {
                    if(intIndeks_ORDER_BY != -1)
                    {
                        if(intIndeks_FROM<intIndeks_ORDER_BY)
                        {
                            zapis(nr_zadania, sql, Tablica);
                        }
                    }
                    else
                    {
                        zapis(nr_zadania, sql, Tablica);
                    }
                }
            }
            else
            {
                System.out.println("błąd sql");
            }
        }
        else
        {
            System.out.println("błąd sql");
        }

    }


    public static void zapis(int zadanie, String sql, Zadanie Tablica[]) //throws IOException
    {
        Tablica[zadanie].nr_zadania = zadanie;
        Tablica[zadanie].sql = sql;
    }


    public static void zapis_do_pliku(Zadanie Tablica[]) throws IOException
    {
        // zapis do pliku tablicy obiektów
        String dostep = "j:\\Desktop\\odp.txt";
        File plik = new File(dostep);
        plik.delete();
        plik.createNewFile();

        if(plik.exists())
        {
            FileWriter zapis = new FileWriter(dostep, true);
            for (int i = 1; i<Tablica.length; i++)
            {
                if(Tablica[i].sql != null)
                    zapis.write("Zad."+Tablica[i].nr_zadania+" "+Tablica[i].sql+"\n");
            }
            zapis.close();
        }
        else
        {
            System.out.println("plik nie istnieje");
        }
    }


    public static void zad1(Zadanie Tablica[]) throws IOException
    {
        File plik = new File("j:\\Desktop\\odp.txt");

        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);

        int nr_zadania = 1;


        while (true && in.hasNext()) /// coś poprawić z wyświetlaniem
        {
            System.out.println("podaj nr zadania: [0] - wyjscie");
            nr_zadania = in.nextInt();
            if(nr_zadania == 0)
            {
                zapis_do_pliku(Tablica);
                System.exit(0);
            }
            else
            {
                System.out.println("podaj zapytanie SQL:");
                String sql = in1.nextLine();
                sprawdz(nr_zadania, sql, Tablica);
            }
        }
        in.close();
        in1.close();
        zapis_do_pliku(Tablica);
    }
}
