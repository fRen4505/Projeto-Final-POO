## Projeto feito em: 
    
    Java 22, usando SpringBoot versão 3.3.5 (SpringInitializr), com Gradle usando linguagem Kotlin.

    Se usa tambem as dependencias do Spring: OAuth2 Client, OAuth2 Authorization Server e Spring Security.

## O arquivo principal pra mexer mesmo esta no 
    src/main/Java/Projec 
## e esta separado no padrão MVC, com as pastas:

    -Model: aonde se interage com o banco de dados e aonde se tem as principais funcionalidades do projeto, utilidades e tals, nele tem tambem é aonde se mexe com os dados;

    -View: interface que exibe os dados que forem pedidos e o que se pode fazer (botões e etc);

    -Controller: as funções que de interação de certos elementos do view (botões e outros) para o Model, o Controller pega qualquer input inserido do View e manda para o Model.

## Para compilar/rodar com o gradlew, deve se abrir o terminal e inserir o seguinte comandos:

    .\gradlew build

    Se der certo deve se aparecer as pastas build e provavelmente bin, apos isso para rodar deve se inserir novamente no terminal:

    java -jar build\libs\Projec-test.jar

    Se tudo der certo ele ira executar o codigo no terminal, primeiro exibindo a logo do SpringBoot.

## Para verificar as informações de teste e quais erros teve, primeiro compile o codigo e entre na pasta build:

    Depois procure e entre na pasta reports e procure um:   index.html  E o abra para ver os erros, sua quantidade e mais informações.

## Coisas para fazer alem de programar:

    -1. Bolar nome certinho pro projeto;

    -2. Documentar e fazer um readMe;

    -3. So no final remover todos os arquivos temporarios, como este, os .git ,e etc;