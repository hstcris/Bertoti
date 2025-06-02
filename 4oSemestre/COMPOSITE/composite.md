## Interface: Componente
+--------------------------+
|      <<interface>>       |
|        Componente        |
+--------------------------+
| + exibir(identacao: String): void |
+--------------------------+

        ▲                ▲
        |                |
        |                |
+------------------+   +--------------------------------------------+
|   Funcionario    |   |              Departamento                  |
+------------------+   +--------------------------------------------+
| - nome: String   |   | - nomeDepartamento: String                 |
+------------------+   | - componentes: List<Componente>            |
| + Funcionario()  |   +--------------------------------------------+
| + exibir()       |   | + Departamento(String)                     |
+------------------+   | + adicionarComponente(Componente): void    |
                       | + removerComponente(Componente): void      |
                       | + exibir(identacao: String): void          |
                       +--------------------------------------------+
                                ◇
                                |
                        [Agregação com]
                            Componente

## Classe: App
+----------------------------------------------+
|                   App                        |
+----------------------------------------------+
| + main(String[] args): void                  |
+----------------------------------------------+
| - Cria funcionários                          |
| - Cria departamentos                         |
| - Adiciona componentes                       |
| - Exibe estrutura composta                   |
+----------------------------------------------+
