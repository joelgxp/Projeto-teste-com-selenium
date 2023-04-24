<h1># Projeto de Testes com Selenium para o Site Airbnb</h1>
Este projeto foi desenvolvido durante o Curso de Automação de Testes do Santander Coders 2022. O objetivo do projeto é realizar testes automatizados para o site AirBnb utilizando o Chrome Driver, JUnit 5 e Cucumber.

<h3># Pré-requisitos</h3>
Antes de executar o projeto, é necessário ter instalado em sua máquina:

Java Development Kit (JDK).

Google Chrome.

Google Chrome Driver.

<h3># Configuração</h3>

Clone o repositório para sua máquina local:

Abra o projeto em uma IDE de sua preferência.

Configure o WebDriver:

options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = WebDriverManager.chromedriver().capabilities(options).create();

Importe as dependências do Maven:
JUnit jupiter,

Cucumber,

Webdrivermanager.


<h2># Funcionalidades testadas</h2>

As seguintes funcionalidades do site Airbnb são testadas neste projeto:

HG1R1 - Busca de hospedagens<br>
Como usuário, mesmo que não esteja logado, <br>
Quero realizar busca por ofertas de hospedagens por: região, data de checkin, data de checkout e disponibilidade para quantidade de hospedes<br>
Para encontrar hospedagens de acordo com o que procuro<br>
r1: Não é necessário informar todas informações<br>
r2: Deve ter opção flexível para datas e regiões<br>
r3: Mesmo que eu não informe nenhuma informação na busca, deve retornar sugestões de hospedagens<br><br>

HG1R2 - Filtros de exibição<br>
Como usuário, mesmo que não esteja logado<br>
Quero poder filtrar hospedagens por diferentes classificações como: "Em frente a praia, Chalés, Lago, Em alta"<br>
Para encontrar hospedagens de acordo com o que procuro<br>
r1: O filtro padrão deve ser "Em frente a praia"<br>
r2: Devo poder alternar entre os filtros e deve me retornar hospedagens de acordo com o que procuro<br>
r3: Ao clicar sobre o 'x' da sessão de Filtros, ela deve fechar e mostrar a página anterior<br><br>

HG1R3 - Acesso a detalhes de hospedagens<br>
Como usuário, mesmo que não esteja logado<br>
Quero poder visualizar detalhes de uma hospedagem<br>
Para ver mais informações da hospedagem selecionada<br>
r1: Ao clicar em uma hospedagem deve abrir os detalhes em uma nova guia<br>
r2: Nos detalhes deve conter informações sobre o que o lugar oferece, avaliação e comentários<br>
r3: Nos detalhes deve ter opção de fazer reserva e deve ter card informando valores da reserva<br><br>

HG1R4 - Anuncio de hospedagens (opcional, caso já tenha pensado em alguma outra história)<br>
Como usuário que possuo um espaço para anunciar<br>
Quero poder ver informações sobre outros anunciantes e anunciar um próprio espaço<br>
Para divulgar um espaço próprio<br>
r1: Deve ter um botão "anuncie seu espaço" na tela principal que redirecione para uma outra tela com informações sobre outros anunciantes<br>
r2: Na tela de anunciantes deve ter uma simulação de valor da hospedagem com critérios como: localização, tipo de quarto e quantidade de hospedes<br>
Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter<br><br>

