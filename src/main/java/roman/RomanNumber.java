package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        int counter = arabicNumber;
        String result = "";
        if (counter == 10) {
            return "X";
        }
        if (counter == 9) {
            return "IX";
        }
        if (counter / 5 > 0) {
            result += "V";
            counter -= 5;
        }
        if (counter == 4) {
            return "IV";
        }
        return result + "I".repeat(counter);
    }
}
