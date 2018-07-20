package pl.samouczekprogramisty.system_binarny;

/* Spróbuj napisać program, który realizuje algorytm zamiany liczby dzisiętnej na binarną.
   Możesz sprawdzić poprawność wyniku używając metody Integer.toBinaryString.
   Polecam napisanie kilku testów jednostkowych, które sprawdzą poprawność Twojego rozwiązania.
*/
public class IntegerToBinaryNumber {
    StringBuilder binaryNumber = new StringBuilder();
    StringBuilder binaryNumber2 = new StringBuilder();
    int tempResult;
    int remainder;


    public StringBuilder changeToBinary(int chosenNumber) {
        while (chosenNumber > 0) {
            remainder = chosenNumber % 2;
            binaryNumber = binaryNumber.append(remainder);
            chosenNumber = chosenNumber / 2;
        }
        for (int i = binaryNumber.length() - 1; i >= 0 ; i--) {
            binaryNumber2 = binaryNumber2.append(binaryNumber.charAt(i));
        }
        return binaryNumber2;
    }

}
