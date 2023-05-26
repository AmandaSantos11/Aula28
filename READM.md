# Aula 28

*Exercícios de Interface*

Nessa aula resolvi dois exercícios utilizando o conceito de Interface que era obrigatório e outros conceitos que foram aprendidos em sala de aula.

<hr>

**No primeiro exercício:**

+ Após a leitura do enunciado compreendi que o objetivo do exercício era criar um sistema que simula a criação de uma lâmpada. A mesma pode ser do tipo incandescente ou fluorescente mas depende da escolha do usuário.


+ **A regra de negócio** que deveria ser seguida era:

  + Ter uma Interface ‘Lampada’ com os métodos ‘ligar()’ e "desligar()", que retornam uma mensagem;
  + Ter 3 classes sendo ‘FabricaLampada’, ‘Incandescente’ e ‘Fluorescente’, sendo que as duas últimas deveriam implementar a Interface;
  + Ter um método chamado ‘construir()’ que recebe um parâmetro e retorna a mensagem que a lâmpada foi criada;
  + Ter uma classe ‘Exercicio01’ com o método 'main()', que deve perguntar ao usuário qual lâmpada ele quer construir, e se quer ligar e desligar a lâmpada.


+ Iniciei o exercício criando minha Interface e os métodos de ‘ligar()’ e ‘desligar()’ ambos do tipo String.


+ Em seguida, criei minhas classes ‘Incandescente’ e ‘Fluorescente’ implementando a Interface, depois sobrescrevi os métodos para que eles mostrassem a seguinte mensagem:

      @Override
        public String ligar() {
        return "A lâmpada está ligada";}

      @Override
        public String desligar() {
        return "A lâmpada está desligada";}



+ A classe ‘FabricaLampada’ foi desenvolvida com o intuito de utilizá-la para interagir com o usuário. Seguindo essa lógica criei dois atributos sendo um o ‘Scanner’ e o outro ‘int escolhaDoUsuario’, o segundo atributo serve para salvar o número digitado do usuário para ser utilizado em outro método. Foi criado também 3 métodos sendo eles:

  + **String interagirComUsuario():**
  Esse método serve para interagir com o usuário perguntando para ele qual tipo de lâmpada deseja criar, sendo ela incandescente ou fluorescente. Em seu return chamo o método 'construir(escolhaDoUsuario)'.

  + **String construir(int escolhaDoUsuario):**
  Esse método foi criado seguindo a regra de negócio e como a mesma pedia ele recebe o parâmetro 'int escolhaDoUsuario' que determina o tipo da lâmpada que foi criada. Utilizando o switch case eu determino a mensagem que deve ser retornada levando em consideração o tipo da lâmpada, ficando da seguinte forma:

        case 1:
          return "Lâmpada incandescente criada";

        case 2:
          return "Lâmpada fluorescente criada";

  + **void interagirComLampada():**
  Através desse método eu permito que o usuário decida se ele quer ligar ou desligar a lâmpada e em seguida retorno às mensagens dos métodos ‘ligar()’ e ‘desligar()’.


+ Na minha classe ‘Exercicio01’ que contém o método main(), eu chamei dois métodos sendo eles:

      System.out.println(FabricaLampada.interagirComUsuario());
      FabricaLampada.interagirComLampada();
<hr>

**No segundo exercício:**

+ O objetivo desse exercício era simular um banco que deve tributar dinheiro dos bens do cliente.


+ **A regra de negócio** que deveria ser seguida era:

  + Criar uma Interface para o cálculo do tributo que deve retornar um double;
  + Para os bens: a ‘ContaPoupanca’ não é tributável, ‘ContaCorrente’ precisa pagar 1% da conta e ‘SeguroDeVida’ tem uma taxa fixa de 42 reais.


+ Inicie o exercício criando a Interface nomeada ‘CalculoDeTributo’ com o método ‘double calculoTributo()’.


+ Em seguida criei a classes ‘Conta’, que contém o atritubo ‘double saldo’ e um construtor que define o valor do saldo como ‘1200’. Optei por seguir utilizando um saldo com valor único para facilitar a implementação do resto do código.


+ Depois criei 3 classes sendo elas ‘ContaPoupanca’, ‘ContaCorrente’ e ‘SeguroDeVida’, todas elas extends da classe ‘Conta’ e implementam a Interface. Após a implementação modifiquei o método de cada classe, ficando assim:

   **‘ContaPoupanca’:**

      @Override
       public double calculoTributo() {
       return 0;}

   **‘ContaCorrente’:**

      @Override
       public double calculoTributo() {
       return (saldo*0.01);}

   **‘SeguroDeVida’:**

      @Override
       public double calculoTributo() {
       return 42;}


+ Retornando a classe ‘Conta’, adicionei um método nomeado ‘mostrarInformacoes()’ que serve para mostrar o valor que será descontado de cada bens do cliente e o saldo atual após o desconto.


+ Por fim, criei uma classe nomeada ‘Main’ que contém o método ‘main()’, que ficou da seguinte forma:

      Conta conta = new Conta();
      conta.mostrarInformacoes();
<hr>

# Conclusão
Através desses exercícios consegui praticar e fixar melhor o conceito de Interface, além de também praticar e utilizar outros conceitos aprendidos anteriormente.





            

