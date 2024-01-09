# Captcha Local Android

### Implementacion clase Padre
```java
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
```
### Implementacion Interface Para metodos
```java
public interface CaptchaInterface {
    int getOneRandomNumber();

    int getTwoRandomNumber();

    void generateNewNumbers();
}

```
### Implementacion clase Hija
```java
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
```
###
### Resultados -> RandomNumber + RandomNumber > checkSolvedCaptcha()
###
```gradle
  cual es la suma de : 86 y 73 : 
  <<=========----> 75% EXECUTING [8s]
  El resultado del captcha fue erroneo
  cual es la suma de : 82 y 38 : 
  <=========----> 75% EXECUTING [15s]]
  El captcha fue resuelto con exito f
```
