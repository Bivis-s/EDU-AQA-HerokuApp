package tests.inputsTest;

public class Values {
    public static final String toSendEnglish_LowCase_Alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    public static final String expectedEnglish_LowCase_Alphabet = "e";

    public static final String toSendEnglish_UpCase_Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String expectedEnglish_UpCase_Alphabet = "E";

    public static final String toSendEnglish_MixedCase_Alphabet = "ABCabcdDefgNOPQRShijklmnopqKLMTUVWrsFGHtuvwxyzEIJXYZ";
    public static final String expectedEnglish_MixedCase_Alphabet = "e";

    public static final String toSendEnglish_MixedCase_AlphabetAndNumbers = "ABCa1bc3dDefgNOPQRShijklmnop5qKLMTUVWrsFGHtuv56wxyzEIJXYZ";
    public static final String expectedEnglish_MixedCase_AlphabetAndNumbers = "13e556";


    public static final String toSendRussian_LowCase_Alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final String expectedRussian_LowCase_Alphabet = "";

    public static final String toSendRussian_UpCase_Alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String expectedRussian_UpCase_Alphabet = "";

    public static final String toSendRussian_MixedCase_Alphabet = "АБВабвгдеёАБВжийклКЛМНОПТУФэюяабвгдеХЦЧШЩЫЬЭЮЯпрстуфхАВКЛМОПбвгдеёРСТУФХЦЧШЬЭЮЯ";
    public static final String expectedRussian_MixedCase_Alphabet = "";

    public static final String toSendRussian_MixedCase_AlphabetAndNumbers = "АБВ03абвгдеёА1БВжийклК5ЛМНОПТУФэюяабв1гдеХ3ЦЧШ2ЩЫЬЭЮЯ0п4рстуф4хА5ВКЛМОПбвгд6её123456789РСТУ8ФХЦЧШЬЭЮЯ";
    public static final String expectedRussian_MixedCase_AlphabetAndNumbers = "0315132044561234567898";


    public static final String toSendComma = ",";
    public static final String expectedComma = ",";

    public static final String toSendDot = ".";
    public static final String expectedDot = ".";

    public static final String toSendPunctuation = "!.,?";
    public static final String expectedPunctuation = ".";


    public static final String toSendInt = "0123456789";
    public static final String expectedInt = "0123456789";

    public static final String toSendNegativeInt = "-0123456789";
    public static final String expectedNegativeInt = "-0123456789";

    public static final String toSendLongInt = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
    public static final String expectedLongInt = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

    public static final String toSendReal = "3,14";
    public static final String expectedReal = "3,14";

    public static final String toSendIntWithExponent = "3e567";
    public static final String expectedIntWithExponent = "3e567";

    public static final String toSendIntWithNegativeExponent = "3e-567";
    public static final String expectedIntWithNegativeExponent = "3e-567";

    public static final String toSendIntWith2Exponents = "5e3e34";
    public static final String expectedIntWith2Exponents = "5e334";

    public static final String toSendIntWith2Minuses = "--43425";
    public static final String expectedIntWith2Minuses = "-43425";
}
