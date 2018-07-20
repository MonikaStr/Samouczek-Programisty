package pl.samouczekprogramisty.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerCountSQRT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę, której pierwiastek chcesz policzyć.");

        while (true) {
            try {
                double a = scanner.nextDouble();
                CountSQRT.countSQRT(a);
            }
            catch (InputMismatchException ex) {
                System.out.println("Podałeś złą wartość; wprowadź liczbę.");
                scanner.next();
            }
        }


    }
}
