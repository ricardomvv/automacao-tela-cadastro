# Automação de Tela de Cadastro

Teste automatizado utilizando o Selenium WebDriver com a linguagem de programação Java e outras tecnologias.


<b>Pré-Requisitos:</b>

- Selenium 4.0.0;
- Instalar o JDK 17.

<b>Outras tecnologias utilizadas:</b>

- IntelliJ IDEA;
- Maven Repository;
- TestNG;
- JUnit.


<b>*Observação:</b> A versão do navegador precisa ser compatível com a versão do WebDriver para rodar os testes.
Versão ChromeDriver utilizada: 111.0.5563.64

<b>**Observação:</b> Formulário que contém um iframe, ou seja, permite incorporar uma página web dentro de uma outra página web.
No contexto da automação de testes com o Selenium em Java, os iframes podem ser um desafio para localizar e interagir com os elementos dentro deles, pois o Selenium opera em um único contexto de navegação. Então foi necessário alternar o contexto para o iframe correto usando o método switchTo().frame() antes de interagir com os elementos dentro do iframe.

<i><b>Versão:</b> <i>1.0.1</i>