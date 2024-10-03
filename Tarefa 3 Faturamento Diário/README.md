# Faturamento Diário

Este projeto calcula o menor, maior valor de faturamento diário e a quantidade de dias em que o faturamento diário foi superior à média mensal.

## Estrutura do Projeto

- `pom.xml`: Arquivo de configuração do Maven, que gerencia as dependências do projeto.
- `src/main/java/FaturamentoDiario.java`: Classe principal que contém a lógica do programa.
- `src/main/resources/faturamento.json`: Arquivo JSON que contém os dados de faturamento.

## Dependências

Este projeto utiliza a biblioteca `org.json` para manipulação de JSON. As dependências são gerenciadas pelo Maven. Para mais detalhes, consulte o arquivo `pom.xml`.

### Pré-requisitos

- Java 17
- Maven

### Passos para Compilar e Executar

1. Clone o repositório:

      ```sh
      git clone <URL_DO_REPOSITORIO>
      cd <NOME_DO_REPOSITORIO>

      ```

2. Compile o projeto:
   mvn clean install

3. Execute o projeto:
   mvn exec:java

### Resultados

O programa irá imprimir os seguintes resultados no console:

Menor valor de faturamento
Maior valor de faturamento
Número de dias com faturamento acima da média
