package javaIII.exercAnimais;

public class Vaca extends Animal implements Alimentacao{

    @Override
    public String comerCarne() {
        return "Esse animal é herbívoro!";
    }

    @Override
    public String comerPasto() {
        return "A vaca comeu o pasto!";
    }

    @Override
    public String emitirSom() {
        return "Muuu";
    }
}
