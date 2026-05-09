package exemplos;

import model.Paciente;
import java.util.LinkedList;

public class ExemploLinkedList {

    public static void executar() {
        System.out.println("=== LinkedList — Fila de Espera para Consulta ===\n");

        // LinkedList porque inserção e remoção nas pontas são O(1)
        // no ArrayList, remover o primeiro custaria O(n) — em dia cheio na clínica isso somaria
        LinkedList<Paciente> fila = new LinkedList<>();

        fila.addLast(new Paciente("Ana Costa",   "111.222.333-44", 34, "Cardiologia"));
        fila.addLast(new Paciente("Bruno Lima",  "222.333.444-55", 47, "Ortopedia"));
        fila.addLast(new Paciente("Carla Souza", "333.444.555-66", 29, "Dermatologia"));

        System.out.println("Fila de espera:");
        fila.forEach(p -> System.out.println("  " + p.getNome() + " — " + p.getEspecialidade()));

        // chegou um caso de emergência — entra na frente da fila
        Paciente emergencia = new Paciente("Rafael Nunes", "666.777.888-99", 55, "Cardiologia");
        fila.addFirst(emergencia);
        System.out.println("\nEmergência adicionada na frente: " + emergencia.getNome());

        // peek() olha quem está na frente sem remover
        System.out.println("Próximo a ser chamado: " + fila.peek().getNome());

        // chamando os pacientes um por um
        System.out.println("\nChamando pacientes:");
        while (!fila.isEmpty()) {
            Paciente chamado = fila.removeFirst();
            System.out.println("  -> " + chamado.getNome() + " | " + chamado.getEspecialidade());
        }

        System.out.println("Fila encerrada.");
    }
}
