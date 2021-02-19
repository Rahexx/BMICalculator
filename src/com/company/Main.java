package com.company;

public class Main {

    public static void main(String[] args) {
        int weight = 70;
        double height = 1.8;
        final double bmi;

        System.out.println("Twoja waga to: " + weight + " kg");
        System.out.println("Twój wzrost to: " + height + " cm");

        bmi = Math.floor(weight / Math.pow(height, 2));

        System.out.println("Twój wynik bmi to: " + bmi);

    }
}
