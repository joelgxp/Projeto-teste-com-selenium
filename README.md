# Projeto de Testes com Selenium para o Site Airbnb
Este projeto foi desenvolvido durante o Curso de Automação de Testes do Santander Coders 2022. O objetivo do projeto é realizar testes funcionais usando cucumber + selenium para o site AirBnb.

# Autores
Carla S. Nonaka - carlasnonaka

Elaine Lima S Seixas - ElaineLimaSeixas

Daniel de Mesquita - demesquitadaniel

Joel Souza - joelgxp

# Requisitos do projeto:

Cenários escritos em Gherkin

Priorização de execução de testes utilizando tags (Smoke, Regression, etc)

Sincronismo de testes

Geração de relatórios

Opcional: Captura de evidências em casos de erros (Screenshots)

# Pré-requisitos
Antes de executar o projeto, é necessário ter instalado em sua máquina:

Java Development Kit (JDK).

Google Chrome.

Google Chrome Driver.

# Configuração

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


# Funcionalidades testadas

As seguintes funcionalidades do site Airbnb são testadas neste projeto:

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
Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter

# Expressões de gratidão
Agradecimento ao professor do módulo sobre Selenium / Webdriver - Igor Dantas - igorfdantass.
