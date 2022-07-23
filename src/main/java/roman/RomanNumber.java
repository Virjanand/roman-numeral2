package roman;

public class RomanNumber {
    private final int arabicNumber;

    public RomanNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String toRoman() {
        int counter = arabicNumber;
        String result = "";
        int tens = counter / 10;
        if (tens > 0) {
            result += "X".repeat(tens);
            counter -= tens * 10;
        }
        if (counter == 9) {
            return "IX";
        }
        if (counter / 5 > 0) {
            result += "V";
            counter -= 5;
        }
        if (counter == 4) {
            return result + "IV";
        }
        return result + "I".repeat(counter);
    }
}
