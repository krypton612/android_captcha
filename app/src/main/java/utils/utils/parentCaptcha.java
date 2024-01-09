package utils.utils;

import java.util.Random;

public class parentCaptcha implements CaptchaInterface {

    Random random = new Random();

    private int number1 = random.nextInt(100);
    private int number2 = random.nextInt(100);

    @Override
    public int getOneRandomNumber() {
        return number1;
    }

    @Override
    public int getTwoRandomNumber() {
        return number2;
    }

    @Override
    public void generateNewNumbers() {
        this.number1 = random.nextInt(100);
        this.number2 = random.nextInt(100);
    }

}
