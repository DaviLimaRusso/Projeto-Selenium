Feature: HG2R3 - Detalhes de um produto

  Scenario: Validar imagem do produto
    Given que estou na tela com o batom escolhido
    When  clico na imagem
    Then é aplicado um zoom no produto

  Scenario: Validar avaliações do produto
    Given que estou na tela com o batom escolhido
    When  clico em 'Avaliações'
    Then sou direcionado para 'Avaliações' com a classificação do produto

  Scenario: Validar programa de pontos do produto
    Given que estou na tela com o batom escolhido
    When  clico em '?' após 'Beaty Club'
    Then abre um pop-up com texto informativo sobre o programa de pontos

  Scenario: Validar link 'Ver descrição completa'
    Given que estou na tela com o batom escolhido
    When clico no link 'Ver descrição completa' ao lado direito da tela, abaixo da imagem
    Then sou direcionado para o texto informativo, na mesma tela, com as descrições do produto

  Scenario: Validar sugestões de produtos similares 'Você também vai amar esses aqui'
    Given que estou na tela com o batom escolhido
    When quando desço navegando pela pagina
    And encontro a opção 'Você também vai amar esses aqui'
    Then observo as sugestões do mesmo produto em outras cores
    And marcas

  Scenario: Validar 'Modo de Usar'
    Given que estou na tela com o batom escolhido
    When clico emm 'Modo de usar', abaixo da imagem do produto
    Then sou direcionado para o texto informativo, na mesma tela, de como utilizar o produto

  Scenario:  Validar 'Especificações'
    Given que estou na tela com o batom escolhido
    When clico emm 'Especificações', abaixo da imagem do produto
    Then sou direcionado para o texto informativo, na mesma tela, as especificações técnicas do produto

#  Scenario: Validar sugestão de novos itens em 'Combina muito com'
#    Given que estou na tela com o batom escolhido
#    When quando desço navegando pela pagina
#    And encontro a opção 'Combina muito com'
#    Then observo as sugestões de produtos diferentes, da mesma marca, para comprar junto
#
#  Scenario: Validar variação do produto
#    Given que estou na tela com o batom escolhido
#    When quando clico em uma das variações disponíveis do produto, a direita na tela, abaixo do valor
#    Then sou direcionado para tela com as informações da variação do produto.

