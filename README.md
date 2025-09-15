Música dos Animais ->  Este é um projeto feito em Java como parte dos meus estudos de Programação Orientada a Objetos (POO), no programa SERRATEC/ TIC-software.  
A imersão que o programa oferece nessa etapa é sobre conceitos como herança, polimorfismo e encapsulamento.

Sobre:
A ideia é reproduzir uma música infantil onde cada animal canta seu som característico.  
A cada estrofe, um novo animal é apresentado e os anteriores repetem seus sons em ordem reversa.

Exemplo de saída:
- Lá em casa tinha um pintinho
- Lá em casa tinha um pintinho
- E o pintinho piu
- E o pintinho piu 
- E o pintinho piu
- E o pintinho piu
- E o pintinho piu 
- E o pintinho piu

Utilizei os seguintes pilares de POO

- Herança: todos os animais herdam da classe `Animal`. -> É como passar o sobrenome da família para os filhos — eles já nascem com habilidades herdadas.
   (Os pacotes organizam e evitam conflito durante a execução do código)
  
- Polimorfismo: uso de uma lista de `Animal` para tratar diferentes tipos. -> É como ter um mágico que se transforma conforme a plateia — o mesmo comando, vários comportamentos.
   (Cada animal é uma classe, e apenas a `Animal` foi usada a opção de classe abstrata para centralizar os atributos e métodos e toda mudança feita na abstrata as subclasses herdam)
  
- Encapsulamento: atributos privados e métodos `get`. -> É como guardar segredos numa caixinha com chave — só quem tem acesso pode mexer lá dentro.
 (*Não foi necessário o uso de `set`, pois seu uso só é necessário caso haja mudança após a criação do objeto, e nessa música os sons são atributos que não mudam durante a execução do código)

1. Clone o repositório:
   git clone https://github.com/SimoneFrez/MusicaDosAnimais.git

2. Abra o projeto no Eclipse.
3. Execute a classe `MusicaPiu.java`.



Este projeto é simples e feito com o intuito de aprendizado.
Ainda estou aprendendo, então sugestões e dicas são muito bem-vindas!


Feito por Simone — estudante de  e apaixonada por aprender coisas novas.
   
