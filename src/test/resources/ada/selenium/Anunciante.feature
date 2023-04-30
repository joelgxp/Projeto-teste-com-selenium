#language: pt

Funcionalidade:Como usuário que possuo um espaço para anunciar
                  Quero poder ver informações sobre outros anunciantes e anunciar um próprio espaço
                  Para divulgar um espaço próprio

    @Smoke
    Cenario: validar se botao "anuncie seu espaço" redireciona para pagina correta
      Dado que usuario esta na homepage
      Quando clicar sobre o botao anuncie seu espaco
      Entao deverá ser redirecionado para pagina do anunciante

    @Smoke
    Cenario: Na tela de anunciantes deve ter uma simulação de valor da hospedagem com critérios como:
    localização, tipo de quarto e quantidade de hospedes
      Dado que na tela de anunciantes
      Quando clicar em simular o valor de hospedagens
      Entao deverá ter os campos localização, tipo de espaço, quantidades de quartos

    Cenario: validar se o botão "Anuncio Facil AirBnb" na tela do anunciante abre um modal contendo
    campos para realizar login ou se cadastrar
      Dado qua na tela do anunciante
      Quando clicar no botão Anuncio Facil AirBnb
      Entao devera abrir um modal Entrar ou cadastrar-se

  @Ignore
  Cenario: validar se o botão "Converse com o superhost" na tela do anunciante abre um modal contendo
    campos para realizar login ou se cadastrar
      Dado que na tela do aunciante
      Quando clicar no botão Converse com o superhost
      Entao deve abrir um modal Entrar ou cadastrar-se

    Cenario:
      Dado que o usuario esteja na pagina inicial e nao esteja logado
      Quando selecionar tipo de hospedagem
      Entao devera mostrar resultado de hospedagens conforme foi selecionado

    Cenario:
      Dado que o usuario esteja na pagina inicial
      Quando clicar no filtro em qualquer lugar
      Entao devera abrir um modal busque por regiao



