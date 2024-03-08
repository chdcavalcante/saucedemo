#Projeto de automação - Saucedemo
Este é um projeto de automação de testes para o site https://www.saucedemo.com/

##Utilizamos as tecnologias
- Cumcumber: para escrita de casos de testes em linguagem gherkin.
- Selenium: para automatizar a interação com o site.
- WebDriverManager: Gerenciar a instalação e configuração do WebDriver.
- Padrão PageObjects: Para organizar e estruturar os elementos da interface do usuário em paginas.
- JUnit: para realizar as validações dos testes.

##Configuração do ambiente
Antes de executar os testes é necessario confugurar o ambiente de desenvolvimento. Certifique-se de ter as seguintes ferramentas instaladas.
- Java (JDK) preferencialmente na versão [11.0.17](https://www.oracle.com/java/technologies/javase/11-0-17-relnotes.html)
- Maven, preferencialmente na versão [3.9.4](https://maven.apache.org/docs/3.9.4/release-notes.html)
- Git, preferencialmente na versão [2.41.0](https://git-scm.com/download/win)
- Realizar as configurações das variaveis de ambiente.

##Instalação e execução
- clone o repositorio para seu ambiente local.
- Navegue até a raiz do projeto e execute o comando: mvn test -Dtest=Executa

##Relatório de testes
- Após a execução dos testes de automação, você pode acessar o relatorio gerado com informações sobre testes bem-sucedidos e falhas.
para acessar o relatorio nague ate a pasta target.
