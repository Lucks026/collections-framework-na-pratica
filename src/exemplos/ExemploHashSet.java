package exemplos;

import model.Paciente;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

    public static void executar() {
        System.out.println("=== HashSet — Controle de CPFs Únicos ===\n");

        // HashSet porque preciso garantir unicidade, não de ordem
        // contains() aqui é O(1) — no ArrayList seria uma varredura em toda a lista
        Set<String> cpfsCadastrados = new HashSet<>();

        cpfsCadastrados.add("111.222.333-44");
        cpfsCadastrados.add("222.333.444-55");
        cpfsCadastrados.add("333.444.555-66");

        System.out.println("CPFs no sistema: " + cpfsCadastrados.size());

        // tentando cadastrar CPF que já existe — retorna false, não lança exceção
        boolean inserido = cpfsCadastrados.add("111.222.333-44");
        System.out.println("Tentativa de CPF duplicado: " + (inserido ? "inserido" : "já existe, ignorado"));

        String cpfBusca = "222.333.444-55";
        System.out.println("\nCPF " + cpfBusca + " está no sistema? " + cpfsCadastrados.contains(cpfBusca));

        // a ordem que aparece aqui não reflete a ordem de inserção — HashSet não garante isso
        System.out.println("\nTodos os CPFs cadastrados:");
        cpfsCadastrados.forEach(cpf -> System.out.println("  " + cpf));

        // também funciona com objetos Paciente — equals e hashCode usam o CPF
        System.out.println("\n--- Teste com objetos Paciente ---");
        Set<Paciente> pacientes = new HashSet<>();
        Paciente p1 = new Paciente("Ana Costa", "111.222.333-44", 34, "Cardiologia");
        Paciente p1Dup = new Paciente("Ana Costa", "111.222.333-44", 34, "Cardiologia");

        pacientes.add(p1);
        boolean addDup = pacientes.add(p1Dup);
        System.out.println("Paciente duplicado adicionado? " + addDup);
        System.out.println("Total no set: " + pacientes.size()); // deve ser 1
    }
}
