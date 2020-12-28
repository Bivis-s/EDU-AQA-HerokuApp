package tests.inputs_test;

public class Values {
    public static final String TO_SEND_ENGLISH_LOW_CASE_ALPHABET = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    public static final String EXPECTED_ENGLISH_LOW_CASE_ALPHABET = "null";

    public static final String TO_SEND_ENGLISH_UP_CASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String EXPECTED_ENGLISH_UP_CASE_ALPHABET = "null";

    public static final String TO_SEND_ENGLISH_MIXED_CASE_ALPHABET = "ABCabcdDefgNOPQRShijklmnopqKLMTUVWrsFGHtuvwxyzEIJXYZ";
    public static final String EXPECTED_ENGLISH_MIXED_CASE_ALPHABET = "null";

    public static final String TO_SEND_ENGLISH_MIXED_CASE_ALPHABET_AND_NUMBERS = "ABCa1bc3dDefgNOPQRShijklmnopqKLMTUVWrsFGHtuv5wxyzEIJXYZ";
    public static final String EXPECTED_ENGLISH_MIXED_CASE_ALPHABET_AND_NUMBERS = "1300000";

    public static final String TO_SEND_RUSSIAN_LOW_CASE_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final String EXPECTED_RUSSIAN_LOW_CASE_ALPHABET = "null";

    public static final String TO_SEND_RUSSIAN_UP_CASE_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String EXPECTED_RUSSIAN_UP_CASE_ALPHABET = "null";

    public static final String TO_SEND_RUSSIAN_MIXED_CASE_ALPHABET = "АБВабвгдеёАБВжийклКЛМНОПТУФэюяабвгдеХЦЧШЩЫЬЭЮЯпрстуфхАВКЛМОПбвгдеёРСТУФХЦЧШЬЭЮЯ";
    public static final String EXPECTED_RUSSIAN_MIXED_CASE_ALPHABET = "null";

    public static final String TO_SEND_RUSSIAN_MIXED_CASE_ALPHABET_AND_NUMBERS = "АБВ03абвгдеёАБВжийклК5ЛМНОПТУФэюяабв1гдеХ3ЦЧШ2ЩЫЬЭЮЯ0прстуф4хА5ВКЛМОПбвгд6её123456789РСТУ8ФХЦЧШЬЭЮЯ";
    public static final String EXPECTED_RUSSIAN_MIXED_CASE_ALPHABET_AND_NUMBERS = "3513204561234567680";

    public static final String TO_SEND_COMMA = ",";
    public static final String EXPECTED_COMMA = "null";

    public static final String TO_SEND_DOT = ".";
    public static final String EXPECTED_DOT = "null";

    public static final String TO_SEND_PUNCTUATION = "!.,?";
    public static final String EXPECTED_PUNCTUATION = "null";

    public static final String TO_SEND_INT = "0123456789";
    public static final String EXPECTED_INT = "123456789";

    public static final String TO_SEND_NEGATIVE_INT = "-0123456789";
    public static final String EXPECTED_NEGATIVE_INT = "-123456789";

    public static final String TO_SEND_LONG_INT = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
    public static final String EXPECTED_LONG_INT = "null";

    public static final String TO_SEND_REAL = "3,14";
    public static final String EXPECTED_REAL = "3.14";

    public static final String TO_SEND_INT_WITH_EXPONENT = "3e567";
    public static final String EXPECTED_INT_WITH_EXPONENT = "null";

    public static final String TO_SEND_INT_WITH_NEGATIVE_EXPONENT = "3e-5";
    public static final String EXPECTED_INT_WITH_NEGATIVE_EXPONENT = "3.0E-5";

    public static final String TO_SEND_INT_WITH_2_EXPONENTS = "5e3e34";
    public static final String EXPECTED_INT_WITH_2_EXPONENTS = "null";

    public static final String TO_SEND_INT_WITH_2_MINUSES = "--43425";
    public static final String EXPECTED_INT_WITH_2_MINUSES = "null";
}
