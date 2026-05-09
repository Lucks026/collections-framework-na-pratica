import exemplos.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Collections Framework — Clínica Médica ║");
        System.out.println("╚══════════════════════════════════════════╝\n");

        ExemploArrayList.executar();
        separador();

        ExemploLinkedList.executar();
        separador();

        ExemploHashSet.executar();
        separador();

        ExemploHashMap.executar();
        separador();

        ExemploTreeMap.executar();

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║        Todos os exemplos executados       ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    private static void separador() {
        System.out.println("\n" + "─".repeat(50) + "\n");
    }
}
