                      <<interface>>
+--------------------------------------+
|              Componente              |
+--------------------------------------+
| + exibir(identacao: String): void    |
+--------------------------------------+
           ▲                     ▲
           |                     |
           |                     |
+------------------+     +-----------------------------------------------+
|   Funcionario    |     |               Departamento                    |
+------------------+     +-----------------------------------------------+
| - nome: String   |     | - nomeDepartamento: String                    |
+------------------+     | - componentes: List<Componente>               |
| + Funcionario()  |     +-----------------------------------------------+
| + exibir()       |     | + Departamento(String)                        |
+------------------+     | + adicionarComponente(Componente): void       |
                         | + removerComponente(Componente): void         |
                         | + exibir(identacao: String): void             |
                         +-----------------------------------------------+
                                 ◇
                                 |
                         [Agregação com]
                            Componente

+--------------------------------------------------------+
|                        App                             |
+--------------------------------------------------------+
| + main(String[] args): void                            |
+--------------------------------------------------------+
| - Cria funcionários                                    |
| - Cria departamentos                                   |
| - Adiciona componentes a outros componentes            |
| - Chama exibir() para exibir a estrutura composta      |
+--------------------------------------------------------+
