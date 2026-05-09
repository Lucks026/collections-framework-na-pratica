# Collections Framework na Prática

Estava estudando Collections em Java e queria testar cada estrutura em algo real. Usei o contexto de uma clínica médica porque envolve filas, buscas rápidas e listas ordenadas — situações que deixam claro por que a escolha da estrutura importa.

Cada arquivo de exemplo roda de forma independente. Só JDK, sem dependência externa.

---

## Qual estrutura usar pra quê

| Estrutura | Por que usar | Onde aparece aqui |
|---|---|---|
| `ArrayList` | `get(i)` é O(1). Bom quando a posição na lista importa | Cadastro de pacientes na recepção |
| `LinkedList` | Inserção e remoção nas pontas são O(1). No ArrayList isso seria O(n) | Fila de espera para consulta |
| `HashSet` | Unicidade garantida sem checar manualmente. `contains()` em O(1) | Controle de CPFs cadastrados |
| `HashMap` | Busca por chave em O(1), independente de quantos registros tem | Triagem: CPF → Paciente |
| `TreeMap` | Ordena pela chave automaticamente. Sem precisar chamar sort | Relatório de pacientes por nome |

---

## Como rodar

JDK 11 ou superior. Só isso.

```bash
# Compilar a partir da raiz do projeto
javac -d out -sourcepath src src/Main.java

# Rodar
java -cp out Main
```

---

## Estrutura

```
collections-framework-na-pratica/
├── src/
│   ├── model/
│   │   └── Paciente.java
│   ├── exemplos/
│   │   ├── ExemploArrayList.java
│   │   ├── ExemploLinkedList.java
│   │   ├── ExemploHashSet.java
│   │   ├── ExemploHashMap.java
│   │   └── ExemploTreeMap.java
│   └── Main.java
└── README.md
```

`Paciente.java` é a base de tudo: nome, CPF, idade, especialidade. O `equals()` e `hashCode()` foram implementados pelo CPF — sem isso, o HashSet e o HashMap não funcionam como esperado.

---

## Autor

Lucas — [github.com/Lucks026](https://github.com/Lucks026)
