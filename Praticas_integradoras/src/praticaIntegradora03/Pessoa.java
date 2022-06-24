package praticaIntegradora03;

public class Pessoa {
    String nome;
    int idade;
    String id;
    double peso;
    double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / Math.pow(this.altura,2);

        if (imc < 20) {
            return -1;
        } else if (imc > 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaioridade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
