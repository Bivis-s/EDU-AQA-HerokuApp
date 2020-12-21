package tests.inputsTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InputsPage;
import tests.AbstractTest;

public class InputsTest extends AbstractTest {

    InputsPage inputsPage;

    @BeforeMethod
    public void initPage() {
        inputsPage = new InputsPage(driver);
    }


    private void isFieldEmpty() {
        Assert.assertTrue(inputsPage.isInputFieldEmpty());
    }


    @Test
    public void isFieldEmptyTest() {

        inputsPage.openPage();

        isFieldEmpty();
    }


    @Test
    public void send1ArrowUpTest() {

        inputsPage.openPage();
        isFieldEmpty();

        inputsPage.sendToInputField(1, Keys.ARROW_UP);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "1");
    }

    @Test
    public void send25ArrowUpTest() {

        inputsPage.openPage();
        isFieldEmpty();

        inputsPage.sendToInputField(25, Keys.ARROW_UP);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "25");
    }

    @Test
    public void send1ArrowDownTest() {

        inputsPage.openPage();
        isFieldEmpty();

        inputsPage.sendToInputField(1, Keys.ARROW_DOWN);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "-1");
    }

    @Test
    public void send25ArrowDownTest() {

        inputsPage.openPage();
        isFieldEmpty();

        inputsPage.sendToInputField(25, Keys.ARROW_DOWN);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "-25");
    }

    @Test
    public void send1ArrowUpAnd1ArrowDownTest() {

        inputsPage.openPage();
        isFieldEmpty();

        inputsPage.sendToInputField(1, Keys.ARROW_UP);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "1");

        inputsPage.sendToInputField(1, Keys.ARROW_DOWN);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "0");
    }

    @Test
    public void send50ArrowUpAnd25ArrowDownTest() {

        inputsPage.openPage();
        isFieldEmpty();

        inputsPage.sendToInputField(50, Keys.ARROW_UP);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "50");

        inputsPage.sendToInputField(25, Keys.ARROW_DOWN);

        Assert.assertEquals(
                inputsPage.getInputFieldText(), "25");
    }


    private void sendStringAndAssert(String toSend, String expectedResult) {

        inputsPage.sendToInputField(1, toSend);

        Assert.assertEquals(
                inputsPage.getInputFieldText(),
                expectedResult);
    }

    @Test
    public void sendEnglish_LowCase_Alphabet() {

        inputsPage.openPage();
        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendEnglish_LowCase_Alphabet,
                Values.expectedEnglish_LowCase_Alphabet);
    }

    @Test
    public void sendEnglish_UpCase_AlphabetTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendEnglish_UpCase_Alphabet,
                Values.expectedEnglish_UpCase_Alphabet);
    }

    @Test
    public void sendEnglish_MixedCase_AlphabetTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendEnglish_MixedCase_Alphabet,
                Values.expectedEnglish_MixedCase_Alphabet);
    }

    @Test
    public void sendEnglish_MixedCase_AlphabetAndNumbersTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendEnglish_MixedCase_AlphabetAndNumbers,
                Values.expectedEnglish_MixedCase_AlphabetAndNumbers);
    }

    @Test
    public void sendRussian_LowCase_AlphabetTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendRussian_LowCase_Alphabet,
                Values.expectedRussian_LowCase_Alphabet);
    }

    @Test
    public void sendRussian_UpCase_AlphabetTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendRussian_UpCase_Alphabet,
                Values.expectedRussian_UpCase_Alphabet);
    }

    @Test
    public void sendRussian_MixedCase_AlphabetTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendRussian_MixedCase_Alphabet,
                Values.expectedRussian_MixedCase_Alphabet);
    }

    @Test
    public void sendRussian_MixedCase_AlphabetAndNumbersTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendRussian_MixedCase_AlphabetAndNumbers,
                Values.expectedRussian_MixedCase_AlphabetAndNumbers);
    }

    @Test
    public void sendCommaTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendComma,
                Values.expectedComma);
    }

    @Test
    public void sendDotTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendDot,
                Values.expectedDot);
    }

    @Test
    public void sendPunctuationTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendPunctuation,
                Values.expectedPunctuation);
    }

    @Test
    public void sendIntTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendInt,
                Values.expectedInt);
    }

    @Test
    public void sendNegativeIntTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendNegativeInt,
                Values.expectedNegativeInt);
    }

    @Test
    public void sendLongIntTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendLongInt,
                Values.expectedLongInt);
    }

    @Test
    public void sendRealTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendReal,
                Values.expectedReal);
    }

    @Test
    public void sendIntWithExponentTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendIntWithExponent,
                Values.expectedIntWithExponent);
    }

    @Test
    public void sendIntWithNegativeExponentTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendIntWithNegativeExponent,
                Values.expectedIntWithNegativeExponent);
    }

    @Test
    public void sendIntWith2ExponentsTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendIntWith2Exponents,
                Values.expectedIntWith2Exponents);
    }

    @Test
    public void sendIntWith2MinusesTest() {

        inputsPage.openPage();

        isFieldEmpty();

        sendStringAndAssert(
                Values.toSendIntWith2Minuses,
                Values.expectedIntWith2Minuses);
    }

}
