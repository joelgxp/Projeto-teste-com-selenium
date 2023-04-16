#language: pt
  Funcionalidade:Como usuário que possuo um espaço para anunciar
                  Quero poder ver informações sobre outros anunciantes e anunciar um próprio espaço
                  Para divulgar um espaço próprio


                  r1: Deve ter um botão "anuncie seu espaço" na tela principal que redirecione para uma outra tela com informações sobre outros anunciantes
                  r2: Na tela de anunciantes deve ter uma simulação de valor da hospedagem com critérios como: localização, tipo de quarto e quantidade de hospedes



    Cenario: valida se botao "anuncie seu espaço" redireciona para pagina correta
      Dado que usuario esta na homepage
      Quando clicar sobre o botao anuncie seu espaco
      Entao deverá ser redirecionado para pagina do anunciante
