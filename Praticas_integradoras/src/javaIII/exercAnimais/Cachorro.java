package javaIII.exercAnimais;

public class Cachorro extends Animal{

    @Override
    public String emitirSom() {
        return "Au-Au";
    }

    @Override
    public String comerCarne() {
        return "O cachorro comeu a carne!";
    }

    @Override
    public String comerPasto() {
        return "O cachorro é carnívoro!";
    }
}
