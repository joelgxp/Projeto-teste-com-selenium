# Projeto-teste-com-selenium

Projeto final do curso Ada Tech de Automação de Testes.
O projeto consiste em realizar uma série de testes automatizados de funcionalidades, organização, filtros e retorno, e demais funções que julgamos necessários.

Website: https://www.airbnb.com.br/

AirBnb

O Airbnb é um serviço online comunitário para as pessoas anunciarem, descobrirem e reservarem acomodações e meios de hospedagem. A ferramente ainda permite aos indivíduos alugar o todo ou parte de sua própria casa, como uma forma de acomodação extra. O site fornece uma plataforma de busca e reservas entre a pessoa que oferece a acomodação e o turista que busca pela locação. Abrange mais de 500 mil anúncios em mais de 35.000 cidades e 192 países. Desde sua criação, em Novembro de 2008, até Junho de 2012, mais de 10 milhões de reservas foram agendadas via Airbnb.

fontes:
https://www.airbnb.com.br
https://pt.wikipedia.org/wiki/Airbnb

:: Ambiente de Testes ::

Histórias e cenários:

HG1R1 - Busca de hospedagens
Como usuário, mesmo que não esteja logado, 
Quero realizar busca por ofertas de hospedagens por: região, data de checkin, data de checkout e disponibilidade para quantidade de hospedes
Para encontrar hospedagens de acordo com o que procuro
r1: Não é necessário informar todas informações
r2: Deve ter opção flexível para datas e regiões
r3: Mesmo que eu não informe nenhuma informação na busca, deve retornar sugestões de hospedagens

HG1R2 - Filtros de exibição
Como usuário, mesmo que não esteja logado
Quero poder filtrar hospedagens por diferentes classificações como: "Em frente a praia, Chalés, Lago, Em alta"
Para encontrar hospedagens de acordo com o que procuro
r1: O filtro padrão deve ser "Em frente a praia"
r2: Devo poder alternar entre os filtros e deve me retornar hospedagens de acordo com o que procuro
r3: Ao refinar a busca o filtro deve retornar menos propriedades
(+)
r4: Tente filtrar por diferentes faixas de preço e verifique se os resultados correspondem ao que você esperava
r5: Verifique se os resultados exibidos correspondem aos tipos de propriedade selecionados
r6: Verifique se os resultados exibidos correspondem ao número de quartos selecionados
r7: Verifique se os resultados exibidos correspondem às comodidades selecionadas
r8: Verifique se os resultados exibidos correspondem à localização selecionada

HG1R3 - Acesso a detalhes de hospedagens
Como usuário, mesmo que não esteja logado
Quero poder visualizar detalhes de uma hospedagem
Para ver mais informações da hospedagem selecionada
r1: Ao clicar em uma hospedagem deve abrir os detalhes em uma nova guia
r2: Nos detalhes deve conter informações sobre o que o lugar oferece, avaliação e comentários
r3: Nos detalhes deve ter opção de fazer reserva e deve ter card informando valores da reserva

HG1R4 - Anuncio de hospedagens (opcional, caso já tenha pensado em alguma outra história)
Como usuário que possuo um espaço para anunciar
Quero poder ver informações sobre outros anunciantes e anunciar um próprio espaço
Para divulgar um espaço próprio
r1: Deve ter um botão "anuncie seu espaço" na tela principal que redirecione para uma outra tela com informações sobre outros anunciantes
r2: Na tela de anunciantes deve ter uma simulação de valor da hospedagem com critérios como: localização, tipo de quarto e quantidade de hospedes
