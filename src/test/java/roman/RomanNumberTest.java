package roman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, I",
            "2, II",
            "4, IV",
            "5, V",
            "6, VI",
            "9, IX",
            "10, X",
            "14, XIV",
            "19, XIX",
    })
    void convertArabicToRoman(int arabicNumer, String expectedRomanString) {
        RomanNumber romanNumber = new RomanNumber(arabicNumer);
        assertThat(romanNumber.toRoman()).isEqualTo(expectedRomanString);
    }
}
