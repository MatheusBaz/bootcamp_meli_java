package javaII.produtos;

public class Pereciveis extends Produto{
    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public double calcular(int quantidadeDeProdutos) {
        double precoTotal = this.preco * quantidadeDeProdutos;
        if (this.diasParaVencer == 1) {
            return precoTotal / 4;
        } else if (this.diasParaVencer == 2) {
            return precoTotal / 3;
        } else if (this.diasParaVencer == 3) {
            return precoTotal / 2;
        }
        return precoTotal; // se nao entrar em nem um if, return o preco sem decrescimos
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
