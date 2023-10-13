public class FatorialCalculator {
    public Long calcularFatorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("O fatorial não está definido para números negativos.");
        
        if (n == 0)
            return 1L;

        long res = 1L;
        for (int i = 1; i <= n; i++)
            res = res * i;
        
        return res;
    }
}