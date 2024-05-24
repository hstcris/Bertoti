1. comentários do livro SWE at Google
2. três exemplos de tradeoffs
3. análise dos requisitos não funcionais e tradeoffs das arquiteturas dos slides 24 à 29
 
--- daqui pra frente tudo aplicado em um sistema que você mesmo escolhe-----
 
4. definição da arquitetura
5. classes uml
6. código java
7. testes

--------------------------------------------------------------------------------------------------------

1. - Engenharia de Software
   We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. 
On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. 
In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. 
Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. 

  Interpretação:
  Os engenheiros de softwares tem algumas diferenças com os programadores em questão de exisgências de projetos, como: 
ser mais preocupado com o tempo que é gasto, a eficiencia e tem muitos decisões que geram um grande risco, 
que as vezes são baseadas em estimativas de tempo imprecisas.

-------------------------------------------------------------------------------------------------------------

   Engenharia de Software não é só programar

   Within Google, we sometimes say, “Software engineering is programming integrated over time.” 
Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. 
If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). 
The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. 
Software engineering isn’t programming.

  Interpretação:
 Com base no texto, podemos dizer que engenharia de software é programação mas que não se resume apenas isso, é tempo, escala e trade-offs. O conceito de Trade-off é de grande importância para essa área de atuação, pois haverá situações onde são necessárias escolhas onde um perde de um lado para ganhar outro, e cabe aos profissionais da área verem quais as condições serão mais viáveis para o futuro projeto.

2. três exemplos de tradeoffs
   
   1º trade-off - Meu sistema tem muito segurança para o usúario mas isso acaba diminuindo a usabilidade

    2º trade-off - Meu sistema processa muitos dados rapidamente, mas eles demoram muito para serem lidos o que acaba atrapalhando
    na hora de buscar os dados

    3º trade-off - Meu sistema tem uma grande facilidade ao ser desenvolvido mas ele acaba não tem um grande desempenho em grande escala

   ---------------------------------------------------------------------------------------------------------------
   3. análise dos requisitos não funcionais e tradeoffs das arquiteturas dos slides 24 à 29
  
 1) 

Layered Architecture Style (Arquitetura em Camadas): Java EE (Enterprise Edition) É uma plataforma robusta para o desenvolvimento de aplicações empresariais, oferecendo uma arquitetura em camadas que promove a modularidade e a manutenibilidade do código. Atributos: Bom: A sua simplicidade proporciona uma fácil compreensão da aplicação, facilitando o desenvolvimento, manutenção e depuração. Em uma arquitetura em camadas, a separação clara de responsabilidades entre as camadas contribui para a simplicidade. No caso do Java EE, ao dividir claramente as camadas, torna-se o desenvolvimento e a manutenção mais simples, promovendo uma clara separação de preocupações.

Ruim: A escalabilidade pode ser limitada em sistemas com uma arquitetura em camadas, especialmente quando há uma grande quantidade de interação entre as camadas. A escalabilidade vertical pode se tornar um desafio. Em sistemas Java EE, a escalabilidade pode ser mais desafiadora, já que a adição de recursos pode ser limitada em cada camada, dificultando a escalabilidade vertical.

2)


Pipeline Architecture Style (Arquitetura de Pipeline): Jenkins É uma ferramenta essencial para integração contínua e entrega contínua, usando arquitetura de pipeline para automatizar o processo de desenvolvimento, desde a compilação até o deploy. Atributos: Bom: O custo total em uma arquitetura de pipeline pode reduzir os custos operacionais e acelerar o ciclo de vida do desenvolvimento. O Jenkins, ao automatizar os processos de integração e entrega contínua, contribui para a eficiência operacional e redução do custo total de desenvolvimento e manutenção.

Ruim: Quando os pipelines são altamente automatizados a tolerância a erros são um desafio. Se um erro ocorrer em uma etapa do pipeline, pode afetar o processo de desenvolvimento e entrega, requerendo monitoramento e intervenção cuidadosa. Em sistemas que dependem fortemente de pipelines, como o Jenkins, a tolerância a erros pode ser crítica. Configurações e scripts precisam ser gerenciados cuidadosamente para evitar falhas que possam comprometer todo o processo.

3) 

Microkernel Architecture Style (Arquitetura de Microkernel): MINIX Um sistema operacional conhecido por sua abordagem de microkernel, visando simplicidade e confiabilidade, ao manter o núcleo mínimo e mover funcionalidades para processos de usuário. Atributos: Bom: O custo total é frequentemente beneficiado pela simplicidade e modularidade oferecidas por uma arquitetura de microkernel. Ao manter o núcleo mínimo e mover funcionalidades para processos de usuário, é possível otimizar o desenvolvimento, a manutenção e a escalabilidade do sistema. O sistema operacional MINIX, com sua arquitetura de microkernel, pode proporcionar benefícios significativos em termos de custo total devido à sua simplicidade e facilidade de extensão.

Ruim: A tolerância a erros pode ser desafiadora, especialmente quando as funcionalidades são distribuídas entre processos de usuário. Erros em um componente podem afetar apenas aquele componente, mas a coordenação entre os componentes pode se tornar complexa e afetar a estabilidade do sistema. Em sistemas baseados em microkernel, como o MINIX, a gestão de erros pode ser mais complexa, pois a interação entre componentes externos pode requerer um cuidadoso tratamento de erros para manter a estabilidade do sistema.

