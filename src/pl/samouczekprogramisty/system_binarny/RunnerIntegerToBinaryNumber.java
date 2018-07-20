package pl.samouczekprogramisty.system_binarny;

import java.util.Scanner;

public class RunnerIntegerToBinaryNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dziesiętną, która zostanie zamieniona na liczbę binarną.");
        Integer chosenNumber = scanner.nextInt();

        IntegerToBinaryNumber o1 = new IntegerToBinaryNumber();
        System.out.println(o1.changeToBinary(chosenNumber));
        System.out.println("Sprawdzenie: " + chosenNumber.toBinaryString(chosenNumber));
    }
}
