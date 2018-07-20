package pl.samouczekprogramisty.JVM_przeciazenie_pamieci;
/*
Spróbuj napisać program, który spowoduje przepełnienie sterty i skończy się wyjątkiem java.lang.OutOfMemoryError.
 */
public class OutOfMemmoryError {
    public static void main(String[] args) {
        long[] table = new long[1000000000];

        for (int i = 0; i < table.length; i++) {
            table[i] = i *1000;
        }
    }
}
