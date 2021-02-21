package com.company;

public class BMICalculator {

    public static void main(String[] args) {
        #Użyj args
        int weight = 70;
        #Uzyj args
        double height = 1.8;
        # połącz deklarację z inicjalizacją - w tym wypadku tak będzie linijka mniej
        final double bmi;
        
        # Zapoznaj się z klasą MessageFormat pozwoli Ci ona na interpolacje stringów a nie concat :) 
        System.out.println("Twoja waga to: " + weight + " kg");
        System.out.println("Twój wzrost to: " + height + " cm");

        #do potęgi 2 lepiej mnożyż height * height
        bmi = Math.floor(weight / Math.pow(height, 2));

        System.out.println("Twój wynik bmi to: " + bmi);
    }
}
