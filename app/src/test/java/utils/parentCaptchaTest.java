/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package utils;

import org.junit.Test;

import utils.utils.captcha;
import utils.utils.parentCaptcha;
import static org.junit.Assert.*;

public class parentCaptchaTest {
    @Test
    public void parentCaptchagetOneRandomNumber() {
        parentCaptcha catpchaTest = new parentCaptcha();

        assert (catpchaTest.getOneRandomNumber() % 1 == 0);
    }

    @Test
    public void parentCaptchagetTwoRandomNumber() {
        parentCaptcha catpchaTest = new parentCaptcha();

        assert (catpchaTest.getTwoRandomNumber() % 1 == 0);
    }
}
