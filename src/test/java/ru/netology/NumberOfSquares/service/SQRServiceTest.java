package ru.netology.NumberOfSquares.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/numberOfSquares.csv")
    public void numberOfSquaresTest(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.numberOfSquares(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
