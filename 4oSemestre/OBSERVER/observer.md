```plaintext
                         <<interface>>
                       +------------------+
                       |     Observer     |
                       +------------------+
                       | + update(String) |
                       +------------------+
                               ▲
                               |
                     +----------------------+
                     |     Dispositivo      |
                     +----------------------+
                     | - nome: String       |
                     +----------------------+
                     | + Dispositivo(nome)  |
                     | + update(String)     |
                     +----------------------+

+--------------------------------------------------+
|                    Estacao                       |
+--------------------------------------------------+
| - observadores: List<Observer>                   |
+--------------------------------------------------+
| + adicionarObservador(Observer): void            |
| + removerObservador(Observer): void              |
| + notificarObservadores(String): void            |
| + novaLeitura(String): void                      |
+--------------------------------------------------+


