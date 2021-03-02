package main.java.com.company;

import org.junit.jupiter.api.function.Executable;

import java.text.MessageFormat;

public class BMICalculator {
    int weight;
    double height;

    public BMICalculator (int weight, double height){
        this.weight = weight;
        this.height = height / 100;
    }

    public double calculateBmi(){
        String weightInfo = MessageFormat.format("Twoja waga to: {0}", this.weight);
        String heightInfo = MessageFormat.format("Twój wzrost to: {0}", this.height);

        System.out.println(weightInfo);
        System.out.println(heightInfo);

        if(this.weight <= 0 && this.height <= 0){
            System.out.println("Podałeś złe wartości");

            return 0;
        }

        final double bmi = Math.floor(this.weight / (this.height * this.height));

        String resultInfo = MessageFormat.format("Twój wynik bmi to: {0}", bmi);

        System.out.println(resultInfo);

        return bmi;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(args[0] == null);
        if(args[0] == null || args[1] == null){
            throw new Exception("Błędne argument - null");
        }

        if(Character.isLetter(args[0].charAt(0)) && Character.isLetter(args[1].charAt(0))){
            throw new Exception("Błędne argument");
        }

        if(args[0].contains(",") || args[1].contains(",")){
            throw new Exception("Błędne argument");
        }

        BMICalculator bmiCalculator = new BMICalculator(Integer.parseInt(args[0]), Double.parseDouble(args[1]) );

        bmiCalculator.calculateBmi();

    }
}
