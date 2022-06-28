package javaIII.exercAnimais;

public class Gato extends Animal implements Alimentacao{

    @Override
    public String emitirSom() {
        return "Miau-Miau";
    }

    @Override
    public String comerCarne() {
        return "O gato comeu a carne!";
    }

    @Override
    public String comerPasto() {
        return "O gato é carnívoro!";
    }
}
