package javaIII.exercImprimir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curriculo{
    public Curriculo(Pessoa pessoa, String[] habilidades) {
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    Pessoa pessoa;
    String[] habilidades;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidades=" + Arrays.toString(habilidades) +
                '}';
    }
}
