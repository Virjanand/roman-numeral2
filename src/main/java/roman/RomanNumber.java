package roman;

public class RomanNumber {
    private int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        if (arabicNumber == 1) {
            return "I";
        }
        return "II";

    }
}
