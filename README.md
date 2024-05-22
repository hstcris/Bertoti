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

  - Engenharia de Software não é só programar

   Within Google, we sometimes say, “Software engineering is programming integrated over time.” 
Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. 
If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). 
The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. 
Software engineering isn’t programming.

  Interpretação:
 Com base no texto, podemos dizer que engenharia de software é programação mas que não se resume apenas isso, é tempo, escala e trade-offs. O conceito de Trade-off é de grande importância para essa área de atuação, pois haverá situações onde são necessárias escolhas onde um perde de um lado para ganhar outro, e cabe aos profissionais da área verem quais as condições serão mais viáveis para o futuro projeto.

2.     1º trade-off - Meu sistema tem muito segurança para o usúario mas isso acaba diminuindo a usabilidade

    2º trade-off - Meu sistema processa muitos dados rapidamente, mas eles demoram muito para serem lidos o que acaba atrapalhando
    na hora de buscar os dados

    3º trade-off - Meu sistema tem uma grande facilidade ao ser desenvolvido mas ele acaba não tem um grande desempenho em grande escala
