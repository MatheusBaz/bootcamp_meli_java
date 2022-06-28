package utils;

import modelo.Conta;

public class MySQL implements BancoDeDados{

    @Override
    public void gravar(Conta conta) {
        System.out.printf("Gravando no BD MySQL a conta numero: %d \n",conta.getNumero());
    }
}
