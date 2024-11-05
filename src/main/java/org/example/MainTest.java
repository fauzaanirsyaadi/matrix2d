package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testPrintPosisiRectangularGrid() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.PrintPosisi(4, 4);

        String expectedOutput = "0.0, 0.1, 0.2, 0.3, 1.3, 2.3, 3.3, 3.2, 3.1, 3.0, 2.0, 1.0, 1.1, 1.2, 2.2, 2.1";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out);
    }
}
