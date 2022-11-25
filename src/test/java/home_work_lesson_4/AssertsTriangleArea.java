package home_work_lesson_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssertsTriangleArea {
    private static Logger logger = LoggerFactory.getLogger(AssertsTriangleArea.class);

    @Test
    @DisplayName("Проверка на ожидание")
    void expectations() throws MyException {
        logger.info("Проверка на ожидание");
        TriangleArea exampleClass = new TriangleArea();
        Assertions.assertEquals(11, exampleClass.triangleArea(6, 6, 10));
    }

    @Test
    @DisplayName("Проверка на отрицательные значения")
    @Tag("Triangle_area")
    void test() throws MyException {
        logger.info("Проверка на отрицательные значения");
        TriangleArea exampleClass = new TriangleArea();
        Assertions.assertThrows(MyException.class, () -> exampleClass.triangleArea(-10, 20, 10));
        Assertions.assertThrows(MyException.class, () -> exampleClass.triangleArea(10, -20, 10));
        Assertions.assertThrows(MyException.class, () -> exampleClass.triangleArea(10, 20, -10));

    }

    @ParameterizedTest
    @DisplayName("Проверка на 0")
    @Tag("Triangle_area")
    @CsvSource({"5, 5, 4"})
    void test1(int a, int b, int c) throws MyException {
        logger.info("Проверка на 0");
        TriangleArea exampleClass = new TriangleArea();
        Assertions.assertNotNull(a);
        Assertions.assertNotNull(b);
        Assertions.assertNotNull(c);
        ;
    }

    @ParameterizedTest
    @DisplayName("Треугольник существует!")
    @Tag("Triangle_area")
    @CsvSource({"2, 2, 1"})
    void test2(int a, int b, int c) throws MyException {
        logger.info("Треугольник существует!");
        TriangleArea exampleClass = new TriangleArea();
        Assertions.assertTrue(a + b > c);
        Assertions.assertTrue(a + c > c);
        Assertions.assertTrue(c + b > c);
    }

}
