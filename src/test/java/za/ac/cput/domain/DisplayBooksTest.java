/**
 * Aquilla Williams
 * 217284205
 */
package za.ac.cput.domain;

import static org.junit.jupiter.api.Assertions.*;

import za.ac.cput.domain.DisplayBooks;

import java.util.Arrays;

class DisplayBooksTest {

    public static int initialise(DisplayBooks[]d, int size) {
        d[0] = new DisplayBooks("GF5001", "Glen Fadrouw", "What it all means","Andrea");
        d[1] = new DisplayBooks("BP1090", "Busta Posey", "Method Man", "Aquilla");
        d[2] = new DisplayBooks("JF9032", "Jean Francis", "How to get away with murder", "Haybn");
        d[3] = new DisplayBooks("DO7211", "Dustin Olivero", "Psychological Warfare explained", "Joshua");


        size = 4;
        return size;
    }
    public static void display(DisplayBooks []b, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(b[i].toString());
        }
    }
}