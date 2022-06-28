package javaIII.exercImprimir;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    String instituicao;

    public Pessoa(String nome, int idade, String sexo, String instituicao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", instituicao='" + instituicao + '\'';
    }
}
