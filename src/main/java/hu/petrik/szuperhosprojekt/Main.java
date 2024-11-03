package hu.petrik.szuperhosprojekt;

import java.io.IOException;
import java.util.Arrays;

import static hu.petrik.szuperhosprojekt.Kepregeny.szereplok;
import static hu.petrik.szuperhosprojekt.Kepregeny.szuperhosok;

public class Main {

    public static void main(String[] args) {
        try {
            szereplok("src/test/resources/szuperhos.txt");
            szuperhosok();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}