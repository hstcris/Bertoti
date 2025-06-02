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

+----------------------------------------------+
|                    App                       |
+----------------------------------------------+
| + main(String[] args): void                  |
+----------------------------------------------+
| - Cria uma Estacao                           |
| - Cria dois Dispositivos                     |
| - Adiciona observadores à estação            |
| - Envia duas leituras climáticas             |
| - Remove observadores                        |
+----------------------------------------------+
