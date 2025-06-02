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
        |                                                        |
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
                                                     
