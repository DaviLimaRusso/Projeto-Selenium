Feature: Acessar o departamento de Perfumes e mostrar os mais vendidos

  Scenario: Acessar o departamento de Perfumes
    Given Levar aos Perfumes mais vendidos
    When Acessar o site e clicar no departamento de Perfumes
    Then Alterar para os produtos mais vendidos do departamento
