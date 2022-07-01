package exercGuardaVolumes.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolume {
    HashMap<Integer, List<Vestuario>> guardaRoupa = new HashMap<>();
    Integer identificador;

    public GuardaVolume() {
        this.identificador = 0;
    }

    public Integer guardarRoupa(List<Vestuario> listaDeVestuario) {
        this.identificador += 1;
        this.guardaRoupa.put(this.identificador, listaDeVestuario);
        return this.identificador;
    }

    public void mostrarRoupas() {
        for (Map.Entry<Integer, List<Vestuario>> entrada : this.guardaRoupa.entrySet()) {
            System.out.printf("Roupas guardadas com a identificação %d: \n",entrada.getKey());
            entrada.getValue().stream().forEach(System.out::println);
        }
    }

    public List<Vestuario> getRoupas(Integer numero) {
        return this.guardaRoupa.get(numero);
    }

    public void retirarRoupa(Integer numero) {
        this.guardaRoupa.remove(numero);
        System.out.printf("Roupas retiradas! \n");
    }

}
