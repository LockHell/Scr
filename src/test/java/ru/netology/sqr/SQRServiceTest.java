package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "0,10,99",
            "3,200,300",
            "90,100,9801",
            "0, 9,-9801"
    })
    public void accordingToTheCondition(int expected, int x, int y) {
        SQRService service = new SQRService();

        // подготавливаем данные:
        //int expected = 0;
        // вызываем целевой метод:
        int actual = service.calcSqr(x, y);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}