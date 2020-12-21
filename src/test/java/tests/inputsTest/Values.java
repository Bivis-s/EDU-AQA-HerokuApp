package tests.inputsTest;

public class Values {
    public static final String toSendEnglish_LowCase_Alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    public static final String expectedEnglish_LowCase_Alphabet = "null";

    public static final String toSendEnglish_UpCase_Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String expectedEnglish_UpCase_Alphabet = "null";

    public static final String toSendEnglish_MixedCase_Alphabet = "ABCabcdDefgNOPQRShijklmnopqKLMTUVWrsFGHtuvwxyzEIJXYZ";
    public static final String expectedEnglish_MixedCase_Alphabet = "null";

    public static final String toSendEnglish_MixedCase_AlphabetAndNumbers = "ABCa1bc3dDefgNOPQRShijklmnopqKLMTUVWrsFGHtuv5wxyzEIJXYZ";
    public static final String expectedEnglish_MixedCase_AlphabetAndNumbers = "1300000";


    public static final String toSendRussian_LowCase_Alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final String expectedRussian_LowCase_Alphabet = "null";

    public static final String toSendRussian_UpCase_Alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String expectedRussian_UpCase_Alphabet = "null";

    public static final String toSendRussian_MixedCase_Alphabet = "АБВабвгдеёАБВжийклКЛМНОПТУФэюяабвгдеХЦЧШЩЫЬЭЮЯпрстуфхАВКЛМОПбвгдеёРСТУФХЦЧШЬЭЮЯ";
    public static final String expectedRussian_MixedCase_Alphabet = "null";

    public static final String toSendRussian_MixedCase_AlphabetAndNumbers = "АБВ03абвгдеёАБВжийклК5ЛМНОПТУФэюяабв1гдеХ3ЦЧШ2ЩЫЬЭЮЯ0прстуф4хА5ВКЛМОПбвгд6её123456789РСТУ8ФХЦЧШЬЭЮЯ";
    public static final String expectedRussian_MixedCase_AlphabetAndNumbers = "3513204561234567680";


    public static final String toSendComma = ",";
    public static final String expectedComma = "null";

    public static final String toSendDot = ".";
    public static final String expectedDot = "null";

    public static final String toSendPunctuation = "!.,?";
    public static final String expectedPunctuation = "null";


    public static final String toSendInt = "0123456789";
    public static final String expectedInt = "123456789";

    public static final String toSendNegativeInt = "-0123456789";
    public static final String expectedNegativeInt = "-123456789";

    public static final String toSendLongInt = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
    public static final String expectedLongInt = "null";

    public static final String toSendReal = "3,14";
    public static final String expectedReal = "3.14";

    public static final String toSendIntWithExponent = "3e567";
    public static final String expectedIntWithExponent = "null";

    public static final String toSendIntWithNegativeExponent = "3e-5";
    public static final String expectedIntWithNegativeExponent = "3.0E-5";

    public static final String toSendIntWith2Exponents = "5e3e34";
    public static final String expectedIntWith2Exponents = "null";

    public static final String toSendIntWith2Minuses = "--43425";
    public static final String expectedIntWith2Minuses = "null";
}
