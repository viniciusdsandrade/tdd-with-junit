package BigInteger;

import java.math.BigInteger;

public class FatorialCalculatorBigInteger {
    public BigInteger calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não está definido para números negativos.");
        }

        if (n == 0) {
            return BigInteger.ONE;
        }

        BigInteger resultado = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}
