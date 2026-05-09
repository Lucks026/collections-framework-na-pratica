package exemplos;

import model.Paciente;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void executar() {
        System.out.println("=== TreeMap — Relatório Ordenado por Nome ===\n");

        // TreeMap ordena pela chave automaticamente — sem precisar chamar sort depois
        // útil pra gerar relatório diário de pacientes em ordem alfabética
        TreeMap<String, Paciente> relatorio = new TreeMap<>();

        relatorio.put("Carla Souza",   new Paciente("Carla Souza",   "333.444.555-66", 29, "Dermatologia"));
        relatorio.put("Ana Costa",     new Paciente("Ana Costa",     "111.222.333-44", 34, "Cardiologia"));
        relatorio.put("Diego Alves",   new Paciente("Diego Alves",   "444.555.666-77", 62, "Neurologia"));
        relatorio.put("Bruno Lima",    new Paciente("Bruno Lima",    "222.333.444-55", 47, "Ortopedia"));
        relatorio.put("Elena Martins", new Paciente("Elena Martins", "555.666.777-88", 41, "Cardiologia"));

        // já sai em ordem alfabética — inseri fora de ordem mas o TreeMap organiza sozinho
        System.out.println("Pacientes em ordem alfabética:");
        for (Map.Entry<String, Paciente> entrada : relatorio.entrySet()) {
            System.out.println("  " + entrada.getValue());
        }

        // firstKey() e lastKey() só existem no TreeMap — HashMap não tem isso
        System.out.println("\nPrimeiro na lista: " + relatorio.firstKey());
        System.out.println("Último na lista:   " + relatorio.lastKey());

        // subMap retorna um intervalo — todos entre "B" e "E" (E exclusivo)
        System.out.println("\nPacientes entre 'B' e 'E':");
        relatorio.subMap("B", "E").forEach((nome, p) ->
                System.out.println("  " + nome + " | " + p.getEspecialidade()));
    }
}
