package javaIII.exercImprimir;

public interface Impressora {
    static <T> void imprimir(T obj) {
        System.out.printf("O documento foi impresso: %s \n", obj.toString());
    }
}
