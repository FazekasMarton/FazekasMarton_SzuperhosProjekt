package hu.petrik.szuperhosprojekt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlNev) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fajlNev))) {
            String sor;
            while ((sor = reader.readLine()) != null) {
                String[] adatok = sor.split(" ");
                String nev = adatok[0];
                int kutyuSzam = Integer.parseInt(adatok[1]);

                Szuperhos szuperhos;
                if (nev.equals("Vasember")) {
                    szuperhos = new Vasember();
                } else if (nev.equals("Batman")) {
                    szuperhos = new Batman();
                } else {
                    continue;
                }

                for (int i = 0; i < kutyuSzam; i++) {
                    ((Milliardos) szuperhos).kutyutKeszit();
                }
                szuperhosLista.add(szuperhos);
            }
        }
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }
}