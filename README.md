# Java

## Paradigma Procedural vs Objetos 
- Paradigma Procedural: Esse paradigma ainda é usado em algumas linguagens em determinados projetos, nele as instruções devem ser passadas ao computador na sequência em que devem ser executadas, ou seja, o programador passará um passo a passo dos procedimentos que a máquina deverá executar. Dessa forma, o foco da resolução estará em "como deve ser feito". Esse tipo de paradigma é recomendado usar em projetos em que não são esperados que ocorram grandes mudanças ao longo do tempo. Um exemplo de linguagem que usa esse paradigma é o Cobol.

- Paradigma Orientado a Objetos: Esse paradigma surgiu para resolver alguns gargalos da indústria de software, como produzir programas de forma mais rápida e de maior confiabilidade e custo. A proposta foi usar características de classes e objetos para tentar retratar a programação da mesma maneira que enxergamos o mundo real. Nesse paradigma todos os objetos possuem determinados estados e comportamentos, na classe esses estados são definidos como atributos e os comportamentos como métodos. Os alicerces básicos da orientação objetos são herança, encapsulamento e polimorfismo. Um dos maiores exemplos de linguagem que usa esse paradigma é o Java.

- O paradigma procedural é passar as instruções ao computador na sequência em que elas devem ser executadas, possui um código mais estático e difícil de fazer atualizações, seu código fonte é de difícil legibilidade e entendimento. Já o orientado a objetos usa classes e objetos para representar características do mundo real na programação. Esse paradigma é mais simples de entender e de fazer manutenção do código. 

## Instanciação, atributos, referencias
- Para criar uma instancia é necessario usar a palavra reservada new.
- Atributos são as caracteristicas que especificam uma classe.

## Metodo de instância | Metodo de classe
- Métodos da instância, são métodos que somente serão acessíveis caso tu tenha uma referência para o objeto em questão e isso é feita no momento em que realize um “new”.

- Os métodos static ou métodos da classe são funções que não dependem de nenhuma variável de instância, quando invocados executam uma função sem a dependência do conteúdo de um objeto ou a execução da instância de uma classe, conseguindo chamar direto qualquer método da classe e também manipulando alguns campos da classe. Os métodos static tem um relacionamento com uma classe como um todo, enquanto os métodos que não são static são associados a uma instância de classe específica e podem manipular as variáveis de instância do objeto, como pode ser visto nos exemplos de declarações de métodos.

## Default 
- Quando criamos um novo objeto da classe
    - Atributos são zerados 
    - Referencias ficam como null

## Static
- Dentro de um método static não se pode usar this

## Public 
- Declaração com o modificador public pode ser acessada de qualquer lugar e por qualquer entidade que possa visualizar a classe a que ela pertence.

## Private 
- Os membros da classe definidos como private não podem ser acessados ou usados por nenhuma outra classe. 
- Esse modificador não se aplica às classes, somente para seus métodos e atributos. Esses atributos e métodos também não podem ser visualizados pelas classes herdadas.

## Atributos Privados
- Para tornar uma atributo privado é somente colocar a palavra Private.

## Void 
- A void palavra-chave especifica que um método não deve ter um valor de retorno.

## Construtor 
- São utilizados visando que os objetos tenham seus atributos inicializados na própria construção. Evita estados inconsistentes no objeto.
- Atributos recebidos no construtor tornam-se obrigatória.
- Se o construtor não for declarado na classe usa-se o padrão, que não recebe parâmetros.
- É possível chamada um construtor dentro de outro, para evitar duplicações de códigos e regras. Para isso usa-se o this( ) passando os parâmetros correspondentes ao construtor que se queira chamar.

## Getters e Setters
- São métodos usados ​​para proteger seus dados e tornar seu código mais seguro.
- Tornam o programador conveniente para definir e obter o valor para um tipo de dados específico.
- Oferecem a conveniência de inserir o valor das variáveis ​​de qualquer tipo de dados pelo requisito do código. Getters e setters permitem que você gerencie como variáveis ​​cruciais em seu código são acessadas e alteradas. 
- Para conveniência do programa, getter começa com a palavra “get” seguida do nome da variável e setters começa com a palavra “set” seguida do nome da variável.

- Setter define ou atualiza o valor (mutadores). Ele define o valor para qualquer variável usada nos programas de uma classe.
- Getter retorna o valor, retorna o valor do tipo de dados int, String, double, float, etc. 
