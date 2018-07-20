package pl.samouczekprogramisty.testy;

import org.junit.Before;
import org.junit.Test;
import pl.samouczekprogramisty.system_binarny.IntegerToBinaryNumber;

import static org.junit.Assert.*;

public class IntegerToBinaryNumberTest {

    IntegerToBinaryNumber userInput;

    @Before
    public void setUp() {
        userInput = new IntegerToBinaryNumber();
    }

    @Test
    public void shouldReturnBinaryEquivalent() {
        StringBuilder resultFromMethod = userInput.changeToBinary(int chosenNumber); // coś tu jest do zmiany
        assertEquals(Integer.toBinaryString(chosenNumber), resultFromMethod);
    }

}