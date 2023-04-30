Feature: Adicionar produtos

  Scenario: Deslogado o usuário pode adicionar produtos no carrinho
    Given Acessou o site
    When Acessar um produto
    And apertar no botão "COMPRAR"
    Then Produto é adicionado em "MINHA SACOLA"

  Scenario: Ao clicar em "MINHA SACOLA" quero ver o valor total da minha compra
    Given Produtos adicionados em "MINHA SACOLA"
    When Acessar a "MINHA SACOLA"
    Then Aparecer o valor total dos produtos comprados

  Scenario: Ao selecionar um perfume quero que mostre nas variações as quantidades em ml oferecidas
    Given Acessou o site
    When Acessar um produto da categoria "Perfume"
    Then Aparecer as quantidades oferecidas do produto na área "VARIAÇÃO"

  Scenario: Dentro de "MINHA SACOLA" ao clicar em "remover" quero que o produto selecionado seja removido da lista
    Given Selecionou um produto para Compra
    When Entrar na sacola
    And clicar em remover
    Then Produto deverá ser removido da sacola

  Scenario: Dentro de "MINHA SACOLA", ao clicar no "+", deverá aumentar a quantidade do produto selecionado
    Given Selecionou um produto para Compra
    When Entrar na sacola
    And clicar no botao "+"
    Then A quantidade deve aumentar

  Scenario: Dentro de "MINHA SACOLA", ao clicar no "-" e a quantidade do produto for "1", nada acontecerá
    Given Selecionou um produto para Compra
    When Entrar na sacola
    And clicar no botao "-"
    Then A quantidade deve se manter até que seja adicionado mais de 1 quantidade do produto

  Scenario: Dentro de "MINHA SACOLA", ao selecionar o botão "FINALIZAR COMPRA", levar o usuário a tela de resumo
  do pedido
    Given Selecionou um produto para compra
    When Entrar na sacola
    And clicar no botao "FINALIZAR COMPRA"
    Then Ser direcionado para a área de checkout