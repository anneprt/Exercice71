package fr.abp.cours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        int nombreA = 0;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Entrer une phrase:");
        BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
        try {
            s1 = clavier.readLine();
        } catch (IOException e) {
            System.out.println("Erreur !");
            e.printStackTrace();
        }
        s2 = s1.toUpperCase();

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'A') {
                nombreA++;
            }
            System.out.println("Vous avez entré : " + s1);
            System.out.println("Soit en majuscules : " + s2);
            System.out.println("Ce mot contient : " + nombreA + " A ");
        }

        s3 = s2.replace("A", "*");
        System.out.println("Il s'écrit alors : " + s3);
        System.out.print("Entrez un second mot : ");
        s4 = lectureClavier.next();

        if (s1.regionMatches(5, s4, 0, 7)) {
            System.out.println(("La sous chaine " + s4 + " est au bon endroit "));
        } ;
    }
}
