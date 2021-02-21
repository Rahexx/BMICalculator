package main.java.com.company;

import java.text.MessageFormat;

public class BMICalculator {
    int weight;
    double height;

    public BMICalculator (int weight, double height){
        this.weight = weight;
        this.height = height / 100;
    }

    public void calculateBmi(){
        String weightInfo = MessageFormat.format("Twoja waga to: {0}", this.weight);
        String heightInfo = MessageFormat.format("Twój wzrost to: {0}", this.height);

        System.out.println(weightInfo);
        System.out.println(heightInfo);

        final double bmi = Math.floor(this.weight / (this.height * this.height));

        String resultInfo = MessageFormat.format("Twój wynik bmi to: {0}", bmi);

        System.out.println(resultInfo);

    }

    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator(Integer.parseInt(args[0]), Double.parseDouble(args[1]) );

        bmiCalculator.calculateBmi();
    }
}
