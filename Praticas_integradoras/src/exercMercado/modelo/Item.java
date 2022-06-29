package exercMercado.modelo;

public class Item {
    private int codigo;
    private int quantidade;
    private double precoUnitario;
    private String nome;

    public Item(int codigo, int quantidade, double precoUnitario, String nome) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo=" + codigo +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", nome='" + nome + '\'' +
                "} \n";
    }
}
