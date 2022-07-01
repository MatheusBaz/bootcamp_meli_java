package exercGuardaVolumes;

import exercGuardaVolumes.modelo.GuardaVolume;
import exercGuardaVolumes.modelo.Vestuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vestuario roupa1 = new Vestuario("Nike", "Calça");
        Vestuario roupa2 = new Vestuario("Adidas", "Tenis");

        List<Vestuario> listaDeVestuario = new ArrayList<>();
        listaDeVestuario.add(roupa1);
        listaDeVestuario.add(roupa2);

        GuardaVolume guardaVolume = new GuardaVolume();
        Integer identificador = guardaVolume.guardarRoupa(listaDeVestuario);
        System.out.printf("Numero de identificação: %d \n",identificador);

        guardaVolume.mostrarRoupas();

        guardaVolume.getRoupas(1);

        guardaVolume.retirarRoupa(1);
    }
}
