package javaIII.exercImprimir;

public class LivrosPdf{
    int numeroPaginas;
    String NomeAutor;
    String titulo;
    String genero;

    public LivrosPdf(int numeroPaginas, String nomeAutor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        NomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeAutor() {
        return NomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        NomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LivrosPdf{" +
                "numeroPaginas=" + numeroPaginas +
                ", NomeAutor='" + NomeAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
