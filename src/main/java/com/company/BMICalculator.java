package main.java.com.company;

import java.text.MessageFormat;

public class BMICalculator {
    int weight;
    double height;

    public BMICalculator (int weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public void calculateBmi(){
        String weightInfo = MessageFormat.format("Twoja waga to: ", this.weight);
        String heightInfo = MessageFormat.format("Twój wzrost to: ", this.height);

        System.out.println(weightInfo);
        System.out.println(heightInfo);

        final double bmi = Math.floor(weight / height * height);

        String resultInfo = MessageFormat.format("Twój wynik bmi to: ", bmi);

        System.out.println(resultInfo);

    }

    public static void main(String[] args) {


    }
}
