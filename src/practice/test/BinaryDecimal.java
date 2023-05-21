package practice.test;

public class BinaryDecimal {
    public static int countDifferingDigits(int decimalValue, String binaryValue) {
        // Convert decimal value to binary string
        String decimalBinary = Integer.toBinaryString(decimalValue);

        // Pad the binary value and decimal binary with leading zeros if necessary
        int maxLength = Math.max(decimalBinary.length(), binaryValue.length());
        binaryValue = String.format("%" + maxLength + "s", binaryValue).replace(' ', '0');
        decimalBinary = String.format("%" + maxLength + "s", decimalBinary).replace(' ', '0');

        // Count the number of differing digits
        int differingDigits = 0;
        for (int i = 0; i < maxLength; i++) {
            if (decimalBinary.charAt(i) != binaryValue.charAt(i)) {
                differingDigits++;
            }
        }

        return differingDigits;
    }



    public static void main(String[] args) {
        int decimalValue = 56;
        String binaryValue = "0010111111001";

        int decimalValue1 = 44;
        String binaryValue1 = "111111";

        int differingDigits = countDifferingDigits(decimalValue, binaryValue);
        System.out.println("Number of differing digits: " + differingDigits);
    }
}

