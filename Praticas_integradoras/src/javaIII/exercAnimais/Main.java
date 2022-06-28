package javaIII.exercAnimais;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comerCarne());
        System.out.println(cachorro.comerPasto() + "\n");

        System.out.println(gato.emitirSom());
        System.out.println(gato.comerCarne());
        System.out.println(gato.comerPasto() + "\n");

        System.out.println(vaca.emitirSom());
        System.out.println(vaca.comerCarne());
        System.out.println(vaca.comerPasto());
    }
}
