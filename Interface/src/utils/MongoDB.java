package utils;

import modelo.Conta;

public class MongoDB implements BancoDeDados{

    @Override
    public void gravar(Conta conta) {
        System.out.printf("Gravando no BD MongoDB a conta numero: %d \n", conta.getNumero());
    }
}
