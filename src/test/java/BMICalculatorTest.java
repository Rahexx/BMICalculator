package test.java;

import main.java.com.company.BMICalculator;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    @Test
    void calculateBmi() {
        BMICalculator testZero = new BMICalculator(0, 0);
        BMICalculator testNegativeNumber = new BMICalculator(-1, -1);
        BMICalculator thirdTest = new BMICalculator(40, 170);
        BMICalculator fourthTest = new BMICalculator(70, 170);
        BMICalculator fifthTest = new BMICalculator(110, 170);
        BMICalculator sixthTest = new BMICalculator(70, 120);

        int bmiZero = (int) testZero.calculateBmi();
        int bmiNegative = (int) testNegativeNumber.calculateBmi();
        int thirdBmi = (int) thirdTest.calculateBmi();
        int fourthBmi = (int) fourthTest.calculateBmi();
        int fifthBmi = (int) fifthTest.calculateBmi();
        int sixthBmi = (int) sixthTest.calculateBmi();

        Assert.assertThat(bmiZero, CoreMatchers.is(0));
        Assert.assertThat(bmiNegative, CoreMatchers.is(0));
        Assert.assertThat(thirdBmi, CoreMatchers.is(13));
        Assert.assertThat(fourthBmi, CoreMatchers.is(24));
        Assert.assertThat(fifthBmi, CoreMatchers.is(38));
        Assert.assertThat(sixthBmi, CoreMatchers.is(48));
    }
}