package praticaIntegradora02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PraticaIntegradora02 {
    Scanner entrada = new Scanner(System.in);
    List<Participante> listaCircuitoPequeno = new ArrayList<>();
    List<Participante> listaCircuitoMedio = new ArrayList<>();
    List<Participante> listaCircuitoAvancado = new ArrayList<>();

    public static void main(String[] args) {
        PraticaIntegradora02 main = new PraticaIntegradora02();

        main.menuPrincipal();
    }

    private void cadastrarDadosParticipante(){

        Participante participante = new Participante();

        System.out.println("Olá, Digite as informações conforme são pedidas!");
        System.out.println("Qual é o RG do participante?");
        participante.setRg(entrada.next());

        System.out.println("Qual é o nome do participante?");
        participante.setNome(entrada.next());

        System.out.println("Qual é o sobrenome do participante?");
        participante.setSobrenome(entrada.next());

        System.out.println("Qual é o idade do participante?");
        participante.setIdade(entrada.nextInt());

        System.out.println("Qual é o numero de contato do participante? (apenas numero)");
        participante.setNumeroDeCelular(entrada.next());

        System.out.println("Um contato de emergencia do participante? (apenas numero)");
        participante.setNumeroDeEmergencia(entrada.next());

        System.out.println("Qual é o tipo sanguíneo do participante?");
        participante.setTipoSanguineo(entrada.next());

        adicionaParticipanteNoCircuito(participante);

    }

    private void adicionaParticipanteNoCircuito (Participante participante) {
        System.out.println("De qual circuito você deseja participar?");
        System.out.println("1 - Circuito pequeno");
        System.out.println("2 - Circuito medio");
        System.out.println("3 - Circuito avancado");

        int circuito = entrada.nextInt();
        switch (circuito){
            case 1:
                circuitoPequeno(participante);
                break;
            case 2:
                circuitoMedio(participante);
                break;
            case 3:
                circuitoAvancado(participante);
                break;
            default:
                System.out.println("Opcao nao conhecida");
        }

    }

    private void mostrarParticipantesDoCircuito () {
        System.out.println("De qual circuito voce deseja ver os participantes?");
        System.out.println("1 - Circuito pequeno");
        System.out.println("2 - Circuito medio");
        System.out.println("3 - Circuito avancado");
        System.out.println("0 - Voltar");

        int circuito = entrada.nextInt();

        percorreArrayCircuitos(circuito);
    }

    private void percorreArrayCircuitos (int circuito) {
        if (circuito == 1) {
            for (Participante participante : listaCircuitoPequeno) {
                System.out.println("Participante numero " + participante.getNumeroInscricao());
                System.out.println("     - Nome completo: " + participante.getNome() + " " + participante.getSobrenome());
                System.out.println("     - RG: " + participante.getRg());
                System.out.println("     - Idade: " + participante.getIdade());
                System.out.println("     - Contato: " + participante.getNumeroDeCelular());
                System.out.println("     - Numero de emergencia: " + participante.getNumeroDeEmergencia());
                System.out.println("     - Tipo sangue: " + participante.getTipoSanguineo());
            }
            mostrarParticipantesDoCircuito();
        }

        if (circuito == 2) {
            for (Participante participante : listaCircuitoMedio) {
                System.out.println("Participante numero " + participante.getNumeroInscricao());
                System.out.println("     - Nome completo: " + participante.getNome() + " " + participante.getSobrenome());
                System.out.println("     - RG: " + participante.getRg());
                System.out.println("     - Idade: " + participante.getIdade());
                System.out.println("     - Contato: " + participante.getNumeroDeCelular());
                System.out.println("     - Numero de emergencia: " + participante.getNumeroDeEmergencia());
                System.out.println("     - Tipo sangue: " + participante.getTipoSanguineo());
            }
            mostrarParticipantesDoCircuito();
        }

        if (circuito == 3) {
            for (Participante participante : listaCircuitoAvancado) {
                System.out.println("Participante numero " + participante.getNumeroInscricao());
                System.out.println("     - Nome completo: " + participante.getNome() + " " + participante.getSobrenome());
                System.out.println("     - RG: " + participante.getRg());
                System.out.println("     - Idade: " + participante.getIdade());
                System.out.println("     - Contato: " + participante.getNumeroDeCelular());
                System.out.println("     - Numero de emergencia: " + participante.getNumeroDeEmergencia());
                System.out.println("     - Tipo sangue: " + participante.getTipoSanguineo());
            }
            mostrarParticipantesDoCircuito();
        }

        if (circuito == 0) {
            menuPrincipal();
        }
    }

    private void cancelarCadastroParticipante () {
        System.out.println("Qual o nome do participante??");
        System.out.println("1 - Circuito pequeno");
        System.out.println("2 - Circuito medio");
        System.out.println("3 - Circuito avancado");
        System.out.println("0 - Voltar");

        int circuito = entrada.nextInt();

        percorreArrayCircuitos(circuito);
    }

    private void circuitoPequeno (Participante participante) {
        if (participante.getIdade() < 18) {
            System.out.println("O valor para esse circuito para a sua idade é de R$ 1300, deseja confirmar? (sim ou nao)");
            String resposta = entrada.next();

            if (resposta.equals("Sim") || resposta.equals("sim")) {
                int numeroParticipante = incrementaNumeroParticipante(listaCircuitoPequeno);
                participante.setNumeroInscricao(numeroParticipante);
                listaCircuitoPequeno.add(participante);
                System.out.println("Voce foi inscrito no circuito!");
                menuPrincipal();
            } else {
                System.out.println("Ok, Nada foi feito!");
                adicionaParticipanteNoCircuito(participante);
            }
        } else {
            System.out.println("O valor para esse circuito para a sua idade é de R$ 1500, deseja confirmar? (sim ou nao)");
            String resposta = entrada.next();

            if (resposta.equals("Sim") || resposta.equals("sim")) {
                int numeroParticipante = incrementaNumeroParticipante(listaCircuitoPequeno);
                participante.setNumeroInscricao(numeroParticipante);
                listaCircuitoPequeno.add(participante);
                System.out.println("Voce foi inscrito no circuito!");
                menuPrincipal();
            } else {
                System.out.println("Ok, Nada foi feito!");
                adicionaParticipanteNoCircuito(participante);
            }
        }
    }

    private void circuitoMedio (Participante participante) {
        if (participante.getIdade() < 18) {
            System.out.println("O valor para esse circuito para a sua idade é de R$ 2000, deseja confirmar? (sim ou nao)");
            String resposta = entrada.next();

            if (resposta.equals("Sim") || resposta.equals("sim")) {
                int numeroParticipante = incrementaNumeroParticipante(listaCircuitoMedio);
                participante.setNumeroInscricao(numeroParticipante);
                listaCircuitoMedio.add(participante);
                System.out.println("Voce foi inscrito no circuito!");
                menuPrincipal();
            } else {
                System.out.println("Ok, Nada foi feito!");
                adicionaParticipanteNoCircuito(participante);
            }
        } else {
            System.out.println("O valor para esse circuito para a sua idade é de R$ 2300, deseja confirmar? (sim ou nao)");
            String resposta = entrada.next();

            if (resposta.equals("Sim") || resposta.equals("sim")) {
                int numeroParticipante = incrementaNumeroParticipante(listaCircuitoMedio);
                participante.setNumeroInscricao(numeroParticipante);
                listaCircuitoMedio.add(participante);
                System.out.println("Voce foi inscrito no circuito!");
                menuPrincipal();
            } else {
                System.out.println("Ok, Nada foi feito!");
                adicionaParticipanteNoCircuito(participante);
            }
        }
    }

    private void circuitoAvancado (Participante participante) {
        if (participante.getIdade() < 18) {
            System.out.println("Voce nao pode participar desse circuito!");
            adicionaParticipanteNoCircuito(participante);
        } else {
            System.out.println("O valor para esse circuito é de R$ 2800, deseja confirmar? (sim ou nao)");
            String resposta = entrada.next();

            if (resposta.equals("Sim") || resposta.equals("sim")) {
                int numeroParticipante = incrementaNumeroParticipante(listaCircuitoAvancado);
                participante.setNumeroInscricao(numeroParticipante);
                listaCircuitoAvancado.add(participante);
                System.out.println("Voce foi inscrito no circuito!");
                menuPrincipal();
            } else {
                System.out.println("Ok, Nada foi feito!");
                adicionaParticipanteNoCircuito(participante);
            }
        }
    }

    private int incrementaNumeroParticipante(List<Participante> listaCircuito) {
        return listaCircuito.size() + 1;
    }

    private void menuPrincipal() {
        System.out.println("Olá, o que você deseja fazer? (digite o número da opção)");
        System.out.println("1 - Inscrever participante");
        System.out.println("2 - Mostrar dados dos participantes");
        System.out.println("3 - Excluir um participante");
        System.out.println("0 - Encerrar");
        int escolhaUser = entrada.nextInt();

        switch (escolhaUser) {
            case 1:
                cadastrarDadosParticipante();
                break;
            case 2:
                mostrarParticipantesDoCircuito();
                break;
            case 3:
                cancelarCadastroParticipante();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção não conhecida, tente novamente!");
                menuPrincipal();
                break;
        }

    }
}