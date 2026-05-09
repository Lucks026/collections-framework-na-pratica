Collections Framework na Pratica

Estava estudando Collections em Java e queria testar cada estrutura em algo real. Usei o contexto de uma clínica médica porque envolve filas, buscas rápidas e listas ordenadas — situações que deixam claro por que a escolha da estrutura importa.
Só JDK, sem dependência externa.

---

| Estrutura | Por que usar | Onde aparece aqui |
|---|---|---|
| `ArrayList` | `get(i)` é O(1). Bom quando a posição na lista importa | Cadastro de pacientes na recepção |
| `LinkedList` | Inserção e remoção nas pontas são O(1). No ArrayList isso seria O(n) | Fila de espera para consulta |
| `HashSet` | Unicidade garantida sem checar manualmente. `contains()` em O(1) | Controle de CPFs cadastrados |
| `HashMap` | Busca por chave em O(1), independente de quantos registros tem | Triagem: CPF pra Paciente |
| `TreeMap` | Ordena pela chave automaticamente. Sem precisar chamar sort | Relatório de pacientes por nome |

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
Feito Por Lucks026 
