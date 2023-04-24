
Feature: Busca de Produtos
Como usuário, mesmo que não esteja logado,
Quero realizar busca por produtos
Para encontrar o produto que tenho interesse

  Scenario: Ao digitar o nome de um determinado produto e não efetuar busca deve exibir uma sugestão de busca relacionada
  Given que estou na página inicial da Sephora
  When Digitar o nome do produto na barra de busca
  And  nao efetuar a busca
  Then Deve listar os produtos de busca relacionadas

  Scenario: Ao efetuar busca de produto, deve redirecionar para uma tela de resultados da busca realizada
    Given que estou na página inicial da Sephora
    When Digitar o produto desejado na barra de busca
    And  Apertar a tecla enter
    Then Devera abrir a tela de resultados da busca

Scenario: Na tela do resultado da busca deve informar a quantidade de produtos retornados e sugestões de buscas relacionadas
Given que estou na pagina de resultados de busca do produto
#Then Deve ver a quantidade de produtos retornados na pagina
#  And devo ver sugestoes de busca relacionadas ao produto
