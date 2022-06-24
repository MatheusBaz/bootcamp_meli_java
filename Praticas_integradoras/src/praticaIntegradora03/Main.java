package praticaIntegradora03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaConstrutorSimples = new Pessoa();
        Pessoa pessoaConstrutorMedio = new Pessoa("Matheus",25,"MA123");
        Pessoa pessoaConstrutorCompleto = new Pessoa("Matheus",25,"MA123",77.2,1.72);
        //Pessoa PessoaErro = new Pessoa("Matheus",25); // Não deixa, pois não tem construtor para isso

        int resultadoIMC = pessoaConstrutorCompleto.calcularIMC();
        boolean ehMaioridade = pessoaConstrutorCompleto.ehMaioridade();

        if (resultadoIMC == -1) {
            System.out.println("Está abaixo do peso!\n");
        } else if (resultadoIMC == 0) {
            System.out.println("está no peso saudavel\n");
        } else {
            System.out.println("está com sobrepeso!\n");
        }

        if(ehMaioridade) {
            System.out.println("É maior de idade!\n");
        } else {
            System.out.println("É menor de idade!\n");
        }

        System.out.println("Os dados da pessoa são:\n" +
                pessoaConstrutorCompleto.toString());
    }
}
