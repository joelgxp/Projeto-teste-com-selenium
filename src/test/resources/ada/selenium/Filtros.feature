#language: pt

Funcionalidade:Como usuário, mesmo que não esteja logado,
  Quero poder filtrar hospedagens por diferentes classificações como:
  "Em frente a praia, Chalés, Lago, Em alta".
  Para encontrar hospedagens de acordo com o que procuro.


  Cenário: validar se o filtro padrão da página mostra propriedades na Praia
    Dado que estou na página inicial
    Entao o filtro carregado deve ser Praia

  Cenário: alternar entre os filtros de propriedades, que devem me retornar hospedagens de acordo com o que procuro
    Dado que estou na página inicial
    Quando eu clicar no filtro 'Castelos'
    Então a página deve mostrar propriedades do tipo Castelos
    E quando eu clicar sobre o filtro 'Microcasas'
    Então a página deve exibir propriedades do tipo Microcasas

  Cenário: verificar se a aba de filtros fecha após click no 'x'
    Dado que abro o link de filtros
    Quando clico no 'x' para fechar
    Então a aba de filtros se fecha