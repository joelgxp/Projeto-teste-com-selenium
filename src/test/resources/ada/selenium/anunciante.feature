#language: pt

#HG1R1 - Busca de hospedagens
#Como usuário, mesmo que não esteja logado,
#Quero realizar busca por ofertas de hospedagens por: região, data de checkin, data de checkout e disponibilidade para quantidade de hospedes
#Para encontrar hospedagens de acordo com o que procuro
#
#r1: Não é necessário informar todas informações
#r2: Deve ter opção flexível para datas e regiões
#r3: Mesmo que eu não informe nenhuma informação na busca, deve retornar sugestões de hospedagens
#
#HG1R2 - Filtros de exibição
#Como usuário, mesmo que não esteja logado
#Quero poder filtrar hospedagens por diferentes classificações como: "Em frente a praia, Chalés, Lago, Em alta"
#Para encontrar hospedagens de acordo com o que procuro
#
#r1: O filtro padrão deve ser "Em frente a praia"
#r2: Devo poder alternar entre os filtros e deve me retornar hospedagens de acordo com o que procuro
#
#HG1R3 - Acesso a detalhes de hospedagens
#Como usuário, mesmo que não esteja logado
#Quero poder visualizar detalhes de uma hospedagem
#
#Para ver mais informações da hospedagem selecionada
#r1: Ao clicar em uma hospedagem deve abrir os detalhes em uma nova guia
#r2: Nos detalhes deve conter informações sobre o que o lugar oferece, avaliação e comentários
#r3: Nos detalhes deve ter opção de fazer reserva e deve ter card informando valores da reserva

Funcionalidade:Como usuário que possuo um espaço para anunciar
                  Quero poder ver informações sobre outros anunciantes e anunciar um próprio espaço
                  Para divulgar um espaço próprio


    @Smoke
    @1
    Cenario: validar se botao "anuncie seu espaço" redireciona para pagina correta
      Dado que usuario esta na homepage
      Quando clicar sobre o botao anuncie seu espaco
      Entao deverá ser redirecionado para pagina do anunciante

      @2
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

    Cenario:validar se o botão "Converse com o superhost" na tela do anunciante abre um modal contendo
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



