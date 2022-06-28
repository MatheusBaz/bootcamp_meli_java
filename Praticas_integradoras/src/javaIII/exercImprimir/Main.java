package javaIII.exercImprimir;

public class Main {
    public static void main(String[] args) {
        LivrosPdf livrosPdf = new LivrosPdf(250, "Ricardo Da Costa", "Programando", "Educação");
        Curriculo curriculo = new Curriculo(new Pessoa("Fulano", 21, "Masculino", "UFSC"), new String[] {"Agil", "Amigável", "Inteligente"} );
        Relatorio relatirio = new Relatorio(50,35, "Augusto Silveira", "João Ferreira");

        Impressora.imprimir(curriculo);
        Impressora.imprimir(relatirio);
        Impressora.imprimir(livrosPdf);
    }
}
