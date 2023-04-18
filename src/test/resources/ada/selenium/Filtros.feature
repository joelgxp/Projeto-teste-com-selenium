#language: pt

Funcionalidade: Filtros de exibição
  Como usuário, mesmo que não esteja logado,
  Quero poder filtrar hospedagens por diferentes classificações como: "Em frente a praia, Chalés, Lago, Em alta",
  Para encontrar hospedagens de acordo com o que procuro.

  @HG1R2
  Cenário: Verificar se o filtro padrão é "Em frente a praia"
    Dado que estou na página inicial do site www.airbnb.com
    Quando verifico o filtro padrão inicial
    Então a página deve exibir habitações e estadias em frente à praia

  Cenário: