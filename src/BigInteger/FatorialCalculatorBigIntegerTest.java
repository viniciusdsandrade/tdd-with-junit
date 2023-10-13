package BigInteger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FatorialCalculatorBigIntegerTest {

    @Test
    @DisplayName("Fatorial de Zero deve dar 1")
    public void testFatorialDeZero() {
        FatorialCalculatorBigInteger calculator = new FatorialCalculatorBigInteger();
        BigInteger resultado = calculator.calcularFatorial(0);
        assertEquals(BigInteger.ONE, resultado);
    }

    @Test
    @DisplayName("Fatorial de 5 deve dar 120")
    public void testFatorialDeNumeroPositivo() {
        FatorialCalculatorBigInteger calculator = new FatorialCalculatorBigInteger();
        BigInteger resultado = calculator.calcularFatorial(5);
        assertEquals(new BigInteger("120"), resultado);
    }

    @Test
    @DisplayName("Fatorial de um número negativo qualquer deve lançar IllegalArgumentException")
    public void testFatorialDeNumeroNegativo() {
        FatorialCalculatorBigInteger calculator = new FatorialCalculatorBigInteger();
        assertThrows(IllegalArgumentException.class, () -> calculator.calcularFatorial(-1));
    }

    @Test
    @DisplayName("Teste de borda: Fatorial 20")
    public void testFatorialDeNumeroGrande1() {
        FatorialCalculatorBigInteger calculator = new FatorialCalculatorBigInteger();
        BigInteger resultado = calculator.calcularFatorial(20);
        assertEquals(new BigInteger("2432902008176640000"), resultado);
    }

    @Test
    @DisplayName("Teste de borda: Fatorial 112500")
    public void testFatorialDeNumeroGrande2() {
        FatorialCalculatorBigInteger calculator = new FatorialCalculatorBigInteger();
        int n = 60;
        BigInteger resultado = calculator.calcularFatorial(n);
        assertEquals(new BigInteger("8320987112741390144276341183223364380754172606361245952449277696409600000000000000"), resultado);
    }
}
