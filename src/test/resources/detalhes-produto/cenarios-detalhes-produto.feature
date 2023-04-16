Feature: HG2R3 - Detalhes de um produto

  Scenario: CT01 - Validar acesso a produto logado
    Given que logado acesso no site ''
    And  busco pelo produto
    When  clico em um dos produtos apresentados na tela
    Then sou direcionado para tela com os detalhes do produto escolhido

  Scenario: CT02 - Validar acesso a produto deslogado
    Given que deslogado acesso no site ''
    And  busco pelo produto
    When  clico em um dos produtos apresentados na tela
    Then sou direcionado para tela com os detalhes do produto escolhido

  Scenario: CT03 - Validar Tela o produto selecionado
    Given que busquei por um tipo de produto
    When  clico em um dos produtos apresentados na tela
    Then sou direcionado para tela com nome, imagem, marca, descrição, valor, variações do produto, campo com quantidade, botão 'Comparar', calculo do frete, link 'ver descrição completa' botão com os detalhes do produto escolhido
    And links 'Descrição', 'Modo de usar', 'Especificações', sugestão de outros produtos, avaliações de clientes, sugestão de compra junto, produtos patrocinados

  Scenario: CT04 - Validar imagem do produto
    Given que busquei por um tipo de produto
    When  clico em um dos produtos apresentados na tela
    Then sou direcionado para tela com as imagens de acordo com o produto escolhido

  Scenario: CT05 - Validar dados do pagamento do produto
    Given que busquei por um tipo de produto
    When  clico em um dos produtos apresentados na tela
    Then sou direcionado para tela com o produto, com valor ao lado direito da tela, com ou sem desconto
    And a pontuação gerada no Beauty Club

  Scenario: CT06 - Validar link 'Ver descrição completa'
    Given que estou na tela com o produto escolhido
    When clico no link 'Ver descrição completa' ao lado direito da tela, abaixo da imagem
    Then sou direcionado para o texto informativo, na mesma tela, com as descrições do produto

  Scenario: CT07 - Validar sugestões de produtos similares 'Você também vai amar esses aqui'
    Given que estou na tela com o produto escolhido
    When quando desço navegando pela pagina
    And encontro a opção 'Você também vai amar esses aqui'
    Then observo as sugestões do mesmo produto em outras cores
    And marcas

  Scenario: CT08 - Validar 'Modo de Usar'
    Given que estou na tela com o produto escolhido
    When clico emm 'Modo de usar', abaixo da imagem do produto
    Then sou direcionado para o texto informativo, na mesma tela, de como utilizar o produto

  Scenario: CT09 - Validar 'Especificações'
    Given que estou na tela com o produto escolhido
    When clico emm 'Especificações', abaixo da imagem do produto
    Then sou direcionado para o texto informativo, na mesma tela, as especificações técnicas do produto

  Scenario: CT10 - Validar sugestão de novos itens em 'Combina muito com'
    Given que estou na tela com o produto escolhido
    When quando desço navegando pela pagina
    And encontro a opção 'Combina muito com'
    Then observo as sugestões de produtos diferentes, da mesma marca, para comprar junto

  Scenario: CT11 - Validar variação do produto
    Given que estou na tela com o produto escolhido
    When quando clico em uma das variações disponíveis do produto, a direita na tela, abaixo do valor
    Then sou direcionado para tela com as informações da variação do produto

