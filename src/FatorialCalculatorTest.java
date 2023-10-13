import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FatorialCalculatorTest {

    @Test
    @DisplayName("0! = 1")
    public void testCalcularFatorialZero() {
        FatorialCalculator calculator = new FatorialCalculator();
        long resultado = calculator.calcularFatorial(0);
        assertEquals(1L, resultado);
    }

    @Test
    @DisplayName("1! = 1")
    public void testCalcularFatorialUm() {
        FatorialCalculator calculator = new FatorialCalculator();
        long resultado = calculator.calcularFatorial(1);
        assertEquals(1L, resultado);
    }

    @Test
    @DisplayName("20! = 2432902008176640000")
    public void testCalcularFatorialVinte() {
        FatorialCalculator calculator = new FatorialCalculator();
        long resultado2 = calculator.calcularFatorial(2);
        long resultado3 = calculator.calcularFatorial(3);
        long resultado4 = calculator.calcularFatorial(4);
        long resultado5 = calculator.calcularFatorial(5);
        long resultado6 = calculator.calcularFatorial(6);
        long resultado7 = calculator.calcularFatorial(7);
        long resultado8 = calculator.calcularFatorial(8);
        long resultado9 = calculator.calcularFatorial(9);
        long resultado10 = calculator.calcularFatorial(10);
        long resultado11 = calculator.calcularFatorial(11);
        long resultado12 = calculator.calcularFatorial(12);
        long resultado13 = calculator.calcularFatorial(13);
        long resultado14 = calculator.calcularFatorial(14);
        long resultado15 = calculator.calcularFatorial(15);
        long resultado16 = calculator.calcularFatorial(16);
        long resultado17 = calculator.calcularFatorial(17);
        long resultado18 = calculator.calcularFatorial(18);
        long resultado19 = calculator.calcularFatorial(19);
        long resultado20 = calculator.calcularFatorial(20);
        assertEquals(2L, resultado2);
        assertEquals(6L, resultado3);
        assertEquals(24L, resultado4);
        assertEquals(120L, resultado5);
        assertEquals(720L, resultado6);
        assertEquals(5040L, resultado7);
        assertEquals(40320L, resultado8);
        assertEquals(362880L, resultado9);
        assertEquals(3628800L, resultado10);
        assertEquals(39916800L, resultado11);
        assertEquals(479001600L, resultado12);
        assertEquals(6227020800L, resultado13);
        assertEquals(87178291200L, resultado14);
        assertEquals(1307674368000L, resultado15);
        assertEquals(20922789888000L, resultado16);
        assertEquals(355687428096000L, resultado17);
        assertEquals(6402373705728000L, resultado18);
        assertEquals(121645100408832000L, resultado19);
        assertEquals(2432902008176640000L, resultado20);
    }

    @Test
    @DisplayName("Fatorial de um número negativo qualquer deve lançar IllegalArgumentException")
    public void testCalcularFatorialNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            FatorialCalculator calculator = new FatorialCalculator();
            calculator.calcularFatorial(-1);
        });
    }
}