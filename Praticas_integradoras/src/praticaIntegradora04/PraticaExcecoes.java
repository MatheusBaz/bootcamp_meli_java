package praticaIntegradora04;

public class PraticaExcecoes {
    private int a = 0;
    private int b = 300;

    public void razao() {
        try {
            if (a == 0)
                throw new IllegalArgumentException("Não pode ser dividido por zero!");
            int calc = b/a;
        } catch (IllegalArgumentException ex) {
            System.out.println("Nao pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}


