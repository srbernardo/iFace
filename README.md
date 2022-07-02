Codigo duplica nas mensagens de entrada
-> resolvido com uma função (src/Mensagem_Inicial.java)

Variaveis com nomes complexos 
-> implementei nomes mais plausíveis ( exemplo app/Amizade/Aceitar.java )

Long Method
-> Extract Method.  (app/Amizade/Aceitar.java )

Codigo duplica nas mensagens de update
-> Extract Method.  (app/Update/Update.java )

Codigo duplica nas funções de tratamento de erro no arquivo Projeto.java
-> Extract Method.  (Projeto.java)

Reorganizei o projeot no geral, tanto suas pastas como nas linhas de codigo, essas ficando com melhor leitura
não enxerguei outros codes smells no codigo, tentei implementar alguma solução para torna mais generico a interface
e reduzir o codigo duplicado no src/Implements fazendo um polimorfismo, mas não foi possivel por conta dos metodos do arraylist