```plaintext

        <<Singleton>>
+-----------------------------+
|         SystemConfig        |  
+-----------------------------+
| - instancia: SystemConfig   |
| - idioma: String = "pt-BR"  |
| - tema: String = "escuro"   |
+-----------------------------+
| - SystemConfig()            |
| + getInstancia(): SystemConfig |
| + getIdioma(): String       |
| + getTema(): String         |
+-----------------------------+

               ▲
               |
               | 
               |
+-----------------------------+
|            App              |
+-----------------------------+
| + main(String[] args): void |
+-----------------------------+
| - Obtém instâncias          |
+-----------------------------+
