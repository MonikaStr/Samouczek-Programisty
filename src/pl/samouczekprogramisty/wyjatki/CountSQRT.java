package pl.samouczekprogramisty.wyjatki;
/*
Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
 */
public class CountSQRT {

    public static void countSQRT(double a) throws IllegalArgumentException {
        if (a < 0) {
        throw new IllegalArgumentException();
        }
        System.out.printf("Pierwiastek z %.4f wynosi %.4f.", a, Math.sqrt(a));
    }

}
