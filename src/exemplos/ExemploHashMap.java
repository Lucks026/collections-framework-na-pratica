package exemplos;

import model.Paciente;
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void executar() {
        System.out.println("=== HashMap — Triagem por CPF ===\n");

        // HashMap porque a triagem precisa achar o paciente pelo CPF na hora
        // busca O(1) — não importa se tem 10 ou 10 mil pacientes, o tempo é o mesmo
        Map<String, Paciente> prontuario = new HashMap<>();

        Paciente p1 = new Paciente("Ana Costa",     "111.222.333-44", 34, "Cardiologia");
        Paciente p2 = new Paciente("Bruno Lima",    "222.333.444-55", 47, "Ortopedia");
        Paciente p3 = new Paciente("Carla Souza",   "333.444.555-66", 29, "Dermatologia");
        Paciente p4 = new Paciente("Diego Alves",   "444.555.666-77", 62, "Neurologia");

        prontuario.put(p1.getCpf(), p1);
        prontuario.put(p2.getCpf(), p2);
        prontuario.put(p3.getCpf(), p3);
        prontuario.put(p4.getCpf(), p4);

        // busca direta pelo CPF — sem varrer nada
        String cpfTriagem = "222.333.444-55";
        Paciente encontrado = prontuario.get(cpfTriagem);
        System.out.println("Paciente localizado na triagem: " + encontrado);

        // entrySet() dá acesso à chave e ao valor ao mesmo tempo
        System.out.println("\nTodos os pacientes no prontuário:");
        for (Map.Entry<String, Paciente> entrada : prontuario.entrySet()) {
            System.out.println("  " + entrada.getKey() + " -> " + entrada.getValue().getNome());
        }

        // put com a mesma chave substitui — é assim que atualizo a especialidade
        Paciente anaAtualizada = new Paciente("Ana Costa", "111.222.333-44", 34, "Neurologia");
        prontuario.put(anaAtualizada.getCpf(), anaAtualizada);
        System.out.println("\nEspecialidade da Ana após atualização: "
                + prontuario.get("111.222.333-44").getEspecialidade());

        System.out.println("Total no prontuário: " + prontuario.size());
    }
}
