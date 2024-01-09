package utils.utils;

public class captcha extends parentCaptcha {
    int userValueCaptcha;
    boolean captchaStatusSolved;

    int sesion;

    public captcha(int sesionConstructor) {
        this.sesion = sesionConstructor;

    }

    @Override
    public int getOneRandomNumber() {
        return super.getOneRandomNumber();
    }

    @Override
    public int getTwoRandomNumber() {
        return super.getTwoRandomNumber();
    }

    public void setuserValueCaptcha(int userValueCaptchaInput) {
        this.userValueCaptcha = userValueCaptchaInput;
    }

    public int sumaCaptchaResult() {
        return getOneRandomNumber() + getTwoRandomNumber();
    }

    public boolean checkSolvedCaptcha() {
        return (sumaCaptchaResult() == this.userValueCaptcha) ? true : false;
    }
}
