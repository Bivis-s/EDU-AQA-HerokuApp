package tests.inputs_test;

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
        inputsPage = new InputsPage(getDriver());
    }

    @Test
    public void isFieldEmptyTest() {
        inputsPage.openPage();
        Assert.assertTrue(inputsPage.isInputFieldEmpty());
    }

    @Test
    public void send1ArrowUpTest() {
        inputsPage.openPage();

        inputsPage.sendToInputField(1, Keys.ARROW_UP);
        Assert.assertEquals(inputsPage.getInputFieldText(), "1");
    }

    @Test
    public void send25ArrowUpTest() {
        inputsPage.openPage();

        inputsPage.sendToInputField(25, Keys.ARROW_UP);
        Assert.assertEquals(inputsPage.getInputFieldText(), "25");
    }

    @Test
    public void send1ArrowDownTest() {
        inputsPage.openPage();

        inputsPage.sendToInputField(1, Keys.ARROW_DOWN);
        Assert.assertEquals(inputsPage.getInputFieldText(), "-1");
    }

    @Test
    public void send25ArrowDownTest() {
        inputsPage.openPage();

        inputsPage.sendToInputField(25, Keys.ARROW_DOWN);
        Assert.assertEquals(inputsPage.getInputFieldText(), "-25");
    }

    @Test
    public void send1ArrowUpAnd1ArrowDownTest() {
        inputsPage.openPage();

        inputsPage.sendToInputField(1, Keys.ARROW_UP);
        Assert.assertEquals(inputsPage.getInputFieldText(), "1");

        inputsPage.sendToInputField(1, Keys.ARROW_DOWN);
        Assert.assertEquals(inputsPage.getInputFieldText(), "0");
    }

    @Test
    public void send50ArrowUpAnd25ArrowDownTest() {
        inputsPage.openPage();

        inputsPage.sendToInputField(50, Keys.ARROW_UP);
        Assert.assertEquals(inputsPage.getInputFieldText(), "50");

        inputsPage.sendToInputField(25, Keys.ARROW_DOWN);
        Assert.assertEquals(inputsPage.getInputFieldText(), "25");
    }

    private void sendStringAndAssert(String toSend, String expectedResult) {
        inputsPage.sendToInputField(1, toSend);
        Assert.assertEquals(inputsPage.getInputFieldText(), expectedResult);
    }

    @Test
    public void sendEnglish_LowCase_Alphabet() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_ENGLISH_LOW_CASE_ALPHABET, Values.EXPECTED_ENGLISH_LOW_CASE_ALPHABET);
    }

    @Test
    public void sendEnglish_UpCase_AlphabetTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_ENGLISH_UP_CASE_ALPHABET, Values.EXPECTED_ENGLISH_UP_CASE_ALPHABET);
    }

    @Test
    public void sendEnglish_MixedCase_AlphabetTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_ENGLISH_MIXED_CASE_ALPHABET, Values.EXPECTED_ENGLISH_MIXED_CASE_ALPHABET);
    }

    @Test
    public void sendEnglish_MixedCase_AlphabetAndNumbersTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_ENGLISH_MIXED_CASE_ALPHABET_AND_NUMBERS, Values.EXPECTED_ENGLISH_MIXED_CASE_ALPHABET_AND_NUMBERS);
    }

    @Test
    public void sendRussian_LowCase_AlphabetTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_RUSSIAN_LOW_CASE_ALPHABET, Values.EXPECTED_RUSSIAN_LOW_CASE_ALPHABET);
    }

    @Test
    public void sendRussian_UpCase_AlphabetTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_RUSSIAN_UP_CASE_ALPHABET, Values.EXPECTED_RUSSIAN_UP_CASE_ALPHABET);
    }

    @Test
    public void sendRussian_MixedCase_AlphabetTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_RUSSIAN_MIXED_CASE_ALPHABET, Values.EXPECTED_RUSSIAN_MIXED_CASE_ALPHABET);
    }

    @Test
    public void sendRussian_MixedCase_AlphabetAndNumbersTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_RUSSIAN_MIXED_CASE_ALPHABET_AND_NUMBERS, Values.EXPECTED_RUSSIAN_MIXED_CASE_ALPHABET_AND_NUMBERS);
    }

    @Test
    public void sendCommaTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_COMMA, Values.EXPECTED_COMMA);
    }

    @Test
    public void sendDotTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_DOT, Values.EXPECTED_DOT);
    }

    @Test
    public void sendPunctuationTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_PUNCTUATION, Values.EXPECTED_PUNCTUATION);
    }

    @Test
    public void sendIntTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_INT, Values.EXPECTED_INT);
    }

    @Test
    public void sendNegativeIntTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_NEGATIVE_INT, Values.EXPECTED_NEGATIVE_INT);
    }

    @Test
    public void sendLongIntTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_LONG_INT, Values.EXPECTED_LONG_INT);
    }

    @Test
    public void sendRealTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_REAL, Values.EXPECTED_REAL);
    }

    @Test
    public void sendIntWithExponentTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_INT_WITH_EXPONENT, Values.EXPECTED_INT_WITH_EXPONENT);
    }

    @Test
    public void sendIntWithNegativeExponentTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_INT_WITH_NEGATIVE_EXPONENT, Values.EXPECTED_INT_WITH_NEGATIVE_EXPONENT);
    }

    @Test
    public void sendIntWith2ExponentsTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_INT_WITH_2_EXPONENTS, Values.EXPECTED_INT_WITH_2_EXPONENTS);
    }

    @Test
    public void sendIntWith2MinusesTest() {
        inputsPage.openPage();

        sendStringAndAssert(Values.TO_SEND_INT_WITH_2_MINUSES, Values.EXPECTED_INT_WITH_2_MINUSES);
    }
}