4)


Service-Based Architecture Style (Arquitetura Baseada em Serviços): Salesforce Salesforce é uma plataforma líder em CRM que utiliza uma arquitetura baseada em serviços, permitindo a integração flexível de diferentes módulos e funcionalidades. Atributos: Bom: A arquitetura baseada em serviços, como a adotada pelo Salesforce, facilita a implantabilidade de novos serviços ou atualizações, pois os serviços são independentes e podem ser implantados e atualizados separadamente. O Salesforce permite a adição fácil de novos serviços sem afetar diretamente os serviços existentes, proporcionando uma boa implantabilidade.

Ruim: A elasticidade é um desafio na arquitetura baseada em serviços, pois a escala de cada serviço pode precisar ser gerenciada individualmente. A coordenação entre diferentes serviços para escalar horizontalmente pode ser complexa. Em ambientes onde a elasticidade é crucial, como em sistemas de alta carga, a arquitetura baseada em serviços pode requerer um esforço adicional para gerenciar a escalabilidade eficientemente.

5)
Event-Driven Architecture Style (Arquitetura Orientada a Eventos): Apache Kafka O Kafka é uma poderosa plataforma de streaming de dados, construída com uma arquitetura orientada a eventos. Ela facilita o processamento em tempo real e a comunicação assíncrona em grande escala. Atributos: Bom: A arquitetura orientada a eventos, como implementada pelo Apache Kafka, muitas vezes proporciona excelente desempenho ao lidar com grandes volumes de eventos. A capacidade de processar eventos de forma assíncrona e distribuída pode levar a uma performance superior em comparação com abordagens síncronas. O Apache Kafka, ao processar eventos em tempo real, destaca-se pela sua capacidade de lidar eficientemente com grandes cargas de trabalho, beneficiando-se da arquitetura orientada a eventos para otimizar a performance.

Ruim: A simplicidade pode ser comprometida nesse tipo de arquitetura, especialmente quando há uma complexa lógica de negócios baseada em eventos distribuídos. A gestão de fluxos de eventos, mensagens e garantia de entrega pode adicionar complexidade ao sistema. Em sistemas que dependem fortemente de uma arquitetura orientada a eventos, como o Apache Kafka, a simplicidade pode ser sacrificad

6) 


Microservices Architecture Style (Arquitetura de Microsserviços): Netflix A Netflix, um dos serviços de streaming mais famosos do mundo, é um exemplo notável de uma arquitetura de microsserviços, permitindo escalabilidade e manutenção eficiente por meio da distribuição de funcionalidades em serviços independentes. Atributos: Bom: A modularidade é um benefício chave da arquitetura de microsserviços. Ao dividir uma aplicação em serviços independentes, é possível alcançar maior modularidade. Isso facilita o desenvolvimento, a manutenção e a escalabilidade do sistema. Sistemas como da Netflix, onde diferentes funcionalidades são encapsuladas em serviços separados, demonstram a eficácia da modularidade para facilitar o desenvolvimento e a manutenção.

Ruim: A performance complica as arquiteturas de microsserviços, especialmente em sistemas onde a comunicação entre os serviços é frequente. A latência de rede e o overhead da comunicação entre serviços podem impactar o desempenho global do sistema. Em sistemas com uma arquitetura de microsserviços, a latência introduzida pela comunicação entre serviços, por exemplo, através de APIs HTTP, pode afetar a performance global, exigindo uma cuidadosa consideração do design e otimizações quando necessário.

--------------------------------------------------------------------------------------------------------------

Meu sistema: 
Os trade-offs, positivos e negativos, para um sistema em uma locadora de jogos com uma arquitetura de microsserviços podem basear-se em:

Escalabilidade (positivo): É simplificada, pois cada microsserviço pode ser escalado independentemente, permitindo lidar com cargas específicas de maneira mais eficiente. Isso é particularmente vantajoso em um sistema de locadora de jogos, onde a demanda por diferentes funcionalidades (como catalogação de jogos, registro de locações, etc.) pode variar. Porém, a comunicação entre microsserviços, se não otimizada, pode introduzir latência e impactar a performance global do sistema.

Performance (negativo): A escalabilidade e modularidade podem levar a um aumento na performance em alguns casos. No entanto, é importante monitorar e otimizar a comunicação entre microsserviços para garantir uma experiência de usuário ágil e responsiva.

Modularidade (positivo): É vantajoso em arquiteturas de microsserviços para sistemas como uma locadora de jogos. Cada funcionalidade (como catalogação de jogos, registro de locações, gerenciamento de contas de clientes, etc.) é tratada por um microsserviço independente, facilitando a manutenção e evolução isolada de cada componente. Isso permite que a locadora de jogos adapte e expanda seu sistema de acordo com as necessidades de seu negócio, como a adição de novos recursos ou a integração com outros sistemas.

O conceito do sistema é ser uma locadora de jogos onde eu posso cadastrar novos jogos, clientes e adicionar produtos novos.
