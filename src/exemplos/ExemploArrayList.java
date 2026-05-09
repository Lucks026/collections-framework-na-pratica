package exemplos;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void executar() {
        System.out.println("=== ArrayList — Cadastro na Recepção ===\n");

        // ArrayList porque a recepção precisa acessar paciente por posição — get(i) é O(1)
        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("Ana Costa",     "111.222.333-44", 34, "Cardiologia"));
        pacientes.add(new Paciente("Bruno Lima",    "222.333.444-55", 47, "Ortopedia"));
        pacientes.add(new Paciente("Carla Souza",   "333.444.555-66", 29, "Dermatologia"));
        pacientes.add(new Paciente("Diego Alves",   "444.555.666-77", 62, "Neurologia"));
        pacientes.add(new Paciente("Elena Martins", "555.666.777-88", 41, "Cardiologia"));

        System.out.println("Pacientes cadastrados:");
        for (Paciente p : pacientes) {
            System.out.println("  " + p);
        }

        // acesso por índice direto — sem percorrer a lista inteira
        System.out.println("\nPrimeiro da fila: " + pacientes.get(0).getNome());
        System.out.println("Último cadastrado: " + pacientes.get(pacientes.size() - 1).getNome());

        // remove pelo objeto, não pelo índice — o equals() compara CPF, então funciona direto
        Paciente paraRemover = pacientes.get(2);
        pacientes.remove(paraRemover);
        System.out.println("\nApós remover " + paraRemover.getNome() + ":");
        pacientes.forEach(p -> System.out.println("  " + p.getNome()));

        System.out.println("\nTotal de pacientes: " + pacientes.size());
    }
}
