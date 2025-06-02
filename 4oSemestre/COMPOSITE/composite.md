```plaintext
                         <<interface>>
                      +---------------------+
                      |     Componente      |
                      +---------------------+
                      | + exibir(String)    |
                      +---------------------+
                             ▲       ▲
                             |       |
        +--------------------+       +---------------------------+
        |                                               
+---------------------+                    +-----------------------------------------+
|     Funcionario     |                    |              Departamento               |
+---------------------+                    +-----------------------------------------+
| - nome: String       |                   | - nomeDepartamento: String              |
+---------------------+                    | - componentes: List<Componente>         |
| + exibir(String)     |                   +-----------------------------------------+
+---------------------+                    | + adicionarComponente(Componente)       |
                                           | + removerComponente(Componente)         |
                                           | + exibir(String)                         |
                                           +-----------------------------------------+
                                                     ◇
                                                     |
                                          [Agregação com Componente]

+--------------------------------------------------------------+
|                            App                               |
+--------------------------------------------------------------+
| + main(String[] args): void                                  |
+--------------------------------------------------------------+
| - Cria funcionários                                          |
| - Cria departamentos                                         |
| - Adiciona componentes a outros componentes                  |
| - Chama exibir() para mostrar a estrutura composta           |
+--------------------------------------------------------------+
