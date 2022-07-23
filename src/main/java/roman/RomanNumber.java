package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        if (arabicNumber == 5) {
            return "V";
        }
        if (arabicNumber == 4) {
            return "IV";
        }
        return "I".repeat(arabicNumber);
    }
}
